
import java.io.*;
import java.util.*;



public class TeamG
{
 public static void main(String[] para) 
    {
  System.out.println("\n1.�׷��K�X  \n2.�q�Ʀr \n3.����" );
 
  start();
 }

  private static void start() {

	
}

public static void game() throws InputMismatchException
 {  
	 
  System.out.println("�п�J�@�ӼƦr");
  
  
  int random_no=(int)(Math.random()*100+1);
  Scanner scanner=new Scanner(System.in);
  int a=scanner.nextInt(),b=a;

  if(b==1234){
   a=(int)(Math.random()*100+1);
   System.out.println(a);
  }
  else if(a==100){
   a=random_no;
  }
  else if(a==50){
   System.exit(0);
  }
  
  int i,min=1,max=100;
   ex1 (a,min,max);

  for(i=1;i<max;i++)
  {
   if(max<a){
    a=max;
     }
     else if(a<min){
    a=min;
     }
     else if(random_no<a){
    max=a;
    System.out.println("�A��J�j�@�I���Ʀr:");
     }
     else if(random_no>a){
    min=a;
    System.out.println("�A��J�p�@�I���Ʀr:");
     }
   else{
    System.out.println("���ߵ���F");
    System.out.println();
    break; 
     }
  

   if(b==1234){
    a=(int)(Math.random()*(max-min+1)+min);
    System.out.println(a);
   }
   else if(a==100){
    a=random_no;
   }
   else if(a==88){
    System.exit(0);
   }
   else{
    a=scanner.nextInt();
   }
   ex_2(a,min,max);
  }
  System.out.println("�׷��K�X��"+a);
  System.out.println("�A�`�@�q�F"+i+"��");
  conclusion(i);
  System.exit(0);
 }

 public static void ex1(int a,int min,int max)
 {
  if(a<min||a>max){
   System.out.println("���~�I������J1��100�������Ʀr�A�Э��s��J�I");
   System.out.println();
   game();
  }
  }

 public static void ex_2(int a,int min,int max)
  {
  if(a==max||a==min){
   System.out.println("���i�H���@�˪��Ʀr�Э��s��J");
       } 
    }	//�h�@�ӬA��

  public static void conclusion(int i)
  {
  if(i==1)
 
     System.out.println("����");
  else if(i>=7&&i<=9)
     System.out.println("�F�`");
  else if(i>=9&&i<=13)
     System.out.println("�Цh�m��"); 
  else if(i>=13&&i<=14)		//�L�{���ԭz
  
  break
  