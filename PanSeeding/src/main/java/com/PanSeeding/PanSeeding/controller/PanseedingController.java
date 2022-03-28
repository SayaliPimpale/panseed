package com.PanSeeding.PanSeeding.controller;

import java.util.HashMap;

import org.apache.tomcat.util.json.JSONParser;
import org.apache.tomcat.util.json.ParseException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.PanSeeding.PanSeeding.model.PanSeeding;
import com.PanSeeding.PanSeeding.service.PanseedingService;


@RestController
public class PanseedingController {

	@Autowired
	private PanseedingService services;

	@SuppressWarnings("unchecked")
	@PostMapping("/Panseeding")
	public HashMap<String, Object> getUserApi(@RequestBody PanSeeding panSeeding) throws ParseException
	{
		System.out.println("without toString()" + panSeeding);
		String str =  this.services.consumeApi(panSeeding);
		JSONParser parser = new JSONParser(str);  
		HashMap<String, Object> json = (HashMap<String, Object>) parser.parse();
		
	    return json ;
	}
	
	
}
