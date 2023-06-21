package com.springbootapiawss3.service.api;

import org.springframework.web.multipart.MultipartFile;

public interface AWSS3Service {

    void uploadFile(MultipartFile file);

}
