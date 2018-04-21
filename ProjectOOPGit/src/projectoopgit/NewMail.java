
package projectoopgit;

import java.util.Date;
import java.util.Scanner;
import static projectoopgit.abChoose7.NM;



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