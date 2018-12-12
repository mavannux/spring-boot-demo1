package com.test.demo.dto;

import com.test.demo.models.DemoEntity;

public class DemoDto {
    private String id;
    private String name;

    public DemoDto(){}

    public DemoDto(DemoEntity e) {
        this(e.getId(), e.getName());
    }

    public DemoDto(String id, String name) {
        this.id = id; 
        this.name = name;
    }
     
    public String getId(){ return id; }
    public String getName(){ return name; }
    
    public void setId(String id){ this.id = id; }
    public void setName(String name){ this.name = name; }

}