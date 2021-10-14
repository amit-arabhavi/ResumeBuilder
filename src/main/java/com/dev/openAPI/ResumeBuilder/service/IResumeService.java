package com.dev.openAPI.ResumeBuilder.service;

import com.dev.openAPI.ResumeBuilder.model.Resume;

public interface IResumeService {

	public byte[] generatePdf (Resume resume) throws Exception;
	
	public byte[] extractPdf()throws Exception;
}
