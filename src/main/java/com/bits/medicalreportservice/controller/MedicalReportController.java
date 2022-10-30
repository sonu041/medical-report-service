package com.bits.medicalreportservice.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bits.medicalreportservice.model.MedicalReportDetails;

@RestController
@RequestMapping("/medical-report")
public class MedicalReportController {
	
	@RequestMapping("/{medicalReportID}")
	public MedicalReportDetails getDoctor(@PathVariable("medicalReportID") String medicalReportID)
	{
		return new MedicalReportDetails(1, 1, "Covid Negative");
	}

}
