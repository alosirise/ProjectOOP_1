package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.ALEART;
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