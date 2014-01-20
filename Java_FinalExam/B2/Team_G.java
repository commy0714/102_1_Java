import java.io.*;
public class Team_G
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int Date=5,Class=10;
		String[][] schedule=new String[Class][Date];
		String[] week={"�@","�G","�T","�|","��","��","�C","�K","�E","�Q"}; 
		for(int j=0;j<Date;j++)
		{
			System.out.println("�P��"+week[j]);
			for(int i=0;i<Class;i++)
			{
				System.out.print("��"+week[i]+"�`:");
				schedule[i][j]=br.readLine();
				if(schedule[i][j]=="\n")
					schedule[i][j]=" ";
			}
		}
		for(int i=0;i<Date;i++)
			System.out.print("\t"+week[i]+"\t");
		System.out.println();
		for(int i=0;i<Class;i++)
		{
			System.out.print(i+1);
			for(int j=0;j<Date;j++)
			{
					System.out.print("\t"+schedule[i][j]+"\t");
			}
			System.out.println();
		} 
		System.out.println(); 
		int hold=1;
		while(hold!=-1)
		{
			System.out.println("��ܬd�ߤ覡: ");
			System.out.println("1.�H�ɶ��d�߽ҵ{ 2.�H�ҵ{�d�߮ɶ� 3.�����d��");
			int num=Integer.parseInt(br.readLine());
			switch(num)
			{
				case 1:
					System.out.print("��J�P��:");
					int n=Integer.parseInt(br.readLine());
					System.out.print("��J�ĴX�`:");
					int f=Integer.parseInt(br.readLine());
					System.out.println(schedule[f-1][n-1]);
					break;
				case 2:
					System.out.println("��J�ҵ{�W��: ");
					String C=br.readLine();
					for(int i=0;i<Class;i++)
					{
						for(int j=0;j<Date;j++)
						{
							if(C.equals(schedule[i][j]))
								System.out.println("�P��"+(j+1)+"���� "+(i+1)+"�`");
						}
					}
					break;
				case 3:
					System.out.println("stop search.");
					hold=-1;
					break;
				default:
					System.out.println("error");
					break;
			}
		}
	}
}

 