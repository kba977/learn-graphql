package com.kba977.learngraphql.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.kba977.learngraphql.model.Tutorial;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TutorialMapper extends BaseMapper<Tutorial> {
}
