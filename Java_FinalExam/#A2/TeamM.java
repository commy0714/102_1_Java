import java.io.*;

public class TeamM {
	public static void main(String[] args)throws IOException{
		System.out.print("��J�@�ӥ|��ƾ�ơG ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1=br.readLine();
		int ori = Integer.parseInt(str1);
		int[] result = new int[4]; 
		for(int j=0;j<4;j++){
			result[j]=ori%10;
			ori=ori/10;
		}
		
		for(int k=0;k<4;k++){
			result[k]+=5;
			result[k]%=10;
		}
		
		System.out.print("�[�K�᪺�Ʀr���G "+ result[0]+result[1]+result[2]+result[3]);
		
	}
	
}
