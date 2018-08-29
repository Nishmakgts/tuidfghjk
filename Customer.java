package myProject;

public class Customer {
private String customerName;
private String contact;
private String address;
private String customerID;
private String userName;
private String password;

public Customer(){}

public Customer(String nm, String c, String a, String id, String userName, String password){
	this.customerName=nm;
	this.contact=c;
	this.address=a;
	this.customerID=id;
	this.userName=userName;
	this.password=password;
	
}
public void setCustomerName(String customerName){ this.customerName=customerName;}
public void setContact(String contact){this.contact=contact;}
public void setAddress(String address){ this.address=address;}
public void setCustomerId(String customerID){ this.customerID=customerID;}
public void setUserName(String userName){ this.userName=userName;}
public void setPassword(String password){ this.password=password;}



public String getCustomerName(){ return customerName;}
public String getContact(){ return contact;}
public String getAddress(){ return address;}
public String getCustomerID(){ return customerID;}
public String getUserName(){ return userName;}
public String getPassword(){ return password;}

public boolean validate(String a, String b){
	if(this.userName.equals("a") && this.password.equals("b"))
		return true;
	else
		return false;
}

}
