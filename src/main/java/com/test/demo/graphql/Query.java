package com.test.demo.graphql;

import java.util.List;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.test.demo.DemoService;
import com.test.demo.dto.DemoDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Query implements GraphQLQueryResolver  {
    
    @Autowired
    private DemoService _demoService;

    public DemoDto getDemo(String id) {
        return _demoService.getDemo(id);
    }
    
    public List<DemoDto> allDemo(int count, int offset) {
        return _demoService.getDemos();
    }
} 