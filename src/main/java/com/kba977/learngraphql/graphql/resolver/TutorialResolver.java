package com.kba977.learngraphql.graphql.resolver;

import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.model.Tutorial;
import com.kba977.learngraphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class TutorialResolver implements GraphQLResolver<Tutorial> {

    @Autowired
    private AuthorService authorService;

    public Author getAuthor(Tutorial tutorial) {
        return Optional.ofNullable(authorService.getById(tutorial.getAuthorId())).orElse(null);
    }
}
