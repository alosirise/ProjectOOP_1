package projectoopgit;
import java.util.*;
        interface press{
        public void press();
        }
        interface user{
        public void user();
        }
class registerUser extends Choose7 implements press,user{
      private String sc4,sc5;   
      private String time;   
      
        registerUser(){       
            this("\n=================== WELCOME TO PROJECT D-MAIL======================");          
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
                                choose7();//press1234();
                            }
                            n--;
                    }
                
                System.out.println("\n---------------------Login Fail-------------------");	
                System.out.println("---ID or Password Wrong!  Please login  again---\n");																														
                press();
        }
}

abstract class abChoose7 {
    
     abstract public void register(); 
     
//     abChoose7(){
//         System.out.println("---------------");
//     }
     
     private static int r; 
     public static int r1,n,s,t,b,c1,c2,c3,c4,c5,c6,y,j; // r=register s =save  t=sendingmail y=countMessage  
     
     
     public void IncreaseRegister(){
     this.r++;
     }
     
     public int getAllRegister(){
     return r;
     }
   
     public static int  [][]countS =new int[100][1];
     public static String []idus1 = new String[100];    //r1
     public static String []pwus1 = new String[100];    //r1  
     public static String []nameUser = new String[100]; //n   
     
     public static String [][]RM = new String[100][100]; //c1 //Receive Mail
     public static String [][][]RM2 = new String[100][100][100];
     
     public static String [][]SM = new String[100][100]; //c2 //Send Mail
     public static String [][][]SM2 = new String[100][100][100]; //c4 //All Message  
     
     public static String [][]NM = new String[100][100]; //c3,t  //New Mail
     public static String [][][]NM2 = new String[100][100][100];
     
     public static String [][]SV = new String[100][100]; //s //Saved Mail
     public static String [][][]SV2= new String[100][100][100];
     
     public static String [][]BIN = new String [100][100];//b 
     public static String [][][]BIN2 = new String [100][100][100];
     
     public static String [][]JM = new String[100][100]; //j //Junk Mail
     public static String [][][]JM2 = new String[100][100][100];
     
     public static String [][]CT = new String[100][100]; //c5 //Contact List
     public static String [][][]CT2 = new String[100][100][100];
     
     public static String [][]PF = new String[100][3]; // profile array 0=email 1=num-phone 2=introduce
     public static String [][]ALEART = new String[100][3]; //alert 0=receiveMail 1=Junkmail  2=Contact
     
     public static int sum;
     public static int stringcal(){
        String sc1,check;
     	int x,d,count;      
        do{
     	    Scanner ns1 = new Scanner(System.in);
     	    //System.out.println("");
     	    sc1 = ns1.nextLine();//รับค่าเข้ามาเป็น
     	    check="true";
            count=1;
     	    x=0;
     	    d=1;
     	    sum=0;
     	    for(int i2=0;i2<sc1.length()-1;i2++){//ลูปนี้ใช้นับเลขที่พิมเข้ามา
     		    d=d*10;
     	    }for(int i=0;i<sc1.length()&&check.equals("true");i++,count++){//ลูปนี้ใช้แปลง เป็นตัวเลข
     	   	         if(count>=10){ 	   	           
                             check="false";
                             System.out.println("===Error===");
//                         }else if(sc1.charAt(i)=='0'){
//                                x=0;
                         }else if(sc1.charAt(i)=='1'){
     	   	   		x=1;
     	   	   	 }else if(sc1.charAt(i)=='2'){
     	   	   		x=2;
     	   	   	 }else if(sc1.charAt(i)=='3'){
     	   	   		x=3;
     	   	   	 }else if(sc1.charAt(i)=='4'){
     	   	   		x=4;
     	   	   	 }else if(sc1.charAt(i)=='5'){
     	   	   		x=5;
     	   	   	 }else if(sc1.charAt(i)=='6'){
     	   	   		x=6;
     	   	   	 }else if(sc1.charAt(i)=='7'){
     	   	   		x=7;
     	   	   	 }else if(sc1.charAt(i)=='8'){
     	   	   		x=8;
     	   	   	 }else if(sc1.charAt(i)=='9'){
     	   	   		x=9;
     	                 }else{
     	   	        check="false";
     	   	        System.out.println("---Input Wrong---");
     	         }if(check.equals("true")){
     	              x=x*d; d=d/10; sum=sum+x;
     	         }
     	    }if(check.equals("true")){       
     	         //System.out.println(sum);              
     	     }
          }while(check.equals("false"));//ถ้า error จะcheck false ทำให้ลูปรับค่าใหม่
        return sum;
    }
}


