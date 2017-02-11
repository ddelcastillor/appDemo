package com.autentia.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.autentia.demo.service.SampleService;

@RestController
public class SampleController {

    @Autowired
    private SampleService sampleService;

    public SampleController(SampleService sampleService) {
        this.sampleService = sampleService;
    }

    @RequestMapping(value = "/validate/{nif}", method = RequestMethod.GET)
    public String validate(
            @PathVariable("nif") String nif
    ) 
    {
        return sampleService.validate(nif);
    }
}