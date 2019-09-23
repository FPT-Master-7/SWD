package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Entity
@Table(name = "USER")
@ApiModel(description = "All details about the User.")
public class User {
	@Id
	@ApiModelProperty(notes = "ID of the user")
	private int id;
	@Column(name = "fullname", length = 30, nullable = false)
	@ApiModelProperty(notes = "Fullname of the user")
	private String fullname;
	@Column(name = "username", length = 30, nullable = false)
	@ApiModelProperty(notes = "Username user for login")
	private String username;
	@Column(name = "password", length = 30, nullable = false)
	@ApiModelProperty(notes = "Password of the user")
	private String password;
	@Column(name = "email", length = 30, nullable = false)
	@ApiModelProperty(notes = "Email of the user")
	private String email;
	public User() {
		super();
	}
	public User(int id, String fullname, String username, String password, String email) {
		super();
		this.id = id;
		this.fullname = fullname;
		this.username = username;
		this.password = password;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