abstract class Choose7 extends abChoose7{
       public void choose7(){
        int x=0;
            do{
                 if(ALEART[n][x]==(null)){
                    ALEART[n][x]="";
                 }
                 x++;
            }while(x<3);

            for( x=0;x<3;x++){
                 if((PF[n][x])==(null)){
                    PF[n][x] =" [----EMPLY----]";
                 }
            }
   
        ReceiveMail w1 = new ReceiveMail();
        SendedMail w2 =new SendedMail();
        NewMail w3 = new NewMail();
        JunkMail w4 =new  JunkMail();
        Contact w5 = new Contact();
        BinMail w6 = new BinMail();
        Profile w7 = new Profile();
        registerUser w8 = new registerUser();
       
        System.out.println("--------------------------------------------------");
        System.out.println("==================== Main Menu ===================");
        System.out.println("--------------------------------------------------");
        System.out.println("HELLO USER : "+nameUser[n]);
        System.out.println("      "+ALEART[n][0]);
        System.out.println("      "+ALEART[n][1]);
        System.out.println("      "+ALEART[n][2]);
//        System.out.print("\n[SELECT] >\n1.RECEIVE MAIL "+ALEART[n][0]+"\n2.SENDED MAIL\n3.CREATE NEW MAIL"
//                       + "\n4.JUNK MAIL"+ALEART[n][1]+"\n5.HISTORY LIST"+ALEART[n][2]+"\n6.BIN\n7.Profile\n8.LOGOUT\n\n>");
        System.out.println("");
        System.out.println("PRESS [1] to Recieve Mail |  PRESS [2] to Send Mail");
        System.out.println("PRESS [3] to Create  Mail |  PRESS [4] to Junk Mail");
        System.out.println("PRESS [5] to Contact List |  PRESS [6] to Bin");
        System.out.println("PRESS [7] to My Profile   |  PRESS [8] to Logout");
        System.out.print(">");
        Scanner ch = new Scanner(System.in); 
        String chn = ch.nextLine();
            switch(chn){
                case "1":w1.ReceiveMail(); break;
                case "2":w2.SendedMail();break;
                case "3":w3.SelectNewmail();break;
                case "4":w4.JunkMail(); break;
                case "5":w5.Contactlist();break;
                case "6":w6.Bin();break; 
                case "7":w7.profile();break;
                case "8":w8.press();break; 
                default:System.out.println("----------Please Enter Number Between 1-8---------");choose7();
            }         
   }
}


class ReceiveMail extends Choose7{
       public void register(){}      
       public void ReceiveMail(){
            ALEART[n][0]="";    
            System.out.println("\n==================================================");
            System.out.println("------------------- Recieve Mail -----------------");
            System.out.println("==================================================");
            System.out.println("------Mail List------");
                for(int z=0 ;z<c1;  z++){     //sort array        
                     if(RM[n][0]==null ){                     
                         for(int x=0;x<=c1; x++){      
                           RM [n][x] = RM[n][x+1];  
                           RM2[n][x] = RM2[n][x+1];
                         }
                     }
                     if(RM[n][z]==null ){                     
                         for(int x=z;x<=c1; x++){      
                           RM [n][x] = RM[n][x+1];  
                         }
                     }
                }     

                for(int z=0 ;z<=c1; z++){     //print
                    if(RM[n][z] == null){z++;}
                    else{
                    System.out.println("[TITLE RECEIVE "+(z+1)+"]   >"+RM[n][z]);       
                     }
                 }
                Scanner sc = new Scanner(System.in);
                System.out.println("");
                if(RM[n][0]==null){
                 System.out.println("-----------EMPTY-------------");
                 System.out.println("");
                 System.out.println("Press[3] to Back");
                 System.out.print(">");
                 String emptyR = sc.nextLine();
                 switch(emptyR){
                     case "3":choose7();break;
                     default :System.out.println("-------------------Please enter only 3------------------"); ReceiveMail();break;
                 }
                }

            System.out.println("Press[1] to Read Mail | Press[2] to Delete Mail");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            String sd = sc.nextLine();
                switch(sd){
                    case "1":MessageRMail(); break;
                    case "2":DeleteRMail(); break;
                    case "3":choose7(); break;
                    default:System.out.println("-------------------Please enter only 1-3------------------"); ReceiveMail();break;
                }
          
       }      
       
       public void MessageRMail(){
            System.out.print("\nNumber title :");
            int rrm =stringcal();
                if(rrm<=0){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageRMail();
                }
                if(rrm >c1){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageRMail();
                }
            System.out.println("\n==================================================");
            System.out.println("\n[TITLE  ]                     " +RM[n][rrm-1]); 

            System.out.println("\nMASSAGE :");   //printmessage
                for(c4=0;c4<=y;c4++){ 
                     if(RM2[n][rrm-1][c4] == null ||RM2[n][rrm-1][c4].equals("|")){c4++;}
                     else{System.out.println("             "+RM2[n][rrm-1][c4]);   
                     }
                }
            System.out.println("==================================================");                
            ReceiveMail();
       } 
      
       public void DeleteRMail(){
           Scanner ch = new Scanner(System.in);
           System.out.println("");
            System.out.println("Do you want to Delete ReceiveMail?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");
            String Drm1 = ch.nextLine();
            Drm1=Drm1.toUpperCase();
             switch(Drm1){
                 case "YES":System.out.print("\nEnter number of title to delete : ");
                            System.out.print(">");
                            int Drm2 = stringcal();
                            BIN[n][b]  = RM[n][Drm2-1];

                             for(int i =0;i<=c4 ;i++){
                                 BIN2[n][b][i]=RM2[n][Drm2-1][i];
                             } 

                             RM [n][Drm2-1] = null;
                             b++;

                             System.out.println("\n-----------------DELETE SUCCESS!------------------");ReceiveMail();break;                                   
                 case "NO" :ReceiveMail(); break;
                 default : System.out.println("PLESE ENTER ONLY \"YES\" or \"NO\"");ReceiveMail();        
            }
       }           
}


