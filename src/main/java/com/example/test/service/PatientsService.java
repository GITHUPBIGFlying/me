package com.example.test.service;

import com.example.test.entity.Patients;
import org.springframework.stereotype.Service;

@Service
public interface PatientsService {

    Patients getPatient(String accessPatId);
}
