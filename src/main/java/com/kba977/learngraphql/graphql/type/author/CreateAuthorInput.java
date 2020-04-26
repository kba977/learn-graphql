package com.kba977.learngraphql.graphql.type.author;

import lombok.Data;

@Data
public class CreateAuthorInput {
    private String name;
    private Integer age;
}
