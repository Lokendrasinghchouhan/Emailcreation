package emailapp;
import java.util.*;
import java.util.Scanner;


public class Email {

	   private String firstname;
	   private String lastname;
	   private String password;
	   private String department;
	   private String email;
	   private int defaultPasswordlength =10;
	   private int mailboxCapacity=500;
	   private String alternetEmail;
	   private String companySuffix = "compny.com";
	   
	   public Email(String firstname ,String lastname)
	   {
		  this.firstname=firstname;
		  this.lastname=lastname;
		  //Scanner sc = new Scanner(System.in);
		 // this.firstname=sc.nextLine();
		  //this.lastname = sc.nextLine();
		  
		   //System.out.println("EMAIL CREATED  :" + this.firstname +" "+ this.lastname);
		   
		   this.department =  setDepatrment();
		  // System.out.println("Department:  " +   this.department);
		   
		   this.password =  randomPassword(defaultPasswordlength);
		   //System.out.println("your pass is:"+ this.password);
		   
		   email = firstname.toLowerCase() + lastname.toLowerCase() + "@" + department + companySuffix;
		   //System.out.print("Your email id  is :  "+email);
		   
	   }
	   private String setDepatrment() {
		   
		   System.out.print("Department code\n1 sales \n2 Development \n3 account \n0 none \n Enter the Department code:");
		   Scanner sc = new Scanner(System.in);
		   int depChoice = sc.nextInt();
		   if (depChoice == 1){return "sales";}
		   else if (depChoice == 2) {return "dev";}
		   else if (depChoice == 3) {return "acct";}
		   else {return "" ;}
		   
	   }
	   private String randomPassword(int length) {
		   
		   String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		   char [] password = new char[length];
		   for(int i=0;i<length;i++)
		   {
			   int rand = (int) (Math.random() * passwordSet.length());
			   password[i] = passwordSet.charAt(rand);
		   }
		   return new String(password);
		   
	   }
	   public void setMailboxCapacity(int capacity)
	   {
		   this.mailboxCapacity = capacity;
	   }
	   
	   public void setAlternatEmail(String altEmail)
	   {
		   this.alternetEmail = altEmail;
	   }
	   public void changePassword(String password)
	   {
		   this.password = password;
	   }
	   public int getMailboxCpacity() {
		   return	mailboxCapacity;
	   }
	   public String getAlternatEmail() { return alternetEmail ;}
	   public String getPassword() {return password ;}
	   
	   public String showInfo()
	   {
		   return "DISPLAY NAME :"+ firstname + "  " + lastname +
				   "\n COMPANY EMAIL :"+ email +
				   "\n MAILBOX CAPACITY :"+ mailboxCapacity + "mb" ;
	   }
}
 