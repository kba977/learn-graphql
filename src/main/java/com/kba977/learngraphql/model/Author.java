package com.kba977.learngraphql.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String name;

    private Integer age;

    public Author(String name, Integer age) {
        this.name = name;
        this.age = age;
    }
}
