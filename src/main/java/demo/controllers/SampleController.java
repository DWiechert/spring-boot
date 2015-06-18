package demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		return "Hello World!";
	}
}
