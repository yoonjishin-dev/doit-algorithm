package chap01;

import java.util.Scanner;

public class StarPira_01_16 {

	public static void main(String[] args) {
		StarPira_01_16 s = new StarPira_01_16();
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.println("단수 입력");
			int n = scan.nextInt();
			s.spira(n);
		}
	}

	void spira(int n) {
		int i, j=1;
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
