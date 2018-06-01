package com.example.test.service;

import com.example.test.entity.PacsCache;
import com.example.test.springBootDBConfig.DS;
import org.springframework.stereotype.Service;

@Service
public interface PacsCacheService {

    PacsCache getPacsCache(String accessPatId);
}
