//�o�D�޿趷�b�Q�Q(�ר�O��Ÿ����B�z)
import java.util.Stack;
import java.io.*;

public class Team_G
{
	public static void main(String[] args) throws Exception{
		BufferedReader br=
		        new BufferedReader(new FileReader("question.txt"));
		Stack operand=new Stack();			//�x�s�B�⤸�����|
		Stack operator=new Stack();			//�x�s�B��l
		String expression=new String();		//�x�s�B�⦡
		String str1=br.readLine();
		String str2=br.readLine();
		String str3=br.readLine();
		String str4=br.readLine();
		String str5=br.readLine();
		expression=br.readLine();
		for(int count=0;count<5;count++)
		{
			PrintWriter pw=new PrintWriter
					(new BufferedWriter(new FileWriter("ans.txt")));
			if(count==0)
			expression=str1;
		else if(count==1)
			expression=str2;
		else if(count==2)
			expression=str3;
		else if(count==3)
			expression=str4;
		else if(count==4)
			expression=str5;
		int position=0;			//�����r����m
		char chr_operator;

		while (true)
		{
			
			//�Ӧr���O�_���B��l
			if (isOperator(expression.charAt(position)))
			{
				if (operator.empty()==true || expression.charAt(position)=='('){					
					operator.push(new Character(expression.charAt(position)));
				}
				else
				{
					//�k�����A���X�{
					if (expression.charAt(position)==')'){
						//�B�z�ܥX�{'('
						if (operator.peek().toString().charAt(0)!='(')
						{
							System.out.print(operator.pop());
							pw.print(operator.pop());
							continue;
						}
						else{
							operator.pop();			//���'('
						}
					}
					else
					{
						//�u���v���j�̤�i������W���|
						if ((priority(expression.charAt(position))<=priority(operator.peek().toString().charAt(0))))
						{
							System.out.print(operator.pop());
							pw.print(operator.pop());
					}
						operator.push(new Character(expression.charAt(position)));
					}
				}
			}
			else
			{
				System.out.print(expression.charAt(position));//�����L�X�B�⤸
				pw.print(expression.charAt(position));
			}
			position++;
			if (position==expression.length())
				break;
		}

		//�L�X���|���Ѿl���B��l
		while (operator.empty()==false)
		{
			System.out.print(operator.pop());
			pw.print(operator.pop());
		}
		System.out.println();	
		pw.println();
		pw.close();
	}
	}

	//�P�_�O�_���B��l
	static boolean isOperator(int value){
		if (value=='+' || value=='-' || value=='*' || value=='/' || value=='(' || value==')')
			return true;
		else
			return false;
	}

	//�P�_�u���v
	static int priority(char operator){
		if (operator=='(')
			return 0;
		else if (operator=='+' || operator=='-')
			return 1;
		else if (operator=='*' || operator=='/')
			return 2;
		else return 0;
	}
}