class SendedMail extends Choose7 {  
       public void register(){}
       public void SendedMail(){
            System.out.println("\n==================================================");
            System.out.println("-------------------- Send Mail -------------------");
            System.out.println("==================================================");
            System.out.println("------Mail List------");
                for(int z=0 ;z<=c2;  z++){                
                     if(SM[n][0]==null ){                     
                         for(int x=0;x<=c2; x++){      
                            SM [n][x] = SM[n][x+1];  
                            SM2[n][x] = SM2[n][x+1];
                         }
                     }
                     if(SM[n][z]==null ){                     
                         for(int x=z;x<=c2; x++){      
                           SM [n][x] = SM[n][x+1];            
                         }
                     }  
                }   

                for(int z=0 ;z<=c2; z++){
                     if(SM[n][z] == null){z++;}
                     else{
                     System.out.println("[TITLE SENED "+(z+1)+"]   >"+SM[n][z]); 
                     }
                }                 
                Scanner sc1 = new Scanner(System.in);
                System.out.println("");
                if(SM[n][0]==null){
                   System.out.println("-----------EMPLY-----------");
                   System.out.println("");
                   System.out.println("Press [3] to Back");
                   System.out.print(">");
                   String emptyS = sc1.nextLine();
                   switch(emptyS){
                     case "3":choose7();break;
                     default :System.out.println("-------------------Please enter only 3------------------"); SendedMail();break;
                   }
                }
                
            System.out.println("Press[1] to Read Mail | Press[2] to Delete Mail");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            String sd = sc1.nextLine();
                switch(sd){
                     case "1":MessageSMail(); break;
                     case "2":DeleteSMail(); break;
                     case "3":choose7(); break;
                     default:System.out.println("------------------Please enter only 1-3-----------------");  SendedMail();
                }
       }
       
       public void MessageSMail(){
            System.out.print("\nNumber title :");
            int rrm =stringcal();
              if(rrm<=0){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageSMail();
                    }
                    if(rrm >c2){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageSMail();
                    }
            System.out.println("\n==================================================");
            System.out.println("\n[TITLE  ]                     " +SM[n][rrm-1]); 
                    
                System.out.println("\nMASSAGE :"); 
                    for(c4=0;c4<=y;c4++){
                         if(SM2[n][rrm-1][c4] == null ||SM2[n][rrm-1][c4].equals("n")){c4++;}
                         else{System.out.println("             "+SM2[n][rrm-1][c4]);                           
                         }
                    }
            System.out.println("==================================================");                
            SendedMail();
       }
       
       public void DeleteSMail(){
            Scanner ch = new Scanner(System.in);
            System.out.println("");
            System.out.println("Do you want to Delete Send Mail?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");             
            String Drm1 = ch.nextLine();
            Drm1=Drm1.toUpperCase();
                switch(Drm1){
                    case "YES":System.out.print("\nEnter number of title to delete : ");
                               int Drm2 = stringcal();
                               BIN[n][b]  = SM[n][Drm2-1];

                                for(int i =0;i<=c4 ;i++){
                                      BIN2[n][b][i]=SM2[n][Drm2-1][i];
                                } 

                               SM [n][Drm2-1] = null;    
                               b++;
                               System.out.println("\n-----------------DELETE SUCCESS!------------------");SendedMail();                             
                    case "NO" :choose7(); break;
                    default : System.out.println("PLESE ENTER ONLY \"YES\" or \"No\"");SendedMail();     
                }
        } 
}


class BinMail extends Choose7{
       public void register(){}
       public void Bin(){
            System.out.println("\n==================================================");
            System.out.println("------------------------ Bin ---------------------");
            System.out.println("==================================================");
            System.out.println("------Mail List------");
                for(int z=0 ;z<=b;  z++){                
                    if(BIN[n][0]==null ){                     
                        for(int x=0;x<=b; x++){      
                          BIN [n][x] = BIN[n][x+1];                        
                        }
                    }
                    if(BIN[n][z]==null ){                     
                        for(int x=z;x<=b; x++){      
                          BIN [n][x] = BIN[n][x+1];                   
                        }
                    }  
                }

                for(int z=0 ;z<b; z++){
                     if(BIN[n][z] == null){z++;}
                     else{
                     System.out.println("[TITLE TRASH "+(z+1)+"]   >"+BIN[n][z]);                 
                     }
                }
                Scanner sc = new Scanner(System.in);
                System.out.println("");
                if(BIN[n][0]==null){
                     System.out.println("-----------EMPTY-------------");
                     System.out.println("");
                     System.out.println("Press[3] to Back");
                     System.out.print(">");
                     String emptyB = sc.nextLine();
                    switch(emptyB){
                        case "3":choose7();break;
                        default :System.out.println("-------------------Please enter only 3------------------"); Bin();break;
                    }
                }
            System.out.println("Press[1] to Read Mail    | Press[2] to Delete Mail");
            System.out.println("Press[3] to Restore Mail | Press[4] to Back");
            System.out.print(">");
            String sd = sc.nextLine();
                switch(sd){
                    case "1":MessageBin(); break;
                    case "2":DeleteBin(); break;
                    case "3":RestoreBin(); break;
                    case "4":choose7(); break;
                    default:System.out.println("------------------Please enter only 1-4-----------------");  Bin();
                }
    }   
              
