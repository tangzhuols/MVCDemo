package com.xq.mvc.pojo;

public class User {
	private int id;
	private String phone_number;
	private String username;
	private String sex;
	private String photo;
	private String money;
	private String bank; // ÒøÐÐÃû³Æ
	private String bank_setting;

	public User() {
		super();
	}

	public User(int id, String phone_number, String username, String sex,
			String photo, String money, String bank, String bank_setting) {
		super();
		this.id = id;
		this.phone_number = phone_number;
		this.username = username;
		this.sex = sex;
		this.photo = photo;
		this.money = money;
		this.bank = bank;
		this.bank_setting = bank_setting;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", phone_number=" + phone_number
				+ ", username=" + username + ", sex=" + sex + ", photo="
				+ photo + ", money=" + money + ", bank=" + bank
				+ ", bank_setting=" + bank_setting + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPhone_number() {
		return phone_number;
	}

	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public String getMoney() {
		return money;
	}

	public void setMoney(String money) {
		this.money = money;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getBank_setting() {
		return bank_setting;
	}

	public void setBank_setting(String bank_setting) {
		this.bank_setting = bank_setting;
	}

}
