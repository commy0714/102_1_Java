import java.util.*;

public class TeamC{
	public static void main(String [] args){
	int x =0,q;
	x = (int)(Math.random()*99+1); //�NX�]���׷��K�X-�q���ܼ�
	int count=0,n1=0,n2=100; //�N�q�����ơB�̤p�ȡB�̤j�ȳ]�w�n
	Scanner a =new Scanner(System.in);
	System.out.println("1.�׷��K�X");
	System.out.println("2.�q�Ʀr");		//�q�Ʀr�\�ॼ����
	System.out.println("3.����");
	q=a.nextInt();
	System.out.print("��J�q�����Ʀr(����1~100��)");
	while(q!=3){
	     
	     int aa = a.nextInt(); //aa�]���C���̿�J�r
	     count++;
	     if(aa<n1||aa>n2)
	        System.out.print("�A��J�q�����Ʀr"+ n1 +"~"+ n2 );
	     if(aa<100 && aa>0){
	     if(aa<x && aa>n1){
		n1=aa;
		System.out.println("��J�j�@�I");
                System.out.println("�׷��K�X-�d��: " + n1 +"~" + n2);
	    }
	    else if(aa>x && aa<n2){
                   n2=aa;
	           System.out.println("��J�p�@�I");
		   System.out.println("�׷��K�X-�d��: " + n1 +"~" + n2);
	   }
	   else if(aa==x){
		  n1=aa;
		  System.out.println("���ߵ���F!!");
		  if(count<=8){
	              System.out.println("�z�q�F "+count+" ���A����");
		      System.out.println("1.�׷��K�X");
	 	      System.out.println("2.�q�Ʀr");
	              System.out.println("3.����");
	              q=a.nextInt();
	         }
	          else if(count>8 || count<=14){
	              System.out.println("�z�q�F "+count+" ���A�F�`");
		      System.out.println("1.�׷��K�X");
	 	      System.out.println("2.�q�Ʀr");
	              System.out.println("3.����");
	              q=a.nextInt();
	         }
	          else {
	              System.out.println("�z�q�F "+count+" ���A�Цh�m��");
		      System.out.println("1.�׷��K�X");
	 	      System.out.println("2.�q�Ʀr");
	              System.out.println("3.����");
	              q=a.nextInt();
		}
		  
	  }
	  }
	  else
	      System.out.println("��J���~!����!");
    		
	 }
      

	}
	
	}