       public void MessageBin(){
            System.out.print("\nNumber title :");
            int rrm =stringcal();
            
                   if(rrm<=0){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageBin();
                    }
                    if(rrm >b){
                    System.out.println("\n----------Cannot found Name Reciever------------");
                    MessageBin();
                    }
            System.out.println("\n==================================================");
            System.out.println("\n[TITLE  ]                     " +BIN[n][rrm-1]); 

            System.out.println("\nMASSAGE :"); 
                for(c4=0;c4<=y;c4++){
                     if(BIN2[n][rrm-1][c4] == null ||BIN2[n][rrm-1][c4].equals("n")){c4++;}
                     else{System.out.println("             "+BIN2[n][rrm-1][c4]);

                     }
                }
            System.out.println("==================================================");                
            Bin();
      
       }
       
       public void DeleteBin(){
            Scanner ch = new Scanner(System.in);
            System.out.println("");
            System.out.println("Are you sure you want to permanently delete this Email ?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");
            String Drm1 = ch.nextLine();
            Drm1=Drm1.toUpperCase();
                switch(Drm1){
                    case "YES":System.out.print("\nEnter number of title to delete : ");
                               int Drm2 = stringcal();
                               BIN[n][Drm2-1]=null;

                                for(int i =0;i<=c4 ;i++){
                                      BIN2[n][Drm2-1][i]=null;
                                }                                                                          
                               SV [n][Drm2-1] = null;    
                               System.out.println("\n-----------------DELETE SUCCESS!------------------");Bin();                             
                    case "NO" :Bin(); break;
                    default : System.out.println("PLESE ENTER ONLY \"YES\" or \"No\"");DeleteBin();     
                }
       }
       
       public void RestoreBin(){
            Scanner sc = new Scanner(System.in);
            Scanner ch = new Scanner(System.in);
            System.out.println("");
            System.out.println("Do you want to Restore your mail ?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");
            String Drm1 = ch.nextLine();
            Drm1=Drm1.toUpperCase();
                switch(Drm1){
                    case "YES" :
                               System.out.print("\nNumber title :");
                               int rrm =sc.nextInt();
                               RM [n][c1]=BIN[n][rrm-1];
                               BIN[n][rrm-1]=null;


                               for(int i =0;i<=y ;i++){
                                     RM2[n][c1][i]=BIN2[n][rrm-1][i];
                                     BIN2[n][rrm-1][i]=null;
                               } 
                               c1++;
                               System.out.println("\n--------------------------------------------------");
                               System.out.println("\n [Mail was restroed in to ReceiveMail Box !] "); Bin();break;

                    case "NO" :Bin(); break;
                    default : System.out.println("PLESE ENTER ONLY \"YES\" or \"No\"");RestoreBin();      
           }
        }
}


class NewMail extends Choose7{
       Scanner nm = new Scanner(System.in); 
       String save;
           
       public void register(){}
       public void SelectNewmail(){
            Scanner s = new Scanner(System.in);    
            System.out.println("\n==================================================");
            System.out.println("------------------- Create Mail ------------------");
            System.out.println("==================================================");
            System.out.println("Press[1] to New Mail | Press[2] to Recordlist");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            String ss =s.nextLine();
                switch(ss){
                case "1": EnterMessage(); break;
                case "2": Recordlist();break;
                case "3": NM[n][c3] = null;                                 
                               for(int i =0;i<=c4 ;i++){
                                 NM2[n][c3][i]=null;
                               } 
                          choose7(); break;              
                default :System.out.println("--------------Please Enter 1-3 again--------------");SelectNewmail();
                }
      }
        
       public void EnterMessage(){               
            Date currentDate = new Date();                         
            System.out.print("\nYour Heading : ");
                super.NM[n][c3]=nm.nextLine();

            System.out.println("[IF you want to end your message press \"|\"]");
            System.out.println("");
            System.out.println("Your Message");       
                for(c4=0;c4<100;c4++){
                    Scanner ns1 = new Scanner(System.in); 
                    System.out.print("Enter your Message line"+"["+(c4+1)+"] "+">>");
                    NM2[n][c3][c4] = ns1.nextLine();
                        if(NM2[n][c3][c4].equals("|")){
                           NM2[n][c3][c4]=("\n\t\t From :"+nameUser[n]+"\n\t\t At time :"+(currentDate));
                           c4=100;
                        }else{
                            y++;
                        }
                }

            System.out.println("\n==================================================");
            System.out.println("\nTITLE :                     "+super.NM[n][c3]);
            System.out.println("MESSAGE");
                for(c4=0;c4<=y;c4++){
                     if(NM2[n][c3][c4] == null ||NM2[n][c3][c4].equals("|")){c4++;}
                     else{  System.out.println("             "+NM2[n][c3][c4]);
                     }            
                }                 

            System.out.println("==================================================");    
            NewMail();
       }    
       
