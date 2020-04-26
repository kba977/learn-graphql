package com.kba977.learngraphql.resolver.query;

import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorQuery implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public Iterable<Author> findAllAuthors() {
        return authorService.list();
    }

    public int countAuthors() {
        return authorService.count();
    }
}
