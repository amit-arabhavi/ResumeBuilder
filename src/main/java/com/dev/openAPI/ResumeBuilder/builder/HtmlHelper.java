package com.dev.openAPI.ResumeBuilder.builder;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import com.dev.openAPI.ResumeBuilder.model.Experiance;
import com.dev.openAPI.ResumeBuilder.model.Resume;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.itextpdf.styledxmlparser.jsoup.Jsoup;
import com.itextpdf.styledxmlparser.jsoup.nodes.Document;
import com.itextpdf.styledxmlparser.jsoup.nodes.Element;
public class HtmlHelper {

	TemplateEngine engine = new TemplateEngine();
	private static final String STYLE ="style";
	private static final String DISPLAY_NONE ="display:none";
	public String buildHtmlResume(Resume resume, File html) throws java.io.IOException {
		
		String process = "";
		final Document doc = Jsoup.parse(html,StandardCharsets.UTF_8.toString() );
		 Context context = ConvertObjectToContext(doc,resume);
		 if(resume.getAddressLine()!=null){
			 String address = resume.getAddressLine()+", "+(resume.getZip()!= null ? resume.getZip(): StringUtils.EMPTY)
					 +", "+(resume.getCity()!=null ? resume.getCity() : StringUtils.EMPTY);
			 context.setVariable("address", address);
		 }else
			 hideDiv(doc, "addressLine");
		 if(resume.getWorExperiance()!= null && resume.getWorExperiance().size() >0){
			 for(final Experiance exp : resume.getWorExperiance()){
				 if(exp.getEndDate()!=null && !StringUtils.isEmpty(exp.getEndDate()))
					 exp.setDuration(exp.getStartDate()+" - "+exp.getEndDate());
				 else
					 exp.setDuration(exp.getStartDate()+" - Present");
			 }
			 context.setVariable("worExperiance", resume.getWorExperiance());
		 }else
			 hideDiv(doc, "WorkExpDiv");
		 if(resume.getEducationalDetails() !=null && resume.getEducationalDetails().size() >0){
			 context.setVariable("educationalDetails", resume.getEducationalDetails());
		 }else
			 hideDiv(doc, "EducationDiv");
		 
		if(resume.getHobby()!=null && resume.getHobby().size() >0){
			context.setVariable("hobby", resume.getHobby());
		}else
			hideDiv(doc, "interestDiv");
		
		if(resume.getSkills()!=null && resume.getSkills().size()>0){
			context.setVariable("skills", resume.getSkills());
		}else
			hideDiv(doc, "skillDiv");
		if(resume.getLanguages()!=null && resume.getLanguages().size() > 0)
			context.setVariable("languages", resume.getLanguages());
		else
			hideDiv(doc, "languageDiv");
		 process = engine.process(doc.toString(), context);
		return process;
	}
	
	private void hideDiv(Document doc,String Id){
		Element elementById = doc.getElementById(Id);
		if(elementById!=null)
			elementById.attr(STYLE, DISPLAY_NONE);
	}
	
	private Context ConvertObjectToContext(Document doc, Resume resume){
		Context context = new Context();
		ObjectMapper mapper = new ObjectMapper();
		mapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
		HashMap<String,Object> convertValue = mapper.convertValue(resume, HashMap.class);
		for(Map.Entry<String, Object> entry : convertValue.entrySet()){
			if(entry.getValue()!=null){
				context.setVariable(entry.getKey(), entry.getValue());
			}else
				hideDiv(doc,entry.getKey());
		}
		return context;
	}
	
}
