package org.leah.xml.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HollaController {

	@RequestMapping(method = RequestMethod.GET)
	public String holla(ModelMap model) {
		model.addAttribute("msg", "Hi Leah, welcome to Spring 4 MVC Platform");
		return "holla";
	}

	@RequestMapping(value = "/ciao", method = RequestMethod.GET)
	public String ciao(ModelMap model) {
		model.addAttribute("msg", "Ciao Leah, welcome to Spring 4 MVC Platformm");
		return "ciao";
	}
}
