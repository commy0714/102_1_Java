import java.util.Random;  
import java.lang.Math;
import java.io.*;    
class TeamM{    
    public static void main(String[] args) throws IOException {    
        BufferedReader br =     
         new BufferedReader ( new InputStreamReader (System.in));       //�A���j��O
        String[] name = new String[5];
        int[][]score = new int[5][5];   
		int i=0,j=0;
		String str;  
        for(i=0;i<5;i++){  
			str = br.readLine(); 
			name[i]=str;
			for(j=0;j<1;j++)
				score[i][j]=i+1;
			for(j=1;j<4;j++){
				score[i][j]=(int)(Math.random()*101); 
				score[i][4]+=score[i][j];
			}
        }   
		int l;
		int o;
		System.out.println("1.�ƧǦ��Z");
		System.out.println("2.���}");
		str = br.readLine(); 
		l=Integer.parseInt(str);
		int[] tamp = new int [5];
		String e;
		switch(l){  
            case 1:
				System.out.println("1.�ƧǸ�");
				System.out.println("2.�ư��");
				System.out.println("3.�ƭ^��");
				System.out.println("4.�Ƽƾ�");
				System.out.println("5.���`��");
				str = br.readLine(); 
				o=Integer.parseInt(str);
				switch(o){
					case 1:
						for(i=0;i<5;i++){
							for(j=0;j<5;j++){
								if(score[i][0]>score[j][0]){
									e=name[i];
									name[i]=name[j];
									name[j]=e;
									tamp=score[i];
									score[i]=score[j];
									score[j]=tamp;
								}
							}
						}
						for(i=0;i<5;i++){  
							System.out.print(name[i]+"\t");
							for(j=0;j<5;j++){
								System.out.print(score[i][j]+"\t");
							}
							System.out.println();
						}
						break;
					case 2:
						for(i=0;i<5;i++){
							for(j=0;j<5;j++){
								if(score[i][1]>score[j][1]){
									e=name[i];
									name[i]=name[j];
									name[j]=e;
									tamp=score[i];
									score[i]=score[j];
									score[j]=tamp;
								}
							}
						}
						for(i=0;i<5;i++){  
							System.out.print(name[i]+"\t");
							for(j=0;j<5;j++){
								System.out.print(score[i][j]+"\t");
							}
							System.out.println();
						}
						break;
					case 3:
						for(i=0;i<5;i++){
							for(j=0;j<5;j++){
								if(score[i][2]>score[j][2]){
									e=name[i];
									name[i]=name[j];
									name[j]=e;
									tamp=score[i];
									score[i]=score[j];
									score[j]=tamp;
								}
							}
						}
						for(i=0;i<5;i++){  
							System.out.print(name[i]+"\t");
							for(j=0;j<5;j++){
								System.out.print(score[i][j]+"\t");
							}
							System.out.println();
						}
						break;
					case 4:
						for(i=0;i<5;i++){
							for(j=0;j<5;j++){
								if(score[i][3]>score[j][3]){
									e=name[i];
									name[i]=name[j];
									name[j]=e;
									tamp=score[i];
									score[i]=score[j];
									score[j]=tamp;
								}
							}
						}
						for(i=0;i<5;i++){  
							System.out.print(name[i]+"\t");
							for(j=0;j<5;j++){
								System.out.print(score[i][j]+"\t");
							}
							System.out.println();
						}
						break;
					case 5:
						for(i=0;i<5;i++){
							for(j=0;j<5;j++){
								if(score[i][4]>score[j][4]){
									e=name[i];
									name[i]=name[j];
									name[j]=e;
									tamp=score[i];
									score[i]=score[j];
									score[j]=tamp;
								}
							}
						}
						for(i=0;i<5;i++){  
							System.out.print(name[i]+"\t");
							for(j=0;j<5;j++){
								System.out.print(score[i][j]+"\t");
							}
							System.out.println();
						}
						break;
					default:  
						break; 
				}
				break;
			case 2:
				break;
			default:  
				break;  
        }
          
		
    
    }    
}  