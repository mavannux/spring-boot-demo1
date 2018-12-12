package com.test.demo;

import java.util.List;

import com.test.demo.dto.DemoDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoService _demoService;

    private final Logger _log = LoggerFactory.getLogger(DemoController.class);

    @RequestMapping("/demo")
    public List<DemoDto> getAll() {
        return _demoService.getDemos();
    }

    @RequestMapping(method= RequestMethod.POST, value="/demo")
    public DemoDto addDemoEntity(@RequestBody DemoDto demoDto) {
        return _demoService.addDemo(demoDto);
    }

}