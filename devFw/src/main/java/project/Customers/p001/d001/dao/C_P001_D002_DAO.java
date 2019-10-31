package project.Customers.p001.d001.dao;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.dao.DataAccessException;
import org.springframework.transaction.annotation.Transactional;

import project.Customers.p001.d001.vo.C_P001_D002_VO;
import project.hm.p0001.vo.P0001VO;

public interface C_P001_D002_DAO {
	// 아이디 중복 검사
		public int check_id(String memberid) throws Exception;
		//이메일 중복
	    public int check_email(String email) throws Exception;
		// 회원가입
		public int join_member(C_P001_D002_VO member) throws Exception;
		//이메일인증
		public int approval_member(C_P001_D002_VO member) throws Exception;
		public C_P001_D002_VO login(String memberid) throws Exception;
		public int update_log(String memberid) throws Exception;

	 
}