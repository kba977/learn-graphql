package com.kba977.learngraphql.graphql.resolver.query;

import com.kba977.learngraphql.model.Tutorial;
import com.kba977.learngraphql.service.TutorialService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TutorialQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private TutorialService tutorialService;

    public Iterable<Tutorial> findAllTutorials() {
        return tutorialService.list();
    }

    public Tutorial findTutorialById(Integer id) {
        return tutorialService.getById(id);
    }

    public int countTutorials() {
        return tutorialService.count();
    }
}