       public void NewMail(){
            System.out.println("Do you want to save in to recordlist ?");
            System.out.println("Press[1] to Save | Press[2] to Rewrite");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            save = nm.nextLine();
                switch(save){
                       case "1": SV[n][s]=NM[n][c3];                                 

                                for(int i =0;i<=c4 ;i++){
                                  SV2[n][s][i]=NM2[n][c3][i];
                                } 
                                 s++;                               
                                 System.out.println("-----------------Save success !!------------------\n"); SendingMail();break;                                                          
                       case "2":NM[n][c3] = null;                                 

                               for(int i =0;i<=c4 ;i++){
                                 NM2[n][c3][i]=null;
                               } 

                                EnterMessage(); break;
                       case "3":NM[n][c3] = null;                                 

                               for(int i =0;i<=c4 ;i++){
                                 NM2[n][c3][i]=null;
                               } 

                                SelectNewmail();break;
                       default :System.out.println("-------Please Only 1-3------"); NewMail();
                } 
       }
      
       public void SendingMail(){
                               
            System.out.println("Do you want to Send ?");
            System.out.println("Press[1] to Send Mail | Press[2] to Back");
            System.out.print(">");
            String send = nm.nextLine();
                switch(send){
                   case "1": break;         
                   case "2": SelectNewmail(); break;
                   default : System.out.println("-------Please Only 1-2------");SendingMail(); 
                } 
            
            System.out.println("\n-----------------Recent Contact ------------------");
                for(int z=0 ;z<c5;  z++){ 
                     if(CT[n][z] == null){z++;}
                     else{
                        System.out.println("> username :"+CT[n][z]);                           
                     }
                  }
            System.out.println("--------------------------------------------------");
               
            t=getAllRegister();
          
            System.out.print("\nEnter name Receiver : ");
                            String name = nm.nextLine();
                               
                while(t>0){			                
                          if(name.equals(nameUser[t])){                       
                                    if(name.equals(nameUser[n])){
                                        System.out.println("\n---------You can not Send to your Account---------\n");
                                        SendingMail();
                                    }
                                                                                                                                                      
                                    CT[n][c5]=nameUser[t]; //add in to contactlist
                                    c5++;
                                    CT[t][c5]=nameUser[n];
                                    c5++;
                                                            
                                    String test1,test2="false";   
                                    for(int x=0 ; x<PF[n][0].length();x++){ //check junkmail              
                                        test1= (PF[n][0]).substring(x);    

                                         if(test1.equals("@hotmail.com")){                      
                                                test2="true";
                                              j++;                                     
                                          }                           
                                    }
                              
                                                                  
                                    if(test2.equals("true")){
                                        JM[t][j]=NM[n][c3]; 
                                        NM[n][c3]=null;
                                        ALEART[t][1]="[You have unknow mail] in Junk Mail!";

                                        for(int i =0;i<=c4 ;i++){ //send message                               
                                            JM2[t][j][i]= NM2[n][c3][i];
                                            NM2[n][c3][i]=null;
                                        }
                                    }else if(test2.equals("false")){
                                        ALEART[t][0]="[You have new mail] in Recieve Mail!";
                                        SM[n][c2] =NM[n][c3];                        
                                        RM[t][c1] =NM[n][c3]; // send to user box

                                       for(int i =0;i<=c4 ;i++){ //send message to userbox
                                         SM2[n][c2][i]=NM2[n][c3][i];
                                         RM2[t][c1][i]=NM2[n][c3][i];
                                       }
                                    }
  
                              c1++; c2++; c3++; c4++; 
                             
                              System.out.println("\n-------------------SEND SUCCESS !!----------------");
                               
                              ALEART[t][2]="[You have new contact] in History List!";
                              super.choose7();

                          }
                      t--;  
                }
	
            System.out.println("\n--------------Din't Find Name Reciever------------");	
            System.out.println("------------------Please Enter again--------------\n");	
            
            SendingMail();
        }
      
           
       public void Recordlist(){
            System.out.println("\n==================================================");
            System.out.println("-------------------- Record List------------------");
            System.out.println("==================================================");
            System.out.println("------Mail List------");
                for(int z=0 ;z<=s;  z++){             
                    if(SV[n][0]==null ){                     
                        for(int x=0;x<=s; x++){      
                          SV [n][x] = SV[n][x+1];    
                          SV2[n][x] = SV2[n][x+1];
                        }
                    }
                    if(SV[n][z]==null ){                     
                        for(int x=z;x<=s; x++){      
                          SV [n][x] = SV[n][x+1];                                   
                        }
                    }  
                }

                for(int z=0 ;z<s; z++){
                    if(SV[n][z] == null){z++;}
                    else{
                    System.out.println("[TITLE RECORD "+(z+1)+"]   >"+SV[n][z]); 
                     }
                }
                Scanner sc = new Scanner(System.in);
                System.out.println("");
                if(SV[n][0]==null){
                    System.out.println("-----------EMPTY-------------");
                     System.out.println("");
                     System.out.println("Press[3] to Back");
                     System.out.print(">");
                     String emptyB = sc.nextLine();
                    switch(emptyB){
                        case "3":SelectNewmail();break;
                        default :System.out.println("-------------------Please enter only 3------------------");Recordlist();break;
                    }
                }           
                System.out.println("Press[1] to Read Mail | Press[2] to Delete Mail");
                System.out.println("Press[3] to Back");
                System.out.print(">");
                String sd = sc.nextLine();
                switch(sd){
                    case "1":MessageRecord(); break;
                    case "2":DeleteRecord(); break;
                    case "3":SelectNewmail(); break;
                    default:System.out.println("------------------Please enter only 1-3-----------------"); Recordlist();
                }
      }
       
