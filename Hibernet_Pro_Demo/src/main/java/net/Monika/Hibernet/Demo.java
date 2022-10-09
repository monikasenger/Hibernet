package net.Monika.Hibernet;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Demo")

public class Demo {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

@Column(name = "id")
private long id;

@Column(name = "u_name")
private String user_name;

@Column(name = "u_pass")
private String user_pass;

@Column(name = "u_email")
private String user_email;
	
	public Demo() {
	super();
	// TODO Auto-generated constructor stub
}

	public Demo( String user_name, String user_pass, String user_email) {
	
	this.user_name = user_name;
	this.user_pass = user_pass;
	this.user_email = user_email;
}

	public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUser_name() {
	return user_name;
}

public void setUser_name(String user_name) {
	this.user_name = user_name;
}

public String getUser_pass() {
	return user_pass;
}

public void setUser_pass(String user_pass) {
	this.user_pass = user_pass;
}

public String getUser_email() {
	return user_email;
}

public void setUser_email(String user_email) {
	this.user_email = user_email;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}