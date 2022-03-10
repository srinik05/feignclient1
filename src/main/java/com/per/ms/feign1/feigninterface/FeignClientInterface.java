package com.per.ms.feign1.feigninterface;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

//url="http://localhost:2002/getUserDetails"
//@FeignClient(name="microserviceversion2")
public interface FeignClientInterface {

	/*@RequestMapping(value="/getCountry")
	public String getCountry();*/
}
