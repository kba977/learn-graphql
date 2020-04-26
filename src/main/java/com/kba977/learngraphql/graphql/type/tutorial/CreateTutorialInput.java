package com.kba977.learngraphql.graphql.type.tutorial;

import lombok.Data;

@Data
public class CreateTutorialInput {
    private String title;
    private String description;
    private Integer authorId;
}
