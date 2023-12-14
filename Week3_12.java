import java.util.*;

class Week3_12{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 ArrayList<Integer> list=new ArrayList<>();
 int k=0,f=0;
 
 while(true){
 int id1=sc.nextInt();
 for(int i=0;i<list.size();i++){
 int x=list.get(i);
 if(x==id1)
 f=1;}

 if(f==0){
 list.add(id1);
 k++;}
 else{
 System.out.println("Duplicate");
 f=0;}
 if(k==5)
 break;}
 System.out.println(list);}}
 
