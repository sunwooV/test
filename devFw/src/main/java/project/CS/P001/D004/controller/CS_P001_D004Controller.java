package project.CS.P001.D004.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;

public interface CS_P001_D004Controller {

	ModelAndView cs(HttpServletRequest request, HttpServletResponse response) throws Exception;


}