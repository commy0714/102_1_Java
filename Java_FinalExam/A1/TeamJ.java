import java.util.*;

public class TeamJ{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	int z=0;
	int nn;

	while(z!=1){
		System.out.println("1.�׷��K�X");
		System.out.println("2.�q�Ʀr");
		System.out.println("3.����");
		nn=sc.nextInt();
		switch(nn){
			case 1:
				int num;
				num=(int)(Math.random()*100+1);
				System.out.println("�п�J�q�����Ʀr(����1~100��)");
				int ng=sc.nextInt();
				int aa=0;
				int xx=1,yy=100;
				int gt=1;
				while(aa!=1){
					if(ng<num){
						xx=ng;
						System.out.println("�п�J�q�����Ʀr("+xx+"~"+yy+")");
					}
					if(ng>num){
						yy=ng;
						System.out.println("�п�J�q�����Ʀr("+xx+"~"+yy+")");
					}
					if(ng==num){
						System.out.println("���߲q��F!!");
						System.out.println("�z�q�F"+gt+"���A����!!");
						aa++;
						break;
					}
					ng=sc.nextInt();
					gt++;
				}
				break;
			case 2:
				int[] iArray = new int[4];
				  int[] eArray = new int[4];
				  int i;
				  int ans [] = new int[4];
				  int A = 0, B = 0;
				  boolean theSame;
				  do {
				   theSame = false;
				   for(i = 0; i < 4; i++) {
				    iArray[i]=(int)(Math.random()*9+1);
				   }
				   for (int x = 0; x < 3; x++) {
				    for(int y = x + 1; y < 4; y++) {
				     if(iArray[x] == iArray[y]) {
				      theSame = true;
				      break;
				     }
				    }
				   }
				  } while (theSame);
				  
				  for(i = 0; i < iArray.length; i++){}
				  
				  Scanner scanner = new Scanner(System.in); 
				  System.out.println("�вq�|�ӼƦr(1-9)(���i���@�˪��Ʀr)\n");
				  
				  while (A != 4) {
				   A = 0; B = 0;
				   for (int f = 1; f <= ans.length; f++) {
				    System.out.print("�п�J��" + f + "�ӼƦr:");
				    ans[f-1] = scanner.nextInt();
				   }
				   for(int j = 0; j < ans.length; j++) {
				    System.out.print(ans[j]+" ");
				   }
				   for (int u = 0; u < ans.length; u++) {
				    if(iArray[u] == ans[u]) {
				     A++;
				     continue;
				    }
				    for(int k = 0; k < ans.length; k++) {
				     if(ans[u] == iArray[k]) {
				      B++;
				      break;
				     }
				    }
				   }
				   System.out.println("\n"+A+"A");
				   System.out.println(B+"B");
				  } 	
				break;
			case 3:
				z++;
				break;
		}
	}
}
}
