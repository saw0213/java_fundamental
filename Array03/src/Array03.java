import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("**********�л� ���� ó�� ���α׷�**********");
		System.out.print("�л����� �Է��ϼ��� : ");
		int num = sc.nextInt();
		
		int sum = 0;
		int[] stu = new int[num];
		
		for(int i=0; i<stu.length; i++) {
			System.out.print((i+1)+"��° �л��� ������ �Է��ϼ��� : ");
			stu[i] = sc.nextInt();
			sum += stu[i];
			//System.out.println((i+1)+"��° �л��� ������ "+stu[i]+"�� �Դϴ�.");
		}
		
		System.out.println(stu.length+"���� ������ "+sum+"�� �Դϴ�.");
		System.out.println("����� "+(double)sum/stu.length+"�� �Դϴ�.");
		
		sc.close();
	}
	
}