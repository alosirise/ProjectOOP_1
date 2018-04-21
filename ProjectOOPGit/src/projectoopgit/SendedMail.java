
package projectoopgit;

import java.util.Scanner;
import static projectoopgit.abChoose7.c2;

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