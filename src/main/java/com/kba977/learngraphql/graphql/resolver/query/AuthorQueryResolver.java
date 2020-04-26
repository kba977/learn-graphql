package com.kba977.learngraphql.graphql.resolver.query;

import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorQueryResolver implements GraphQLQueryResolver {

    @Autowired
    private AuthorService authorService;

    public Iterable<Author> findAllAuthors() {
        return authorService.list();
    }

    public Author findAuthorById(String id) {
        return authorService.getById(id);
    }

    public int countAuthors() {
        return authorService.count();
    }
}
