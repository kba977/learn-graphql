package com.kba977.learngraphql.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tutorial {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String title;

    private String description;

    private Integer authorId;

    public Tutorial(String title, String description, Integer authorId) {
        this.title = title;
        this.description = description;
        this.authorId = authorId;
    }
}
