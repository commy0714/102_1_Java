import java.util.*;
class TeamC{
	public static void main(String[] args){
	System.out.print("�п�J�}�C�j�p:");
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int sum=0;
	int [][]L=new int[a][a];
	for(int i=0;i<a;i++){
	   System.out.print("\n");
	   for(int j=0;j<a;j++){
	      L[i][j]=(int)(Math.random()*9);
	      System.out.print(L[i][j]+" ");
	   }
 	}
	for(int i=0;i<a;i++){
	   int j=i;
	   sum+=L[i][j];
	}
	for(int i=a-1;i>0;i--){
	   int j=0;
	   sum+=L[i][j];
	   j++;
	}
	System.out.print("�﨤�u�M�O:"+sum);	//���Ƥ�}��X���~
      }
}