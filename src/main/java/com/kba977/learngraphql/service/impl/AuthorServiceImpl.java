package com.kba977.learngraphql.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kba977.learngraphql.mapper.AuthorMapper;
import com.kba977.learngraphql.model.Author;
import com.kba977.learngraphql.service.AuthorService;
import org.springframework.stereotype.Service;

@Service
public class AuthorServiceImpl extends ServiceImpl<AuthorMapper, Author> implements AuthorService {
}
