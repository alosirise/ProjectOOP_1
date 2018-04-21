package projectoopgit;
import java.util.Scanner;
import static projectoopgit.abChoose7.ALEART;
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
