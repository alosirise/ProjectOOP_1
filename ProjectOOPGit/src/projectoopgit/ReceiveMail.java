package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.ALEART;
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