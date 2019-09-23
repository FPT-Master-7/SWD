package application.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CONTRACT")
public class Contract {
	@Id
	private int id;
	@Column(name = "fullname", length = 30, nullable = false)
	private String fullname;
	@Column(name = "username", length = 30, nullable = false)
	private String username;
	@Column(name = "password", length = 30, nullable = false)
	private String password;
	@Column(name = "email", length = 30, nullable = false)
	private String email;
}