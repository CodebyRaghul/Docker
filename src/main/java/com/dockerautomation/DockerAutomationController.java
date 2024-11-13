package com.dockerautomation;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/DockerAutomation")
public class DockerAutomationController {
	
	@GetMapping(value="/get")
	public String get()
	{
		return "i am docker automation";
	}

}
