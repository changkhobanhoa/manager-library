package model;

public class TaiKhoan {
	private String matk;
	private String username;
	private String password;

	public TaiKhoan() {

	}

	public TaiKhoan(String matk, String username, String password) {
		super();
		this.matk = matk;
		this.username = username;
		this.password = password;
	}

	public String getMatk() {
		return matk;
	}

	public void setMatk(String matk) {
		this.matk = matk;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
