package com.kba977.learngraphql.resolver.mutation;

import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutation implements GraphQLMutationResolver {

    @Autowired
    private AuthorService authorService;

    public Author createAuthor(String name, Integer age) {
        Author author = new Author(name, age);
        authorService.save(author);
        return author;
    }
}
