import java.io.*;
 
/*
	���ѵ����M���T�����g�Ӧh�L�N�q���{���X�A�\�h�{���X�i�নfunction�άO����ơA�p��P�y�]�S���Q�Τ@�Ӥ�X�Ѫ������C
	��ܧY�ק����ϥ�²�檺function�A�åB�Q�ΤѼƭp�⪺�覡�ӨM�w�P�y�A�ӫD�P�_����[����A�y���L�h��switch case�C
*/
 
class k2{  
    public static void main (String[] args) throws IOException{  
        BufferedReader br=  
          new BufferedReader(new InputStreamReader(System.in));  
        int[][]score=new int [20][20];
        int num=0,a=0;
        String[] strArray = new String[20];
        String[] result = new String[20];
        
        System.out.println("1.�s�W\n2.���\n3.�ק�ͤ�\n4.�g�X�ɮ�\n5.����");
        System.out.println("�п�J�N�X: ");
        String n=br.readLine();
        num=Integer.parseInt(n);
        
        while(num != 5)
        {
	        switch(num)
	        {
	            case 1:
	            	
	            	System.out.println("�п�J�m�W");
	            	String y=br.readLine();
	            	strArray[a] = y;
	                for(int b=0;b<2;b++){
	                	if( b == 0 )
	                		System.out.println("�п�J���");
	                	if( b == 1 )
	                		System.out.println("�п�J���");
	                    String point=br.readLine();  
	                    score[a][b]=Integer.parseInt(point);
	                }
	                
	                switch(score[a][0])
	                {
			        	case 1:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="�]�~�y";
			              else if(score[a][1]>=21 && score[a][1]<=31)
			            	  result[a]="���~�y";
			              break;
			        	case 2:
			              if(score[a][1] >=1 && score[a][1] <=19)
			            	  result[a]="���~�y";
			              else if(score[a][1]>=20 && score[a][1]<=29)
			            	  result[a]="�����y";
			              break;
			        	case 3:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="�����y";
			              else if(score[a][1]>=21 && score[a][1]<=31)
			            	  result[a]="�d�Ϯy";
			              break;
			        	case 4:
			              if(score[a][1] >=1 && score[a][1] <=20)
			            	  result[a]="�d�Ϯy";
			              else if(score[a][1]>=21 && score[a][1]<=30)
			            	  result[a]="�����y";
			              break;
			        	case 5:
			              if(score[a][1] >=1 && score[a][1] <=21)
			            	  result[a]="�����y";
			              else if(score[a][1]>=22 && score[a][1]<=31)
			            	  result[a]="���l�y";
			              break;
			        	case 6:
			              if(score[a][1] >=1 && score[a][1] <=21)
			            	  result[a]="���l�y";
			              else if(score[a][1]>=22 && score[a][1]<=30)
			            	  result[a]="���ɮy";
			              break;
			        	case 7:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="���ɮy";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="��l�y";
			              break;
			        	case 8:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="��l�y";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="�B�k�y";
			              break;
			        	case 9:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="�B�k�y";
			              else if(score[a][1]>=24 && score[a][1]<=30)
			            	  result[a]="�ѯ��y";
			              break;
			        	case 10:
			              if(score[a][1] >=1 && score[a][1] <=23)
			            	  result[a]="�ѯ��y";
			              else if(score[a][1]>=24 && score[a][1]<=31)
			            	  result[a]="���Ȯy";
			              break;
			        	case 11:
			              if(score[a][1] >=1 && score[a][1] <=22)
			            	  result[a]="���Ȯy";
			              else if(score[a][1]>=23 && score[a][1]<=30)
			            	  result[a]="�g��y";
			              break;
			        	case 12:
			              if(score[a][1] >=1 && score[a][1] <=22)
			            	  result[a]="�g��y";
			              else if(score[a][1]>=23 && score[a][1]<=31)
			            	  result[a]="�]�~�y";
			              break;
	                }
	                a++;
	                break;  
	            case 2:
	            	for(int k=0;k<a;k++){  
                        for(int j=0;j<3;j++){
                        	if(j==0){
                        		System.out.print(strArray[k]+" ");
                        		System.out.print(score[k][j]+"��");
                        	}
                            if(j==1)
                            	System.out.print(score[k][j]+"��");
                            else
                            	System.out.println(result[k]);
                        }
                    }
	                break;
	            case 3:
	            	System.out.println("�п�J�m�W");
	            	String de=br.readLine();
	            	for(int b = 0 ; b < a ; b++ ){
	            		if( strArray[b].equals(de) ){
	            			for(int c = 0 ; c < 2 ; c++ ){
	            				if( c == 0 )
	    	                		System.out.println("�п�J���");
	            				if( c == 1 )
	    	                		System.out.println("�п�J���");
	    	                    String point=br.readLine();
	    	                    score[b][c]=Integer.parseInt(point);
	    	                }
	            			switch(score[b][0])
	    	                {
	    			        	case 1:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="�]�~�y";
	    			              else if(score[b][1]>=21 && score[b][1]<=31)
	    			            	  result[b]="���~�y";
	    			              break;
	    			        	case 2:
	    			              if(score[b][1] >=1 && score[b][1] <=19)
	    			            	  result[b]="���~�y";
	    			              else if(score[b][1]>=20 && score[b][1]<=29)
	    			            	  result[b]="�����y";
	    			              break;
	    			        	case 3:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="�����y";
	    			              else if(score[b][1]>=21 && score[b][1]<=31)
	    			            	  result[b]="�d�Ϯy";
	    			              break;
	    			        	case 4:
	    			              if(score[b][1] >=1 && score[b][1] <=20)
	    			            	  result[b]="�d�Ϯy";
	    			              else if(score[b][1]>=21 && score[b][1]<=30)
	    			            	  result[b]="�����y";
	    			              break;
	    			        	case 5:
	    			              if(score[b][1] >=1 && score[b][1] <=21)
	    			            	  result[b]="�����y";
	    			              else if(score[b][1]>=22 && score[b][1]<=31)
	    			            	  result[b]="���l�y";
	    			              break;
	    			        	case 6:
	    			              if(score[b][1] >=1 && score[b][1] <=21)
	    			            	  result[b]="���l�y";
	    			              else if(score[b][1]>=22 && score[b][1]<=30)
	    			            	  result[b]="���ɮy";
	    			              break;
	    			        	case 7:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="���ɮy";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="��l�y";
	    			              break;
	    			        	case 8:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="��l�y";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="�B�k�y";
	    			              break;
	    			        	case 9:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="�B�k�y";
	    			              else if(score[b][1]>=24 && score[b][1]<=30)
	    			            	  result[b]="�ѯ��y";
	    			              break;
	    			        	case 10:
	    			              if(score[b][1] >=1 && score[b][1] <=23)
	    			            	  result[b]="�ѯ��y";
	    			              else if(score[b][1]>=24 && score[b][1]<=31)
	    			            	  result[b]="���Ȯy";
	    			              break;
	    			        	case 11:
	    			              if(score[b][1] >=1 && score[b][1] <=22)
	    			            	  result[b]="���Ȯy";
	    			              else if(score[b][1]>=23 && score[b][1]<=30)
	    			            	  result[b]="�g��y";
	    			              break;
	    			        	case 12:
	    			              if(score[b][1] >=1 && score[b][1] <=22)
	    			            	  result[b]="�g��y";
	    			              else if(score[b][1]>=23 && score[b][1]<=31)
	    			            	  result[b]="�]�~�y";
	    			              break;
	    	                }
	            		}
	            	}
	                break;
	            case 4:
	            	try{
	            	    PrintWriter pw=new PrintWriter
	            		(new BufferedWriter(new FileWriter("birthday.txt",true)));
	            	    for(int k=0;k<a;k++){  
	                        for(int j=0;j<3;j++){
	                        	if(j==0){
	                        		pw.print(strArray[k]+" ");
	                        		pw.print(score[k][j]+"��");
	                        	}
	                            if(j==1)
	                                pw.print(score[k][j]+"��");
	                            else
	                                pw.println(result[k]);
	                        }
	                    }
	            	    System.out.println("SAVED\n");
	            	    pw.close();
	            	}
	            	catch(IOException e){
	            	    System.out.println("ERROR");
	            	}
	            	break;
	            default:
	                break;
	        }
	        System.out.println("1.�s�W\n2.���\n3.�ק�ͤ�\n4.�g�X�ɮ�\n5.����");
	        System.out.println("�п�J�N�X: ");
	        n=br.readLine();
	        num=Integer.parseInt(n);
        }
    }
}