       public void MessageRecord(){
            System.out.print("\nNumber title :");
            int rrm =stringcal();
                if(rrm<=0){
                System.out.println("\n----------Cannot found Name Reciever------------");
                MessageRecord();
                }
                if(rrm >s){
                System.out.println("\n----------Cannot found Name Reciever------------");
                MessageRecord();
                }
            
            else{ EditMesssage(rrm);
            }
       }
       
       public void EditMesssage(int rrm){
            System.out.println("\n==================================================");
            System.out.println("\n[TITLE  ]                     " +SV[n][rrm-1]); 

                System.out.println("\nMASSAGE :"); 
                     for(c4=0;c4<=y;c4++){
                          if(SV2[n][rrm-1][c4] == null ||SV2[n][rrm-1][c4].equals("|")){c4++;}
                          else{System.out.println("             "+SV2[n][rrm-1][c4]);
                          }
                     }
             System.out.println("==================================================");                
             
            Scanner sc = new Scanner(System.in);
            System.out.println("Press[1] to Send | Press[2] to Editmessage");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            String edit = sc.nextLine();
            switch(edit){
               case "1":
                   
                        System.out.println("\n---------Recent Contact ----------");
                            for(int z=0 ;z<c5;  z++){ 
                                 if(CT[n][z] == null){z++;}
                                 else{
                                    System.out.println("> username :"+CT[n][z]);                           
                                 }
                              }
                         System.out.println("---------------------------------");
                       
                        t=getAllRegister();   
                        System.out.print("\nEnter name Receiver : ");
                                          String name = nm.nextLine();
                            while(t>0){			                
                                      if(name.equals(nameUser[t])){                       
                                                      if(name.equals(nameUser[n])){
                                                          System.out.println("\n-----You can not Send to your Account-----\n");
                                                           EditMesssage(rrm);
                                                      }

                                        CT[n][c5]=nameUser[t];
                                        CT[t][c5]=nameUser[n];
                         
                                        String test1,test2="false";   
                                        for(int x=0 ; x<PF[n][0].length();x++){ //check junkmail              
                                            test1= (PF[n][0]).substring(x);    

                                             if(test1.equals("@hotmail.com")){                      
                                                    test2="true";
                                                  j++;                                     
                                              }                           
                                        }
                                    
                                        if(test2.equals("true")){
                                            JM[t][j]=SV[n][rrm-1];  
                                            ALEART[t][1]="[You have unknow mail] in Junk Mail!";

                                            for(int i =0;i<=c4 ;i++){ //send message                               
                                                JM2[t][j][i]= SV2[n][rrm-1][i];                                         
                                            }
                                        }else if(test2.equals("false")){
                                            ALEART[t][0]="[You have new mail] in Recieve Mail!";
                                            SM[n][c2] =SV[n][rrm-1];                       
                                            RM[t][c1] =SV[n][rrm-1]; // send to user box

                                            for(int i =0;i<=c4 ;i++){
                                              SM2[n][c2][i]=SV2[n][rrm-1][i];
                                              RM2[t][c1][i]=SV2[n][rrm-1][i];
                                            }   
                                        }
                                                    
                                    c1++; c2++; c4++; c5++;
                                    ALEART[t][2]="[You have new contact] in History List!";
                                    System.out.println("\n---------------Send Success!----------------"); 

                                    Recordlist();
                                   }
                              t--;  
                            }

                        System.out.println("\n----------Cannot found Name Reciever------------");	
                        System.out.println("----------------Please Enter again--------------\n");	
                        EditMesssage(rrm); break;
 
            
               case "2":System.out.println("-----------------------------------------------");
                        System.out.println("\n\t[Title]  >>" +SV[n][rrm-1]); 
                        int x=1;
                        System.out.println("\n\t[Massage]");
                             for(c4=0;c4<y;c4++){
                                  if(SV2[n][rrm-1][c4] == null ||SV2[n][rrm-1][c4].equals("|")){c4++;}
                                  else{System.out.println("\t[message Line "+x+" ]  >>"+SV2[n][rrm-1][c4]);
                                        x++;
                                  }             
                             }                            
                        System.out.println("\n------------------------------------------------");
                             
                        
                        System.out.println("\nWhat do you want to edit ?");
                        System.out.print("press[1] to edit title\npress[2] to edit Line\n>");
                        String he = sc.nextLine();
                            switch(he){
                                case "1":System.out.print("\t>Enter new head :");
                                         String Etitle=sc.nextLine();
                                         SV[n][rrm-1]=Etitle;
                                         System.out.println("\n---------------Edit Title Success!!-------------");                                                                                                   
                                         EditMesssage(rrm);break; 

                                case "2":Scanner sc1 = new Scanner(System.in);
                                         System.out.print("\t>Enter Line :");
                                         int line = sc1.nextInt();
                                         if(line>c4){
                                             System.out.println("\n--------------Not found this line---------------");
                                             EditMesssage(rrm);
                                         }

                                         System.out.println("\t[message line "+line+"]"+SV2[n][rrm-1][line-1]);

                                         System.out.print("\t>Enter new message :");
                                         String mline =sc.nextLine();

                                         SV2[n][rrm-1][line-1]=mline;

                                         System.out.println("\n-------------Edit Line "+line+" Success!!--------------");

                                        EditMesssage(rrm);break;                                  
                                default:System.out.println("\n-------------Please enter only 1-2--------------");EditMesssage(rrm);            
                             } break;
    
               case "3": Recordlist();break;
               default:System.out.println("--------------Plese enter only 1-3--------------");EditMesssage(rrm);
                  
            }      
        }
       
