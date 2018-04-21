package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.b;
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
