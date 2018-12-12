package com.test.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.test.demo.dto.*;
import com.test.demo.models.DemoEntity;

@Service
public class DemoService {

    @Autowired
    private DemoRepository _repo;

    public DemoDto getDemo(String id) {
        Optional<DemoEntity> demoDb = _repo.findById(id);
        if (demoDb.isPresent()) return new DemoDto(demoDb.get());
        return null;
    }

    public List<DemoDto> getDemos() {
        Iterable<DemoEntity> list = _repo.findAll();
        List<DemoDto> res = new ArrayList<DemoDto>();

        for (DemoEntity entity : list) {
            res.add(new DemoDto(entity.getId(), entity.getName()));
        }
        return res;
    }

    public DemoDto addDemo(DemoDto demoDto) {
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId(demoDto.getId());
        demoEntity.setName(demoDto.getName());
        return new DemoDto(_repo.save(demoEntity));
    }

}