       public void DeleteRecord(){
            Scanner ch = new Scanner(System.in);
            System.out.println("");
            System.out.println("Do you want to Delete RecordMail ?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");
            String Drm1 = ch.nextLine();
            Drm1=Drm1.toUpperCase();
             switch(Drm1){
                case "YES":System.out.print("\nEnter number of title to delete : ");
                           int Drm2 = stringcal();
                           BIN[n][b]  = SV[n][Drm2-1];
                           
                            for(int i =0;i<=c4 ;i++){
                                BIN2[n][b][i]=SV2[n][Drm2-1][i];
                            } 
                                                                           
                           SV [n][Drm2-1] = null;    
                           b++;
                           System.out.println("\n-----------------DELETE SUCCESS!-----------------");Recordlist();                             
                case "NO" :choose7(); break;
                default : System.out.println("PLESE ENTER ONLY \"YES\" or \"No\"");Recordlist();     
             }
       }
    }


class JunkMail extends Choose7{
       public void register(){}
       public void JunkMail(){
            ALEART[n][1]=""; 
            System.out.println("\n==================================================");
            System.out.println("-------------------- Junk Mail -------------------");
            System.out.println("==================================================");
            System.out.println("------Mail List------");
            
                for(int z=0 ;z<=j;  z++){                
                   if(JM[n][0]==null ){                     
                       for(int x=0;x<=j; x++){      
                          JM [n][x] = JM[n][x+1];  
                          JM2[n][x] = JM2[n][x+1];
                       }
                   }
                   if(JM[n][z]==null ){                     
                       for(int x=z;x<=c2; x++){      
                         JM [n][x] = JM[n][x+1];            
                       }
                   }  
                }   
                for(int z=0 ;z<j; z++){
                     if(JM[n][z] == null){z++;}
                     else{
                     System.out.println("[TITLE SENED "+(z+1)+"]   >"+JM[n][z]); 
                     }
                }                 
               Scanner sc = new Scanner(System.in);
               System.out.println("");
               if(JM[n][0]==null){
                   System.out.println("-----------EMPTY-------------");
                   System.out.println("");
                   System.out.println("Press[3] to Back");
                   System.out.print(">");
                   String emptyJ = sc.nextLine();
                   switch(emptyJ){
                       case "3":choose7();break;
                       default :System.out.println("-------------------Please enter only 3------------------"); JunkMail();break;
                   }
               }             
            System.out.print("\npress[1] to See message\npress[2] to Delete mail\npress[3] to Back\n>");
            System.out.println("Press[1] to Read Mail | Press[2] to Delete Mail");
            System.out.println("Press[3] to Back");
            System.out.print(">");
            String sd = sc.nextLine();
                switch(sd){
                    case "1":MessageJMail(); break;
                    case "2":DeleteJMail(); break;
                    case "3":choose7(); break;
                    default:System.out.println("------------------Please enter only 1-3-----------------"); JunkMail();
                }
    
    }
       
       public void MessageJMail(){
            System.out.print("\nNumber title :");
            int rrm =stringcal();
                if(rrm<=0){
                System.out.println("\n----------Cannot found Name Reciever------------");
                MessageJMail();
                }
                if(rrm >j){
                System.out.println("\n----------Cannot found Name Reciever------------");
                MessageJMail();
                }
            System.out.println("\n==================================================");
            System.out.println("\n[TITLE ]                     " +JM[n][rrm-1]); 

            System.out.println("\nMASSAGE :"); 
                             for(c4=0;c4<=y;c4++){ 
                                  if(JM2[n][rrm-1][c4] == null ||JM2[n][rrm-1][c4].equals("n")){c4++;}
                                  else{System.out.println("             "+JM2[n][rrm-1][c4]);   
                                  }
                             }
            System.out.println("==================================================");                
            JunkMail();
       }  
       
