package com.test.demo;

import org.springframework.data.repository.CrudRepository;

import com.test.demo.models.*;

public interface DemoRepository extends CrudRepository<DemoEntity, String> {

}