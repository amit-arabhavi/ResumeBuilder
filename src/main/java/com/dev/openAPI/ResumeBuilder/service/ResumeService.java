package com.dev.openAPI.ResumeBuilder.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.logging.Logger;

import org.springframework.stereotype.Service;

import com.dev.openAPI.ResumeBuilder.builder.HtmlHelper;
import com.dev.openAPI.ResumeBuilder.model.Resume;
import com.itextpdf.html2pdf.HtmlConverter;

@Service
public class ResumeService implements IResumeService{
	private static final Logger log = Logger.getLogger(ResumeService.class.getName());
	@Override
	public byte[] generatePdf (Resume resume) throws Exception  {
		File f= null;
		File pdf = new File("resume.pdf");
		String s = "";
			f = new File("resources/sample_1.html");
			if(!f.exists())
				throw new FileNotFoundException("File "+f.getAbsolutePath() +" Not found");
			
			s = new HtmlHelper().buildHtmlResume(resume, f);
			HtmlConverter.convertToPdf(s, new FileOutputStream(pdf));
		log.info("pdf Path : "+pdf.getAbsolutePath());
		return Files.readAllBytes(Paths.get(pdf.getAbsolutePath())); 
	}
	
	@Override
	public byte[] extractPdf() throws Exception {
		File pdf = new File("resume.pdf");
		
		return Files.readAllBytes(Paths.get(pdf.getAbsolutePath()));
	}
}
