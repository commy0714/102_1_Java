import java.io.*;
import java.lang.*;

class TeamM{
	public static void main(String[] args)throws IOException{
		BufferedReader br=
		new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("��J�C��1��:�׷��K�X");
		System.out.println("��J�C��2��:�q�Ʀr");
		System.out.println("��J3��:���}");		
		String str=br.readLine();
		int num=Integer.parseInt(str);
		int count=0;
		int number=0;
		int k=0,i=0;
		int ans=0;
		int a=0,b=0;  
		while(num!=3){
			switch(num){
				case 1:
					do{
						System.out.println("�п�J1~100:");
						number=(int)(Math.random()*100)+1;
						str=br.readLine();
						k=Integer.parseInt(str);
						if(number>k)
							System.out.println("�п�J�j�@�I");
						if(number<k)
							System.out.println("�п�J�p�@�I");
						count++;
						
					}while(numder!=k)
					if(count<9)
						System.out.println("����");
					else if(count>8&&count<14)
						System.out.println("�F�`");
					else
						System.out.println("�Цh�m��");
					break;

				case 2:
					while(a==2&&(b-a)==2){
						int[] ognum=new int[4];  
						int[] gunum=new int[4];  
						for(i=0;i<4;i++){
							ognum[i]=(int)(Math.random()*10)+1;
						}
						for(i=0;i<4;i++){
							str = br.readLine();
							gunum[i]=Integer.parseInt(str);
						}
				        
				        for(i=0;i<4;i++){  
				            if(ognum[i]==gunum[i])  
				                a++;  
				            for(int j=0;j<4;j++){  
				                if(ognum[i]==gunum[j])  
				                    b++;  
				            }  
				        }  
				          
				        System.out.println(a+"A"+(b-a)+"B");   
					}
					break;
				default:
					System.out.println("�п�J1,2,3�䤤�@�ӼƦr");
					break;
			}
			str=br.readLine();
			num=Integer.parseInt(str);
		}
	}
}
