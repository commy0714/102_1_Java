import java.io.*;
public class TeamC{
public static void main(String[] args)throws IOException
{
BufferedReader input = new BufferedReader
(new InputStreamReader(System.in));
//����X.TXT�ɮ�
int year;
System.out.print("��J�d�ߦ褸�~��: ");
year = Integer.parseInt(input.readLine());
if(year%400==0)
System.out.print("�褸:"+year+"�O�|�~"); 
else if ((year%4==0)&&(year%100!=0))
System.out.println("�褸:"+year+"�O�|�~"); 
else

System.out.println("�z��J��"+year+"�O���~"); 


int[] month={31,29,31,30,31,30,31,31,30,31,30,31};
     int tab=0;
     int sum=1;
     int checkyear=1920;
     for(int i=year;i<checkyear;i++)
     {
      if(i%4==0)
      {
       sum +=366;
      }
      else
      {
       sum +=365;
      }
     }
     if((checkyear-1912)%4!=0)
     {
      month[1]=28;
     }
     for(int j=0;j<12;j++)
      {
       tab=sum%7;
       System.out.println((j+1)+"��");
       System.out.println("��      �@      �G      �T      �|      ��      ��");
       for(int i=0;i<tab;i++)  
       {
        System.out.print("  \t");
       }
       for(int i=1;i<=month[j];i++)
       {
        System.out.print(i+"\t");
        if((i+tab)%7==0)
        {
         System.out.print("\n");
        }
        sum++;
       }
       System.out.println("\n");
      }
    }
}

