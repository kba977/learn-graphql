package com.kba977.learngraphql.resolver.mutation;

import com.kba977.learngraphql.model.Tutorial;
import com.kba977.learngraphql.service.TutorialService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TutorialMutation implements GraphQLMutationResolver {

    @Autowired
    private TutorialService tutorialService;

    public Tutorial createTutorial(String title, String description, Integer authorId) {
        Tutorial tutorial = new Tutorial(title, description, authorId);
        tutorialService.save(tutorial);
        return tutorial;
    }

    public boolean deleteTutorial(Integer id) {
        return tutorialService.removeById(id);
    }

    public Tutorial updateTutorial(Integer id, String title, String description) throws NotFoundException {
        Optional<Tutorial> optTutorial = Optional.ofNullable(tutorialService.getById(id));

        if (optTutorial.isPresent()) {
            Tutorial tutorial = optTutorial.get();
            if (title != null) {
                tutorial.setTitle(title);
            }
            if (description != null) {
                tutorial.setDescription(description);
            }
            tutorialService.updateById(tutorial);
            return tutorial;
        }
        throw new NotFoundException("Not found Tutorial to update!");
     }
}
