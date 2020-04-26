package com.kba977.learngraphql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kba977.learngraphql.mapper.TutorialMapper;
import com.kba977.learngraphql.model.Tutorial;
import com.kba977.learngraphql.service.TutorialService;
import org.springframework.stereotype.Service;

@Service
public class TutorialServiceImpl extends ServiceImpl<TutorialMapper, Tutorial> implements TutorialService {
}
