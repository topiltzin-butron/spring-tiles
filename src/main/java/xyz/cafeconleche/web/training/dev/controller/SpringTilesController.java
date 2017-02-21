package xyz.cafeconleche.web.training.dev.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SpringTilesController {

	@RequestMapping("/home")
	public ModelAndView home() {
		return getModelAndView("home");
	}
	
	@RequestMapping("/wrong")
	public ModelAndView wrong() {
		return getModelAndView("home.wrong");
	}
	
	@RequestMapping("/services")
	public ModelAndView services() {
		return getModelAndView("services");
	}
	
	@RequestMapping("/products")
	public ModelAndView products() {
		return getModelAndView("products");
	}
	
	@RequestMapping("/clients")
	public ModelAndView clients() {
		return getModelAndView("clients");
	}
	
	@RequestMapping("/contact")
	public ModelAndView contact() {
		return getModelAndView("contact");
	}

	private ModelAndView getModelAndView(String viewName) {
		ModelAndView mav = new ModelAndView(viewName);
		mav.addObject("date", new Date());
		return mav;
	}
	
}
