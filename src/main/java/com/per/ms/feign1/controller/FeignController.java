package com.per.ms.feign1.controller;

import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.per.ms.feign1.feigninterface.FeignClientInterface;

@RestController
public class FeignController {

    //@Autowired
/*	private FeignClientInterface feignClientInterface;
	
	@GetMapping(path="/getCountryName")
	public String getCountryName()  throws JSONException {
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("message", "Hello World");
		jsonObject.put("message-2", new JSONObject(feignClientInterface.getCountry()));
		return jsonObject.toString();
	}*/

    @RequestMapping("/get")
    public String getName() {
        return "Hello My name is Spring";
    }
}