       public void DeleteJMail(){
           Scanner ch = new Scanner(System.in);
           System.out.println("");
           System.out.println("Do you want to Delete JunkMail ?");
           System.out.println("Type[YES] to Delete | Type[NO] to Back");
           System.out.print(">");
           String Drm1 = ch.nextLine();
           Drm1=Drm1.toUpperCase();
            switch(Drm1){
                case "YES":System.out.print("\nEnter number of title to delete : ");
                           int Drm2 = stringcal();
                           BIN[n][b]  = JM[n][Drm2-1];
                           
                            for(int i =0;i<=c4 ;i++){
                                  BIN2[n][b][i]=JM2[n][Drm2-1][i];
                            } 
                                                                           
                           JM [n][Drm2-1] = null;    
                           b++;
                           System.out.println("\n-----------------DELETE SUCCESS!------------------");JunkMail();                             
                case "NO" :choose7(); break;
                default : System.out.println("PLESE ENTER ONLY \"YES\" or \"No\"");JunkMail();     
            }
       }        
}


class Contact extends Choose7{
       public void register(){}
       public void Contactlist(){
           ALEART[n][2]="";
           System.out.println("\n==================================================");
            System.out.println("------------------ Contact List ------------------");
            System.out.println("==================================================");
                
                for(int z=0 ;z<=c5;  z++){     //sort array        
                   if(CT[n][0]==null ){                     
                       for(int x=0;x<=c5; x++){      
                         CT [n][x] = CT[n][x+1];  
                       }
                   }
                   if(CT[n][z]==null ){                     
                       for(int x=z;x<=c5; x++){      
                         CT[n][x] = CT[n][x+1];  
                       }
                   }
                }     

                for(int z=0 ;z<c5; z++){     //print
                    if(CT[n][z] == null){z++;}
                    else{
                    System.out.println("\"> USER : "+(z+1)+"]   >"+CT[n][z]);       
                     }
                 }


                if(CT[n][0]==null){
                  System.out.println("\n             -CONTACT HISTORY [EMPLY]\n");
                  System.out.println("--------------------------------------------------");
                  SeeProfile();                
                }
                        
            System.out.println("\n--------------------------------------------------");   
            SeeProfile();
       
       }
       
       public void SeeProfile(){
            Scanner sc = new Scanner(System.in); 
            String see1; 
            System.out.println("Do you want to Search Profile ?");
            System.out.println("Type[YES] to Delete | Type[NO] to Back");
            System.out.print(">");
            String see = sc.nextLine();
            see = see.toUpperCase();
            switch(see){
                 case "YES": t=getAllRegister();
        
                             System.out.println("Enter name user :");
                             see1 = sc.nextLine();

                                 for(int z=0 ;z<=t ;z++){                             
                                          if(see1.equals(nameUser[z])){  
                                                 System.out.println("\n------------PROFILE ["+nameUser[z]+"] ------------");

                                                     if(PF[z][0] ==null){System.out.println("\nEMAIL : [----EMPLY----]");}                                               
                                                     else{ System.out.println("\nEMAIL : "+PF[z][0]);}

                                                     if(PF[z][1] ==null){System.out.println("\nPHONE NUMBER : [----EMPLY----]");}                                                       
                                                     else{ System.out.println("\nPHONE NUMBER : "+PF[z][1]);}

                                                     if(PF[z][2] ==null){System.out.println("\nINTRODUCE : [----EMPLY----]");}                                                    
                                                     else{ System.out.println("\nINTRODUCE : "+PF[z][2]);}

                                                  CT[n][c5]= see1; 
                                                  c5++;
                                                  System.out.println("------------------------------------");
                                                  choose7();
                                          }                          
                                  }    
                             System.out.println("\n---------------Cannot found Name Reciever---------------");	                          
                             SeeProfile();

                 case "NO":choose7();break;
                 default :System.out.println("---------------ENTER ONLY [YES or NO]----------------");SeeProfile();break;
            }
       }
}


class Profile extends Choose7{
       public void register(){}
       public void profile(){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n-----------------[YOUR PROFILE]-------------------");   

                 System.out.println("\nEmail :"+PF[n][0]);
                 System.out.println("\nPhone number :"+PF[n][1]);
                 System.out.println("\nIntroduce :"+PF[n][2]);

            System.out.println("\n--------------------------------------------------");   

            System.out.print("Select to edit a form >\nPress[1] to Enter your E-mail\n"
                             + "Press[2] to Enter your phone number\nPress[3] to Introduce yourself \n"
                             + "Press[4] to back\n>");
            String fill =sc.nextLine();

            switch(fill){
                case "1": System.out.print("\nEnter your E-mail :");
                          PF[n][0] = sc.nextLine();
                          System.out.println("--------------------Fill Success------------------");profile();break;
                case "2": System.out.print("\nEnter your phone number :");
                          PF[n][1] = sc.nextLine();
                          System.out.println("--------------------Fill Success------------------");profile();break;
                case "3": System.out.print("\nIntroduce yourself :");
                          PF[n][2] = sc.nextLine();
                          System.out.println("--------------------Fill Success------------------");profile();break;
                case "4": choose7();
                default :System.out.println("\n---------------PLEASE PRESS ONLY 1-3-----------------");profile();break;                            
            }  
       }
} 


class Main{
    public static void main(String[] args) {
        registerUser a = new registerUser();
        a.press();
    }
}