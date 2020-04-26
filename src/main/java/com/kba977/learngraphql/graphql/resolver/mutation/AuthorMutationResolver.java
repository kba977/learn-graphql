package com.kba977.learngraphql.graphql.resolver.mutation;

import com.kba977.learngraphql.graphql.type.author.CreateAuthorInput;
import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.service.AuthorService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AuthorMutationResolver implements GraphQLMutationResolver {

    @Autowired
    private AuthorService authorService;

    public Author createAuthor(CreateAuthorInput input) {
        Author author = new Author(input.getName(), input.getAge());
        authorService.save(author);
        return author;
    }
}
