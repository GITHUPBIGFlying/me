package com.example.test.mapper;

import com.example.test.entity.Patients;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PatientsMapper {
    Patients getPatient(String accessPatId);
}
