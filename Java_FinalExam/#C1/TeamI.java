import java.util.Scanner;
import java.util.Random;


class TeamI
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//�sĶ���~
				
		int i,j,temp,total;
		Random rand = new Random();

		
		int chi=rand.nextInt(100)+1;
		int eng=rand.nextInt(100)+1;
		int math=rand.nextInt(100)+1;
		total=chi+eng+math;
		
		String[][] all = new string[5][6];
		String[][] all{
			{"AA",1,chi,eng,math,total},//�sĶ���~
			{"BB",2,chi,eng,math,total},//�sĶ���~
			{"CC",3,chi,eng,math,total},//�sĶ���~
			{"DD",4,chi,eng,math,total},//�sĶ���~
			{"EE",5,chi,eng,math,total}//�sĶ���~
		};
		
		
		System.out.println("1.�ƧǦ��Z�C");
		System.out.println("2.���}�C");
		int num = sc.nextInt();
		if(j!=2){
			switch(num){
				case 1:
					System.out.println("1.�ƧǸ�");
					System.out.println("2.�ư��");
					System.out.println("3.�ƭ^��");
					System.out.println("4.�Ƽƾ�");
					System.out.println("5.���`��");
					int num2 = sc.nextInt();
					switch(num2){
						case 1:
							for (int i=0;i<=5;i++){
       								 if (all[i][1] < all[i+1][1]){     
            								for (int x=0;x<5;x++){  							  
                								for (int y=0;y<5;y++){  
                								  
               										all[x][y]=temp;  
                									all[x][y]=all[x+1][y];  
                									all[x+1][y]=temp;  
                								}  
            								}  
        							}  
    							}
							for(int g=0; g < all.length;g++){
								for(int v; v<g ;v++){
									System.out.println("all[g][v]");
								}
							}
 
							break;
						case 2:
							
							for (int i=0;i<=5;i++){
       								 if (all[i][2] < all[i+1][2]){     
            								for (int x=0;x<5;x++){  							  
                								for (int y=0;y<5;y++){  
                								  
               										all[x][y]=temp;  
                									all[x][y]=all[x+1][y];  
                									all[x+1][y]=temp;  
                								}  
            								}  
        							}  
    							}
							for(int g=0; g < all.length;g++){
								for(int v; v<g ;v++){
									System.out.println("all[g][v]");
								}
							}
							break;
						case 3:	
							
							for (int i=0;i<=5;i++){
       								 if (all[i][3] < all[i+1][3]){     
            								for (int x=0;x<5;x++){  							  
                								for (int y=0;y<5;y++){  
                								  
               										all[x][y]=temp;  
                									all[x][y]=all[x+1][y];  
                									all[x+1][y]=temp;  
                								}  
            								}  
        							}  
    							}
							for(int g=0; g < all.length;g++){
								for(int v; v<g ;v++){
									System.out.println("all[g][v]");
								}
							}
							break;
						case 4:
							
							for (int i=0;i<=5;i++){
       								 if (all[i][4] < all[i+1][4]){     
            								for (int x=0;x<5;x++){  							  
                								for (int y=0;y<5;y++){  
                								  
               										all[x][y]=temp;  
                									all[x][y]=all[x+1][y];  
                									all[x+1][y]=temp;  
                								}  
            								}  
        							}  
    							}
							for(int g=0; g < all.length;g++){
								for(int v; v<g ;v++){
									System.out.println("all[g][v]");
								}
							}
							break;
						case 5:
							
							for (int i=0;i<=5;i++){
       								 if (all[i][5] < all[i+1][5]){     
            								for (int x=0;x<5;x++){  							  
                								for (int y=0;y<5;y++){  
                								  
               										all[x][y]=temp;  
                									all[x][y]=all[x+1][y];  
                									all[x+1][y]=temp;  
                								}  
            								}  
        							}  
    							}
							for(int g=0; g < all.length;g++){
								for(int v; v<g ;v++){
									System.out.println("all[g][v]");
								}
							}
							break;
						
					}
				
					break;
				case 2:
					break;


			}
		}
	}

}