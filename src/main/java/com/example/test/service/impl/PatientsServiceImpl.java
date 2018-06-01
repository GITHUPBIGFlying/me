package com.example.test.service.impl;

import com.example.test.entity.Patients;
import com.example.test.mapper.PatientsMapper;
import com.example.test.service.PatientsService;
import com.example.test.springBootDBConfig.DS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientsServiceImpl implements PatientsService {

    @Autowired
    private PatientsMapper patientsMapper;
    //使用数据源 postgre查询
    @DS("postgresql")
    @Override
    public Patients getPatient(String accessPatId) {
        return patientsMapper.getPatient(accessPatId);
    }
}
