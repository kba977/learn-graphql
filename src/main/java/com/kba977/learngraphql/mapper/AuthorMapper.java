package com.kba977.learngraphql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kba977.learngraphql.model.Author;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AuthorMapper extends BaseMapper<Author> {
}
