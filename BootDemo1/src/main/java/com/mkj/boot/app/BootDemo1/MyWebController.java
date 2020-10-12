package com.mkj.boot.app.BootDemo1;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

class Dog{}
@RestController
public class MyWebController {
 
	Logger logger = LoggerFactory.getLogger(MyWebController.class);
	
	@GetMapping("/api/greetings")  // localhost:8080/api/greetings
	public String doThings()
	{
		// 1000 lines of code
		Dog d = null;
		  logger.error("This is the  error logs Dog "+d); 
		  logger.info("This is the info logs"); 
		  logger.warn("This is the warning logs");
		  logger.trace("This is the trace logs");
		
		return "This is Hello Controller";
	}
}
