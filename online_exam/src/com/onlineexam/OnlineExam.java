package com.onlineexam;
import java.util.*;
public class OnlineExam {
	Scanner sc = new Scanner(System.in);
    int count=0;
    int answer;
    String Name;
    String Username;
    String Password;
    public static void main(String[] args)
    {
    	OnlineExam exam=new OnlineExam();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Welcome to java online examination");
    	System.out.println("1.create account\n2.exit");
    	System.out.println("----------------------------------------------------------------------- \n");
    	System.out.println("Enter Your Choice : ");
        int choice = sc.nextInt();
        switch (choice) {
        	case 1: {
        		exam.Account_SignUp();
                break;
            }
            case 2: {
                System.exit(0);
            }
        }
        System.out.println(" \t >>> Press 1 To LOGIN \n \t >>> Press 2 TO EXIT ");
        System.out.println("----------------------------------------------------------------------- \n");
        System.out.println("Enter Your Choice : ");
        int choice1 = sc.nextInt();
        switch (choice1)
        {

            case 1: {
                exam.Account_Login();
            }

            case 2: {
                System.exit(0);
            }
        }
    }
    void Account_SignUp() {
        System.out.println("Enter Your Name: ");
        this.Name = sc.nextLine();
        System.out.println("_________________");
        System.out.println("Enter Your UserName: ");
        this.Username = sc.nextLine();
        System.out.println("___________________");
        System.out.println("Enter Your Password : ");
        this.Password = sc.nextLine();
        System.out.println("-------!! Account Created successfully !! -------- \n");
    }
   void Account_Login() {

       while (true)
       {
           System.out.println("Enter Your Username : ");
           String Username1 = sc.nextLine();
           System.out.println("______________________");

           if (Username1.equals(Username))
           {
               while (true)
               {
                   System.out.println("Enter Your Password : ");
                   String Password1 = sc.nextLine();
                   System.out.println("______________________");

                   if (Password1.equals(Password)) {
                       System.out.println(" **************************** !! Login Successful !! ********************************* \n");
                       update();
                       break;
                   } else {
                       System.out.println(" *************************** !! Incorrect Password !! *********************************** \n");
                   }
               }
           } else {
               System.out.println(" *********************************** !! Incorrect Username !! ************************************** \n");
           }
           break;

       }
  }
   		
void update(){
    
	while(true) {
			System.out.println("Do you want to Update your profile? Y/N");
			char userChoice = sc.next().charAt(0);
			switch (userChoice) {
  case 'y':
	  System.out.println("Change username:");
	  String newUsername=sc.next();
	  Username=newUsername;
	  System.out.println("Change password:");
	  String newPassword=sc.next();
	  Password=newPassword;
	  System.out.println("-------------------------------");
	  System.out.println("THE UPDATED PROFILE :-");
	  System.out.println("New username:"+newUsername);
	  System.out.println("New password:"+newPassword);
	  System.out.println("-------------------------------");
	  startTest();
      break;

  case 'n':
      
      startTest();
      break;

  default:
      System.out.println("That is not a valid entry");
      break;
			}
	break;		
	}

}

void startTest()
{
	System.out.println("Let's Begin the Examination");
	System.out.println("==>There are 5 questions in the examination");
	System.out.println("==>Each question consist of 4 option you have to choose correct answer");
	System.out.println("______________________________________________________________________");
 	System.out.println("Q.1. Which of the following is not a Java features?");
    System.out.println("1.Use of pointers \n2.Dynamic\n3.Architecture Neutral\n4.Object-oriented");
    System.out.print("Enter answer:");
    answer=sc.nextInt();
    if(answer==1)
    	{
        	++count;
        }
    System.out.println("_______________________________________________________________________");
    System.out.println("Q.2._____ is used to find and fix bugs in the Java programs.");
    System.out.println("1.JDB\n2.JVM\n3.JRE\n4.JDK");
    System.out.print("Enter answer:");
    answer=sc.nextInt();
    if(answer==1)
    	{
        	++count;
        }
   System.out.println("________________________________________________________________________");
   System.out.println("Q.3.Java is:");
   System.out.println("1.Platform Dependent\n2.Platform Indepenedent\n3.None\n4.All of the above");
   System.out.print("Enter answer:");
   answer=sc.nextInt();
   if(answer==2)
   		{
        	++count;
        }
   System.out.println("_________________________________________________________________________");
   System.out.println("Q.4.Technical Name of Core Java is knon as:");
   System.out.println("1.JSE\n2.JEE\n3.J2SE\n4.J2EE");
   System.out.print("Enter answer:");
   answer=sc.nextInt();
   if(answer==1)
   		{
        	++count;
        }
   System.out.println("_________________________________________________________________________");
   System.out.println("Q.5.Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?");
   System.out.println("1.javap tool\n2.javah command\n3.Javadoc tool\n4.None");
   System.out.print("Enter answer:");
   answer=sc.nextInt();
   if(answer==3)
   {
	   ++count;
   }
   if(count>=3) {
   System.out.println("__________________________________________________________________________");
   System.out.println("welldone!, "+Name+"  You scored "+count+" marks out of 5");
   }
   else {
	 System.out.println("________________________________________________________________________");
	 System.out.println("Your Score "+count+" is too low..Try again later");
   }	
}
}




	