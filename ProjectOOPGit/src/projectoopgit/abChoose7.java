

package projectoopgit;

import java.util.Scanner;

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
