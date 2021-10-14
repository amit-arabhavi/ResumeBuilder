package com.dev.openAPI.ResumeBuilder.Controller;

import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dev.openAPI.ResumeBuilder.model.Resume;
import com.dev.openAPI.ResumeBuilder.service.IResumeService;

@RestController
public class ResumeController {
	private static final Logger LOG = Logger.getLogger(ResumeController.class.getName());
	@Autowired
	IResumeService service;
	
	@RequestMapping(value ="/init", method = RequestMethod.POST,consumes=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<byte[]> init(Resume resume) throws Exception{
		LOG.info("calling in started resume");
		byte[] input =service.generatePdf(resume);
		HttpHeaders header= new HttpHeaders();
		header.setAccessControlAllowOrigin("*");
		header.add("Content-Disposition", "attachment; filename=resume.pdf");
		return ResponseEntity.ok().headers(header).body(input);
	}
	
	@RequestMapping(value ="/getPdf", method = RequestMethod.GET)
	public ResponseEntity<byte[]> extract() throws Exception{
		LOG.info("calling in started resume");
		byte[] input =service.extractPdf();
		HttpHeaders header= new HttpHeaders();
		header.setAccessControlAllowOrigin("*");
		header.add("Content-Disposition", "attachment; filename=resume.pdf");
		return ResponseEntity.ok().headers(header).body(input);
	} 
}
