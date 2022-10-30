package com.bits.medicalreportservice.model;

public class MedicalReportDetails {
	private int reportId;
	private int patientId;
	private String reportDetails;
	public MedicalReportDetails(int reportId, int patientId, String reportDetails) {
		super();
		this.reportId = reportId;
		this.patientId = patientId;
		this.reportDetails = reportDetails;
	}
	public int getReportId() {
		return reportId;
	}
	public void setReportId(int reportId) {
		this.reportId = reportId;
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getReportDetails() {
		return reportDetails;
	}
	public void setReportDetails(String reportDetails) {
		this.reportDetails = reportDetails;
	}
	

}
