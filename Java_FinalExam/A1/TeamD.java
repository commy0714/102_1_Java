import java.io.*;
import java.util.Scanner;
class TeamD{
	public static void main(String[] args){
	     Scanner sca = new Scanner(System.in);
	     int qu;
	     int con=0,timer=0,cho=0,w=0,j=0,r=0,i=0;
	     int ans;
	     do{
	    	 System.out.println("1.�׷��K�X");
	    	 System.out.println("2.�q�Ʀr");
	    	 System.out.println("3.����");
	    	 cho=sca.nextInt();
	    	 if(cho==1){
			     do{
			    	 qu=(int)(Math.random()*99)+1;
			    	 if(con==0)
			    		 System.out.print("�п�J�q���Ʀr(����1~100��):");
			    	 else
			    		 System.out.print("�A��J�q���Ʀr:");
			    	 ans=sca.nextInt();
			    	 if(ans<qu){
			    		 System.out.println("�j�@�I");
			    		 con++;
			    	 }
			    	 else if(ans>qu){
			    		 System.out.println("�p�@�I");
			    		 con++;
			    	 }
			    	 else if(ans==qu){
			    		 if(con<=8)
			    			 System.out.println("�A�q�F"+con+"���A����");
			    		 else if(con<=13)
			    			 System.out.println("�A�q�F"+con+"���A�F�`");
			    		 else if(con>14)
			    			 System.out.println("�A�q�F"+con+"���A�Цh�m��");
			    	 timer=1;
			    	 }
			     }while(timer!=1);
	    	}
	    	if(cho==2){
	    		int [][]num=new int [2][4];
	    		for(i=0;i<4;i++)
	    			num[0][i]=(int)(Math.random()*9);
			for(i=0;i<4;i++)
				for(j=0;j<4;j++)
				   if(num[0][i]==num[0][j]){
					num[0][i]=(num[0][i]+(int)(Math.random()*9))%10;
				   }
			System.out.println("�вq�|�ӼƦr(1-9)(���i���@�˪��Ʀr)");
			System.out.println(" ");
			do{
				for(i=0;i<4;i++){
					System.out.print("�п�J��"+(i+1)+"�ӼƦr:");
					num[1][i]=sca.nextInt();
				}
	    			 for(i=0;i<4;i++){
		 			 if(num[1][i]==num[0][i])
		     				  r++;
		 			 else
		       				for(j=0;j<4;j++)
	             	    				if(num[1][i]==num[0][j])
		  	        				w++;
	     	 		 }
				for(i=0;i<4;i++)
					System.out.print(num[1][i]+" ");
				System.out.println(" ");
	     			System.out.println(r+"A");
	     			System.out.println(w+"B");
				if(r==4)
				    timer=1;
				r=0;
				w=0;
			}while(timer!=1);
	    	}
	    	
	     }while(cho!=3);
	     System.out.println("end!!");
	 }
}


