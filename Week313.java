import java.util.*;

class Week313{
 public static void main(String args[])throws InterruptedException{
 Random x=new Random();
 int success=0;
 for(int i=0;i<10;i++){
 int die1=x.nextInt(6)+1;
 int die2=x.nextInt(6)+1;
 
 if(die1==die2)
 success++;

Thread.sleep(1000);
}
System.out.println("sucess is: "+success);}}