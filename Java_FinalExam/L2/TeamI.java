import java.util.*;
public class TeamI
{	
	public static void main(String[] args)
	{ 
		
		
		Random random=new Random();
		int a,b,i,j,z,h;
		int num=0;
		int sum=0;

		System.out.print("�п�J�}�C�j�p:");
		Scanner sc = new Scanner(System.in);
		z=sc.nextInt();
		i=z;
		j=z;
		
		int [][]arr=new int[i][j];
		for (i=0;i<z;i++)
		{
			
			for(j=0;j<z-1;j++)
			{
				num=random.nextInt(9)+1;
				
				System.out.print(num+" ");
				
				
				
			}
			
			num=random.nextInt(9)+1;
			System.out.println(num+" ");
		}
		
		for (i=0;i<z;i++)
		{
			for(j=0;j<1;j++)
				{
					for(j=j+i;j<z;)
						{
							arr[i][j]=num;
							sum=sum+num;
							j=j+z-1;
						
							
						}
					
					
					
				}
		
		
		}
		System.out.print("�﨤�u�`�M�O:"+sum);	
	}
}