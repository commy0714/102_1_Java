import java.io.*;
public class Q2 {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
		        new BufferedReader(new InputStreamReader(System.in));
		int date=5,time=10;
		    String[][] a=new String[time][date];
		String[] w={"�@","�G","�T","�|","��","��","�C","�K","�E","�Q"};      
		    	  for(int j=0;j<date;j++){
		    		  System.out.println("�P��"+w[j]);
		    		  for(int i=0;i<time;i++){
		    			  System.out.print("��"+w[i]+"�`:");
		    		  a[i][j]=br.readLine();
		    		  if(a[i][j]=="\n"){
		    			  a[i][j]="  ";
		    		  }
		    	  }
		      }
		    	  for(int i=0;i<date;i++){
		    	System.out.print("\t"+w[i]+"\t");
		    	
		    	  }
		    	  System.out.println();
		      for(int i=0;i<time;i++){
		    	  System.out.print(i+1);
		    	  for(int j=0;j<date;j++){
		    		  System.out.print("\t"+a[i][j]+"\t");
		    	  }
		    	  System.out.print("\n");
		      } 
		 System.out.println(); 
		      boolean b=true;
		do{
		      System.out.println("��ܬd�ߤ覡: ");
		      System.out.println("1.�H�ɶ��d�߽ҵ{ 2.�H�ҵ{�d�߮ɶ� 3.�����d��");
		      int num=Integer.parseInt(br.readLine());
		     
		 switch(num){
		 	case 1:
		 		System.out.print("��J�P��:");
			    int n=Integer.parseInt(br.readLine());
			    System.out.print("��J�ĴX�`:");
			    int f=Integer.parseInt(br.readLine());
			    System.out.println(a[f-1][n-1]);
			    break;
		 	case 2:
		 		System.out.println("��J�ҵ{�W��: ");
			      for(int i=0;i<time;i++){
			    	  for(int j=0;j<date;j++){
			    		  if(br.readLine().equals(a[i][j]))
			    			  System.out.println("�P��"+(j+1)+"���� "+(i+1)+"�`");
			    	  }
			      }
			      break;
		 	case 3:
		 		 System.out.println("stop search.");
		 		 b=false;
		 		 break;
			default:
			    	  System.out.println("error");
			    	  break;
		 }
		      }while(b);
	}
}

