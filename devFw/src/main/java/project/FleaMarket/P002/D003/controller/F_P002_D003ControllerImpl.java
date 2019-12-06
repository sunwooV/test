package project.FleaMarket.P002.D003.controller;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.io.FileUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import project.FleaMarket.P002.D001.service.F_P002_D001Service;
import project.FleaMarket.P002.D003.dao.F_P002_D003DAO;
import project.FleaMarket.P002.D003.service.F_P002_D003Service;
import project.FleaMarket.P002.D003.vo.F_P002_D003VO;
import project.Sell.P001.D003.vo.S_P001_D003VO;

@Controller("F_P002_D003Controller")
public class F_P002_D003ControllerImpl implements F_P002_D003Controller {
	private static final Logger logger = LoggerFactory.getLogger(F_P002_D003ControllerImpl.class);
	@Autowired
	F_P002_D003Service d003Service;
	@Autowired
	F_P002_D001Service d001Service;
	@Autowired
	F_P002_D003VO d003VO;
	
	@Override
	@RequestMapping(value = "/fleaStory.do", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView fleaStory(@RequestParam(value="p_id", required=false) String p_id, @RequestParam(value="flea_code", required=false) String flea_code, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		Map<String, Object> searchMap = new HashMap<String, Object>();
		
		searchMap.put("p_id", p_id);	 
		System.out.println("p_id=" + p_id);
		
		searchMap.put("flea_code", flea_code);	 
		System.out.println("flea_code =" +flea_code);
		
		List list = d001Service.searchList(searchMap);
		List storyList = d003Service.storyList(searchMap);
		
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===========================storyList:::");
		
		for(int i = 0; i < storyList.size(); i++)
		{
			System.out.println(storyList.get(i));
		}
		System.out.println("ddddd");
		
		ModelAndView mav = new ModelAndView("FleaMarket/p002_d003_fleaStory");
		mav.addObject("searchList", list);
		mav.addObject("reviewList", storyList);
		return mav;
	}

	@Override
	@RequestMapping(value = "/storyComment.do", method = { RequestMethod.GET, RequestMethod.POST })
	public void storyComment(HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		List commentList = null;
		String result = "";
		
		Map<String, Object> dataMap = new HashMap<String, Object>(); //insert data
		Enumeration enu = request.getParameterNames();
		//parameter로 넘어온 값들을 dataMap이라는 Map에 저장한다.
		while (enu.hasMoreElements()) { 
			String name = (String)enu.nextElement();
			String value = request.getParameter(name);
			dataMap.put(name, value);
			System.out.println(dataMap);
		}
		
		System.out.println("===============storyComment:::::");
		
		String command = (String) dataMap.get("command");
		System.out.println("===========storyComment:::command:::"+command);
		
		
		if(command.equals("insert")) { //질문사항 등록일 경우
			System.out.println("====INSERT====");
			d003Service.inserStoryComment(dataMap);
		} 
		/*
		//else { //질문사항 삭제일 경우
		//	d003Service.deleteQnA(dataMap);
		//}
		
		prodQnA = S_P001_D003Service.selectQnA(searchMap);
		System.out.println(prodQnA);
		
		result += "[";
		for(int i=0;i<prodQnA.size();i++) {
			result += "{";
			result += "\"prod_number\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getProd_number() + "\",";
			result += "\"qna_number\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getQna_number() + "\",";
			result += "\"qna_content\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getQna_content() + "\",";
			result += "\"qna_date\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getQna_date() + "\",";
			result += "\"memberId\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getMemberId() + "\",";
			result += "\"secretMember\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getSecretMember() + "\",";
			result += "\"answer_yn\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getAnswer_yn() + "\",";
			result += "\"answer_date\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getAnswer_date() + "\",";
			result += "\"answer_content\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getAnswer_content() + "\",";
			result += "\"secret_yn\":\"" + ((S_P001_D003VO)prodQnA.get(i)).getSecret_yn() + "\"";
			
			result += "}";
			if(i != prodQnA.size() -1) {
				result += ", ";
			}
		}
		result += "]";
		System.out.println("result ::::: " + result);
		//String personJson = "[{\"id\":\""+"0" +"\",\"name\":\""+"dd" +"\",\"password\":\""+"bb" +"\",\"email\":\""+"pp"+"\"}, {\"id\":\""+"123" +"\",\"name\":\""+"dd" +"\",\"password\":\""+"bb" +"\",\"email\":\""+"pp"+"\"}]";
		//System.out.println(personJson);
		
		*/
		try {	
			response.getWriter().print(result);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	

}
