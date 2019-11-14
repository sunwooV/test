package project.FleaMarket.P001.D002.vo;

import java.sql.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component("F_P001_D002VO")
public class F_P001_D002VO {
	private String flea_code = "";
	private String flea_group = "";
	private String join_name = "";
	private String join_phonenumber = "";
	private String join_email = "";
	private String join_companynumber = "";
	private String join_product = "";
	private String join_sns = "";
	private String join_etc = "";
	private Date join_date;
	private String join_status = "";
	
	public F_P001_D002VO() {
		System.out.println("MemberVO 생성자 호출");
	}

	public String getJoin_name() {
		return join_name;
	}

	public void setJoin_name(String join_name) {
		this.join_name = join_name;
	}

	public String getJoin_phonenumber() {
		return join_phonenumber;
	}

	public void setJoin_phonenumber(String join_phonenumber) {
		this.join_phonenumber = join_phonenumber;
	}

	public String getJoin_email() {
		return join_email;
	}

	public void setJoin_email(String join_email) {
		this.join_email = join_email;
	}

	public String getJoin_companynumber() {
		return join_companynumber;
	}

	public void setJoin_companynumber(String join_companynumber) {
		this.join_companynumber = join_companynumber;
	}

	public String getJoin_product() {
		return join_product;
	}

	public void setJoin_product(String join_product) {
		this.join_product = join_product;
	}

	public String getJoin_sns() {
		return join_sns;
	}

	public void setJoin_sns(String join_sns) {
		this.join_sns = join_sns;
	}

	public String getJoin_etc() {
		return join_etc;
	}

	public void setJoin_etc(String join_etc) {
		this.join_etc = join_etc;
	}


	public Date getJoin_date() {
		return join_date;
	}

	public void setJoin_date(Date join_date) {
		this.join_date = join_date;
	}

	public String getJoin_status() {
		return join_status;
	}

	public void setJoin_status(String join_status) {
		this.join_status = join_status;
	}

	public String getFlea_code() {
		return flea_code;
	}

	public void setFlea_code(String flea_code) {
		this.flea_code = flea_code;
	}

	public String getFlea_group() {
		return flea_group;
	}

	public void setFlea_group(String flea_group) {
		this.flea_group = flea_group;
	}


}