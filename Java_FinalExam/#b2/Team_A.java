import java.util.Scanner;

public class Team_A {
	public static void main(String[] argv) {
		Scanner cin = new Scanner(System.in);//????�o���D
		String s;
		while (cin.hasNext()) {
			s = cin.nextLine();
			int x = Integer.parseInt(s);
			if ((x / 4) == 0 | (x / 400) == 0 | (x / 100) != 0) {
				System.out.println("���~");
			} else if ((x / 4) != 0 | (x / 400) != 0 | (x / 100) == 0) {
				System.out.println("�|�~");
			}
		}
	}
}