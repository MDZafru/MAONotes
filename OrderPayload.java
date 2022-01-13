package com.example.MAONotes.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class OrderPayload {
	
	private static final Logger log = LoggerFactory.getLogger(OrderPayload.class);
	

	@PostMapping("/display")
	public void showPayload(@RequestBody Object payload) {
		log.info(payload.toString());
		
	}
}
