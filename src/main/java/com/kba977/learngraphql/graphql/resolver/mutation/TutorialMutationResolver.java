package com.kba977.learngraphql.graphql.resolver.mutation;

import com.kba977.learngraphql.graphql.type.tutorial.CreateTutorialInput;
import com.kba977.learngraphql.graphql.type.tutorial.UpdateTutorialInput;
import com.kba977.learngraphql.model.Tutorial;
import com.kba977.learngraphql.service.TutorialService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TutorialMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private TutorialService tutorialService;

    public Tutorial createTutorial(CreateTutorialInput input) {
        Tutorial tutorial = new Tutorial(input.getTitle(), input.getDescription(), input.getAuthorId());
        tutorialService.save(tutorial);
        return tutorial;
    }

    public Tutorial updateTutorial(Integer id, UpdateTutorialInput input) throws NotFoundException {
        Optional<Tutorial> optTutorial = Optional.ofNullable(tutorialService.getById(id));

        if (optTutorial.isPresent()) {
            Tutorial tutorial = optTutorial.get();
            BeanUtils.copyProperties(input, tutorial);
            tutorialService.updateById(tutorial);

            return tutorialService.getById(id);
        }
        throw new NotFoundException("Not found Tutorial to update!");
     }

    public boolean deleteTutorial(Integer id) {
        return tutorialService.removeById(id);
    }
}
