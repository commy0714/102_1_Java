import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;


public class YO {
	public static void main(String[] args) throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int out=0;
		while(out == 0){
			System.out.println("���C��,1�q�Ʀr,2�׷��K�X,3���}...");	//�����D�حn�D
			String str = br.readLine();
			int count = Integer.parseInt(str);
			switch(count){
				case 1:	
					int cc=0;	//�P�_��
					int time = 0;
					int number = (int)(Math.random()*100);
					while(cc==0){
						System.out.println("�п�J1~100���Ʀr:");
						String str1 = br.readLine();
						int gauss = Integer.parseInt(str1);
						if(gauss == number){
							if(time<9){
								System.out.println("�q��F�I,����");
								cc=-1;
							}
							if(time<14 && time>8){
								System.out.println("�q��F�I,�F�`");
								cc=-1;
							}
							if(time>13){
								System.out.println("�q��F�I,�Цh�m��");
								cc=-1;
							}
						}
						else{
							if(gauss > number){
								System.out.println("��J�p�@�I");
								time++;
							}
							else{
								System.out.println("��J�j�@�I");
								time++;
							}
						}
					}
					break;
				case 2:
					Random rand = new Random(System.currentTimeMillis());
					int aa =0;
					int[] fourQ = new int[5];
					for(int i = 0;i<4;i++){
						fourQ[i] = ((int)(rand.nextInt()%10)+10)%10;
						System.out.println(fourQ[i]);
					}
					while(aa==0){
						System.out.println("�п�J4���");
						String str2 = br.readLine();
						int fourA = Integer.parseInt(str2);
						int[] fourAn = new int[4];
						fourAn[0] = fourA/1000;
						System.out.println();
						fourA -= fourAn[0]*1000;
						fourAn[1] = fourA/100;
						fourA -= fourAn[1]*100;
						fourAn[2] = fourA/10;
						fourA -= fourAn[2]*10;
						fourAn[3] = fourA;
						int A=0,B=0;
						if(fourQ[0]!=fourAn[0]||fourQ[1]!=fourAn[1]||fourQ[2]!=fourAn[2]||fourQ[3]!=fourAn[3]){
							for(int j=0;j<4;j++){
								for(int k=0;k<4;k++){
									if(fourQ[j] == fourAn[k]){
										if(j==k)A++;
										else B++;
									}
								}
							}
							System.out.println("A"+A+"B"+B);
						}
						else{
							System.out.println("Bingo");
							aa =1;
						}
					}
					break;
				case 3:
					out = 1;
			}
		}
	} 
}
