package com.test.demo.graphql;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.test.demo.DemoService;
import com.test.demo.dto.DemoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Mutation implements GraphQLMutationResolver {

    @Autowired
    private DemoService _demoService;

    public DemoDto createDemo(DemoDto demoDto) {
        return _demoService.addDemo(demoDto);
    }
    
}