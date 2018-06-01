package com.example.test.entity;

public class PacsCache {
    private Integer pacId;

    private String sheetId;

    private String patientId;

    private String accessPatId;

    private String clientId;

    public PacsCache(Integer pacId, String sheetId, String patientId, String accessPatId, String clientId) {
        this.pacId = pacId;
        this.sheetId = sheetId;
        this.patientId = patientId;
        this.accessPatId = accessPatId;
        this.clientId = clientId;
    }

    public PacsCache() {
        super();
    }

    public Integer getPacId() {
        return pacId;
    }

    public void setPacId(Integer pacId) {
        this.pacId = pacId;
    }

    public String getSheetId() {
        return sheetId;
    }

    public void setSheetId(String sheetId) {
        this.sheetId = sheetId == null ? null : sheetId.trim();
    }

    public String getPatientId() {
        return patientId;
    }

    public void setPatientId(String patientId) {
        this.patientId = patientId == null ? null : patientId.trim();
    }

    public String getAccessPatId() {
        return accessPatId;
    }

    public void setAccessPatId(String accessPatId) {
        this.accessPatId = accessPatId == null ? null : accessPatId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }
}