package com.example.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("api/v1/data")
public class Controller {
      
	@ResponseBody
	public String mymethod() {
		return "Its my method";
	}
}

