import java.util.*;  

public class TeamE{  
    public static void main(String[] args){  
        Scanner sc =new Scanner(System.in);  
            int[][] score = new int[6][5];
	    String[]a ={"Tonny","Stone","Rock","Ben","Willie"};
	    System.out.println("        1. �ƧǦ��Z");  
	    System.out.println("        2. ���}"); 
	    int x;
	    for(int i=0;i<5;i++){  
		score[i][0]=i+1;
                for(int j=1;j<4;j++){  
                    	score[i][j]=(int)(Math.random()*101); 
                }  
            }  
          
            for(int i=0;i<5;i++){  
                for(int j=1;j<4;j++){  
                    	score[i][4]+=score[i][j];  
                }  
            }  
	    x=sc.nextInt();
	    while(x!=2){
	    	switch(x){
	    		case 1: 
	    			System.out.println("        1. �ƧǸ�"); 
	    			System.out.println("        2. �ư��"); 
	    			System.out.println("        3. �ƭ^��"); 
	    			System.out.println("        4. �Ƽƾ�"); 
	    			System.out.println("        5. ���`��"); 
				
           			x=sc.nextInt();
                		for (int i=0;i<score.length;i++) {  
                       			 for (int j=0;j<score.length-1;j++){  
                               			 if (score[j+1][x-1]>score[j][x-1]){  
							score[5] = score[j+1];    
                                    			score[j+1]=score[j];  
                                   			 score[j]= score[5];  
							String temp;
							if(j<4){
								temp = a[j+1];
								a[j+1]=a[j];
								a[j] =temp;
							}
                                    		}  
                        		}  
                    		}  
                    		for(int i=0;i<5;i++){  
                			for(int j=0;j<5;j++){
						if(j==0){
							System.out.printf("%-6s",a[i]);
							System.out.printf("%3d  ",score[i][j]);
						}
                    				else if(j==4)  
							System.out.printf("%3d",score[i][j]);
                    				else 
							System.out.printf("%3d  ",score[i][j]);  
 
                			}  
                		System.out.println("");  
            			}	  
	    			System.out.println("        1. �ƧǦ��Z");  
	    			System.out.println("        2. ���}"); 
				x=sc.nextInt();
				break;	
	    		default:
				System.out.println("        1. �ƧǦ��Z");  
	    			System.out.println("        2. ���}"); 
				x=sc.nextInt();
				break;
                }
	}

    }
}  