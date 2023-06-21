package com.springbootapiawss3.controller;

import com.springbootapiawss3.service.api.AWSS3Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/s3/upload")
public class UploadFileController {

    @Autowired
    private AWSS3Service awss3Service;
}
