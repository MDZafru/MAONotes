package com.example.MAONotes.Controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class NotesController {
	
	private static final Logger log = LoggerFactory.getLogger(NotesController.class);
	
	
	@GetMapping("/indexPath/{data}")
	public String index(@PathVariable("data") String data,Model model) {
		
		log.info("Inside indexPath call");
		
		model.addAttribute("data",data );
		return "Notes";
	}
	
	@GetMapping("/indexParam")
	public String indexWithParam(@RequestParam(name = "id") String data,Model model) {
		
		log.info("Inside indexParam call");
		
		model.addAttribute("data",data );
		return "Notes";
	}
	

}
