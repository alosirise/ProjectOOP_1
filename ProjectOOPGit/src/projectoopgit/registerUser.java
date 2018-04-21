package projectoopgit;
import java.util.Date;
import java.util.Scanner;
class registerUser extends Choose7 implements press,user{
      private String sc4,sc5;   
      private String time;   
      
        registerUser(){       
            this("\n  =================== PROJECT D-MAIL ======================\n");          
        }         
        registerUser(String message){  
            Date currentDate = new Date();    
            this.time ="It's time : "+(currentDate)+"\n";  
            System.out.println(message);
            System.out.println(time);
       }  															
        public void press(){	
		Scanner sc = new Scanner(System.in);
		System.out.println("--------------------------------------------------");
		System.out.println("PRESS [1] TO LOGIN USER  PRESS [2] TO REGISTER");
		System.out.println("--------------------------------------------------");
		String press =sc.nextLine();
										
		switch(press){
			case "1" :user();break;								
			case "2" :IncreaseRegister();register();break;												
			default  :System.out.println("\n======Enter only 1-2 number======\n----Please Select again----\n"); 
                                  press();break;						
		}
	}      
        public void register(){
		Scanner sc = new Scanner(System.in);
                System.out.println("==================================================");
		System.out.println("------------------ Register User -----------------");
                System.out.println("==================================================");
		System.out.print("ENTER NEW ID\n>");
                String sc1 =sc.nextLine();			    				    	
                System.out.print("ENTER NEW PASSWORD\n>");
		String sc2 =sc.nextLine();
												
		System.out.print("ENTER ID AGAIN \n>");
		String sc3 =sc.nextLine();			    					    	
		System.out.print("ENTER PASSWORD AGAIN\n>");
		String sc4 =sc.nextLine();
                System.out.print("\n[ENTER YOUR USERNAME] >> ");
                String sc5 = sc.nextLine();
                        
		r1=getAllRegister();
                
		if(sc1.equals(sc3)&&sc2.equals(sc4)){					
			while(r1>=0){
				if(sc1.equals(idus1[r1])){									
					System.out.println("-----------------Already Account----------------");	
					System.out.println("-------------Please Register again----------------");
					register();
				}
                                if(sc5.equals(nameUser[r1])){
                                        System.out.println("-----------------Already Username----------------");	
					System.out.println("-------------Please Register again----------------");
					register();
                                }
			r1--;
			}
                                              
			idus1[getAllRegister()]=sc1;
			pwus1[getAllRegister()]=sc2;
                        nameUser[getAllRegister()]=sc5;
                            
                        System.out.println("\n-----------------Register Success-----------------");
			press();								
                 }else{
		        System.out.println("\n-------------------Register Fail------------------");	
			System.out.println(" ---ID or Password Wrong! Please Register again ---");
			press();
                }
	}								
	public void user(){
		Scanner sc = new Scanner(System.in);
		n=getAllRegister();
                System.out.println("==================================================");
		System.out.println("------------------- Login User -------------------");
                System.out.println("==================================================");											
                System.out.print("Enter ID\n>");
		sc4 =sc.nextLine();
		System.out.print("Enter Password\n>");
		sc5 =sc.nextLine();
				    					    	 					
                    while(n>0){
                            if(this.sc4.equals(idus1[n])&&this.sc5.equals(pwus1[n])){				
                                System.out.println("\n-------------------Login Success------------------");                               
                                choose7();
                            }
                            n--;
                    }              
                System.out.println("\n---------------------Login Fail-------------------");	
                System.out.println("---ID or Password Wrong!  Please login  again---\n");																														
                press();
        }
}