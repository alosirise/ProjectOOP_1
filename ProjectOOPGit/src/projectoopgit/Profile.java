package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.PF;
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
