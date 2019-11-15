package project.Buy.P002.D003.vo;

import org.springframework.stereotype.Component;

@Component("B_P002_D003VO")
public class B_P002_D003VO {


	private String photo1; // prodphoto
	private String prod_name;//
	
	// cart Info
	private String member_ID;
	private String prod_number;
	private int cart_count;
	private int option_number;
	private int cart_list_number;
	
	
	
	
	public B_P002_D003VO() {
		System.out.println("B_P002_D003VO 호출");
	}
	public String getPhoto1() {
		return photo1;
	}
	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}
	public String getProd_name() {
		return prod_name;
	}
	public void setProd_name(String prod_name) {
		this.prod_name = prod_name;
	}
	public String getMember_ID() {
		return member_ID;
	}
	public void setMember_ID(String member_ID) {
		this.member_ID = member_ID;
	}
	public String getProd_number() {
		return prod_number;
	}
	public void setProd_number(String prod_number) {
		this.prod_number = prod_number;
	}
	public int getOption_number() {
		return option_number;
	}
	public void setOption_number(int option_number) {
		this.option_number = option_number;
	}
	public int getCart_list_number() {
		return cart_list_number;
	}
	public void setCart_list_number(int cart_list_number) {
		this.cart_list_number = cart_list_number;
	}
	public int getCart_count() {
		return cart_count;
	}
	public void setCart_count(int cart_count) {
		this.cart_count = cart_count;
	}
	
}
	