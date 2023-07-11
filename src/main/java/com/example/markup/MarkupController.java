package com.example.markup;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MarkupController {

	@RequestMapping("/markup1")
	public String markup01() {
		return "markup/markup01";
	}
}
