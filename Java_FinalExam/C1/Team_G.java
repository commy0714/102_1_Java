import java.util.*;  
import java.io.*;  
import java.nio.Buffer;  
public class TeamG {  
  
public static void main(String[] args, FileReader read){  
    Scanner sc =new Scanner(System.in);  
    Scanner sc2 =new Scanner(System.in);
    Scanner sc3 =new Scanner(System.in);
        String [] id=new String[5];   
        String [] Subject={"���","�^��","�ƾ�"};  
        int [] chScore=new int[5];  
        int [] engScore=new int[5]; 
        int [] matScore=new int[5];
        double  chAvg=0.0D,engAvg=0.0D;  
        //double[] avg = new double[5];  
    int[]sum=new int[5];  
    int i;  
    int num,choice,suj;  
    boolean n=true;  
  
        System.out.println("�п�J����ǥͪ��y��");  
        for(i=0; i<5 ;i++){  
    id[i] =sc.next();   
        }  
        for(i=0; i<5 ;i++){  
    System.out.println("�п�J" +id[i] + "��" + Subject[0] + "���Z");    
      chScore[i]=sc.nextInt();  chAvg+=chScore[i]* 1.0D / 5;  
        }  
        for(i=0; i<5 ;i++){  
      System.out.println("�п�J"  +id[i] + "��" + Subject[1] + "���Z");  
    engScore[i]=sc2.nextInt(); engAvg+=engScore[i]* 1.0D / 5;  
    }  
        for(i=0; i<5 ;i++){  
            System.out.println("�п�J"  +id[i] + "��" + Subject[1] + "���Z");  
          matScore[i]=sc2.nextInt(); double matAvg = matScore[i]* 1.0D / 5;  
          }  
          
      System.out.println("\n�m�W\t���\t�^��\t�ƾ�\t�ӤH�`��");   
      for(i=0; i<5; i++){  
      //avg[i]=(double)((chScore[i]+engScore[i])* 1.0D/2);    
    sum[i]+=(chScore[i]+engScore[i]);   
      //System.out.println(id[i] +"\t" + chScore[i] + "\t" + engScore[i] +"\t" + avg[i]+"\t" + sum[i]);      
      } System.out.println("_______________________________________________");   
          
        for(int s=0; s<sum.length-1; s++){  
        for(int t=s+1; t<sum.length; t++){  
        if(sum[t] > sum[s]){  
        int tmp = sum[t];  
        sum[t] = sum[s];  
        sum[s] = tmp;      
        }  
        }  
        }System.out.println();  
        for(int k=0; k<sum.length; k++){  
        System.out.println("��" + (k+1) + "�W�����ƬO" + sum[k] + "���C");  
          
        }  
           
while(n){  
  
  
       System.out.println("\n 1.�ƧǦ��Z\n 2.���}");  
  
  
       System.out.print("�п�J�ﶵ:");  
  
  
       Object buf;  
    //choice=Integer.parseInt(((Object) buf).readLine());  
  
  
        
  
  
      switch (choice){  
  
  
      case 1:    
  
  
       System.out.print("�d�߬��---------------------- > \n 1-���  \n 2-�^��    \n-------------------\n�i�п�J�j :");  
  
  
      
  
  
       switch(suj){  
  
       case 1:    
  
  
        System.out.print("�d�߬��:���  \n�п�J�d�߮y��:");  
  
  
        num=Integer.parseInt.readLine());  
  
  
        System.out.println("�d�ߦ��\---------------------- > \n��妨�Z:"+ chScore[num]);  
  
  
        break;  
  
  
       case 2:    
  
  
        System.out.print("�d�߬��:�^��   \n�п�J�d�߮y��:");  
  
  
        num=Integer.parseInt.readLine());  
  
  
        System.out.println("�d�ߦ��\---------------------- > \n�^�妨�Z:"+engScore[num]);  
  
  
        break;  
  
       case 3:    
    	   
    	   
           System.out.print("�d�߬��:�ƾ�  \n�п�J�d�߮y��:");  
     
     
           num=Integer.parseInt.readLine());  
     
     
           System.out.println("�d�ߦ��\---------------------- > \n�ƾǦ��Z:"+ chScore[num]);  
     
     
           break;  
        
         
       }  
  
  
       break;  
  
  
 
  
         
  
  
      case 3:  
  
  
       System.out.println("�y��\t���\t�^��\t�ƾ�\t");  
  
  
  
  
        System.out.println(i+"�� \t"+chScore[i]+"\t"+engScore[i]+"\t");  
  
  
          
  
  
       System.out.println("�d�ߦ��\�I\n");  
  
  
       break;  
  
  
         
  
  
      default:   
  
  
       System.out.println("���}");  
  
  
       n=false;  
  
  
       break;  
  
  
         
  
  
              }  
  
  
           }  
  
  
        
  
  
       }  
  
  
        
  
    } 