package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.ALEART;
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
