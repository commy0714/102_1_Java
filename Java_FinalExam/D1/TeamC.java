//�Ш��D�حn�D�@��
import java.util.*;

 

public class TeamC

{

 
 public static void main(String args[])
    {

        String s;

        System.out.println("�п�J���N���Ǧ�");

        Scanner temp=new Scanner(System.in);

        s=temp.nextLine();
        System.out.println("��Ǧ���:"+InFix.toPostfix(s));



        

    }

}

 

class InFix 

{

    private static int priority(char op) 

    {  

        switch(op)

        { 

             case '+':

             case '-': 

             return 1; 

             case '*': 

             case '/': 

             return 2;

             case '^':

             return 3;    

             default:            

            return 0;

        }  

    }

    

    public static String toPostfix(String input) 

    {

        LinkedList<Character> stack = new LinkedList<Character>();

        stack.add('\u0000'); // ���|�������Ŧr��

        StringBuffer buffer = new StringBuffer();

        for(char c : input.toCharArray()) 

        { 

            switch(c) 

            {  

                // �B��l���| 

                case '(': 

                    stack.add(c);

                    break; 

                case '+':

                case '-': 

                case '*': 

                case '/': 

        while(priority(stack.getLast()) >= priority(c))

        { 

          buffer.append(stack.removeLast());

        } 

                    // �s�J���| 

                    stack.add(c);

                    break; 

                // �J ) ��X�� ( 

                case ')': 

                    while(stack.getLast() != '(') 

                    { 

                        buffer.append(stack.removeLast());

                    } 

                        stack.removeLast();  // ����X( 

                        break; 

                // �B�⤸������X 

                default: 

                    buffer.append(c);

            } 

        } 

        

        while(stack.getLast() != '\u0000') 

        { 

            buffer.append(stack.removeLast());

        }

        

        return buffer.toString();

    }

    

    //���Ǧ��ন�e�Ǧ�

    public static String toPrefix(String input) 

   {

        LinkedList<Character> stack = new LinkedList<Character>();

        stack.add('\u0000'); // ���|�������Ŧr��

        StringBuffer buffer = new StringBuffer();

        for(char c : new StringBuffer(input).reverse().toString().toCharArray()) 

        { 

            switch(c)

            {  

                // �B��l���| 

                case ')': 

                    stack.add(c);

                    break; 

              

                    case '+':

 case '-': 

 case '*': 

 case '/': 

                 while(priority(stack.getLast()) > priority(c))

                { 

                    buffer.append(stack.removeLast());

                } 

                    // �s�J���| 

                stack.add(c);

                break; 

                // �J ( ��X�� )

                 case '(': 

                    while(stack.getLast() != ')')

                    { 

                       buffer.append(stack.removeLast());

                    } 

                        stack.removeLast();  // ����X)

                        break; 

                        // �B�⤸������X 

                        default: 

                        buffer.append(c);

                } 

        } 

        

        while(stack.getLast() != '\u0000') 

         { 

            buffer.append(stack.removeLast());

         }

        

        return buffer.reverse().toString();

       }

} 