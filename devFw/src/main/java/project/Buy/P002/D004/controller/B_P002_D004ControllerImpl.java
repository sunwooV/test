package project.Buy.P002.D004.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller("B_P002_D004Controller")
public class B_P002_D004ControllerImpl implements B_P002_D004Controller {
	private static final Logger Logger = LoggerFactory.getLogger(B_P002_D004ControllerImpl.class);
	
	
	@Override
	@RequestMapping(value="/reviewComplete.do", method= {RequestMethod.GET,RequestMethod.POST})
	public ModelAndView review(HttpServletRequest request) throws IOException {
		request.setCharacterEncoding("utf-8");
		ModelAndView mav = new ModelAndView("Buy/p002_d004_reviewWriteComplete");
		return mav;
	}

	
}