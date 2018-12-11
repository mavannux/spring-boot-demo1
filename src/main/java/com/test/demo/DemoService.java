package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {

    @Autowired
    private DemoRepository _repo;

    public Iterable<DemoEntity> getDemoEntities() {
        return _repo.findAll();
    }

    public DemoEntity addDemoEntity(DemoEntity demoEntity) {
        return _repo.save(demoEntity);
    }

}