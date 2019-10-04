package Link;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;
public class Linklist {
		// TODO Auto-generated method stub
		static int reg=0;
		static int e=0;
		static int pr=0;
		static int r=0;
		static int o=0;
		public static LinkedList<String> names = new LinkedList<String>();
		public static LinkedList<String> addresses=new LinkedList<String>();
		public static void main(String[] args) throws IOException {
			 String  name;//names
		     String address;
		     String contactNumber;
		     String email;
		     String proofType;
		     String proofID;
		     String ac;
		     String cot;
		     String cable;
		     String wifi;
		     String laundry;
		     boolean i=false;
		     boolean g=true;
		     boolean t=true;
			String k,temp; 
			String email1[]=new String[30];
			String name1[]=new String[29];
			int register1[]=new int[29];
			int register=0;
			int dt[]=new int[25];
			int da=0;
		    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		     do
		     {
		     System.out.println("MENU\n1.Registration\n2.Booking\n"+ "3.Email\n4.check status"+"\n"+"5.date\n6.Exit"+"\n7.Bye");
		     System.out.println("enter your choice");
				int c=Integer.parseInt(br.readLine());
				switch(c)
				{
				case 1:
				{	
				System.out.println("Registration");
				do
				{
		 	 System.out.println("Enter the name");
		     name=br.readLine();
		     names.add(name);
		     name1[pr]=name;
		     pr++;
		     System.out.println("enter the address");
		     address=br.readLine();
		     addresses.add(address);
		     System.out.println("enter the contact");
		     contactNumber=br.readLine();
		     
		     System.out.println("enter the email");
		     email=br.readLine();
		     email1[e]=email;
		     e++;
		     System.out.println("enter the proof type");
		     proofType=br.readLine();
		     System.out.println("enter the proofID");
		     proofID=br.readLine();
		    System.out.println("enter the register");
		    // Register r=new Register();
		     
		     //Main customer=new Main(name,address,contactNumber,email,proofType,proofID);
		    // r.registered(name,address,contactNumber,email,proofType,proofID);
		     System.out.println("your register id is"+ ++reg);
	        register1[reg-1]= reg;
		     System.out.println("Do u want to continue? (y/n)");
		     String z=br.readLine();
		     if(z.equalsIgnoreCase("y"))
		    	 i=true;
		     else
		     {
		    	 i=false; 
		     System.out.println("customers list");
			        System.out.println("The registered customers are");
			  	        for(int m=0;m<=20;m++) {
			        	if(register1[m] !=0) {
			        System.out.println("Customers ID   "+register1[m]);
			        	}
			  	        if(name1[m] != null) {
			        System.out.println("customer name   "+name1[m]);
			         }
			        	}
		     }
		     
		     //System.out.println("MENU\n1.Registration\n2.Booking\n"+ "3.Email\n4.check status"+"\n"+"5.date\n6.CuID\n7.Exit");
		      //  System.out.println("customer ID       ++register+"customer name                "+name);
		       
		  
				
				
				}while(i);
				
				}
				//System.out.println("MENU\n1.Registration\n2.Booking\n"+ "3.Email\n4.check status"+"\n"+"5.date\n6.CuID\n7.Exit");
				break;
				
				case 2:
				{
		    System.out.println("Booking");	
		    do
		    {
				
		     System.out.println("please choose the services required");
				System.out.println("Ac/non-Ac");
				ac=br.readLine();
				System.out.println("cot(single/Double)");
				cot=br.readLine();
				System.out.println("with cable connection/without cable connection(c/nc)");
				cable=br.readLine();
				System.out.println("wi-fi needed or not(w/nw)");
				wifi=br.readLine();
				System.out.println("Laundry sevice needed or not(L/nL)");
				laundry=br.readLine();
				System.out.println("Enter the date");
				int dr=Integer.parseInt(br.readLine());
				 dt[o]=dr;
	    		 o++;
				//Roombooking b=new Roombooking();
				
				System.out.println("Do you want to proceed(y/n)");
				String w=br.readLine();
				if(w.equalsIgnoreCase("y"))
				{
				//b.roombook(ac,cot, cable, wifi, laundry);
				//b.Book(ac, cot, cable, wifi, laundry);
				}
				System.out.println("Do u want to book again? (y/n)");
			     String z=br.readLine();
			     if(z.equalsIgnoreCase("y"))
			    	 i=true;
			     else
			     {
			    	 i=false; 
			     }
				} while(i);
				}
		    break;
				
				case 3:
		      {
			System.out.println("Email");
		  // Customer2 h=new  Customer2();
		   {
		    	 System.out.println("current email");
		    	 String m1=br.readLine();
		    	 System.out.println("new  email");
		    	 String m2=br.readLine();
		    	 for(int x=0;x<25;x++)
		    	 if(m1.equalsIgnoreCase(email1[x]))
		    	 {
		    		// h.setEmail(m1);
		    	 }
		    		 System.out.println("updated email is "+m2);
		    	 
		      }
		      }
		      break;
				case 4:
				{
					System.out.println("check status");
				int l=0;
				System.out.println("Thank you for booking your room number is"+" "+ ++register);
		         register1[r]=register;
		         r++;
				if(l==register) 
					System.out.println("the room number is booked");
				else
						System.out.println("not booked");
				}
				 
				break;
		    	 case 5:
		    	 {
		    		 System.out.println("Enter the start date");
		    		 int f=Integer.parseInt(br.readLine());
		    		 System.out.println("enter the end date");
		    		 int y=Integer.parseInt(br.readLine());
		    		 System.out.println("The booking mades from"+f+"to "+y+" are");
		    		 for(int a=0;a<25;a++)
		    		 {
		    		 if(dt[a]>=f && dt[a]<=y)
		    		 {
		           System.out.println("customer ID"+register1[r]+"      "+name1[pr]);
		    			        	
		    		 }
		    	 }
		             
		      break;
				}
		     case 6:
		     {
		     System.out.println("exit");
		      System.exit(0);
		     }
		     
				
		      break;
				
				case 7:
				{
					System.out.println("Bye");
				}
				}
		      System.out.println("do u want to continue");
		     String w=br.readLine();
				if(w.equalsIgnoreCase("yes"))
					g=true;
				else
					g=false;
		} while(true);
		     
		}
		     
		
	}


