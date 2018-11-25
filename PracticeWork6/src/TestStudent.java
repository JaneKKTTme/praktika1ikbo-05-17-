import java.util.Scanner;

public class TestStudent extends Student{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many students are there? ");
		int n = sc.nextInt();
		Student[] massive = new Student[n];
		for (int i=0; i < n; i++) {
			System.out.print("Enter ID of student: ");
			int idid = sc.nextInt();
			//sc.next();
			System.out.print("Enter name: ");
			String name = sc.next/*Line*/();
			System.out.print("Enter surname: ");
			String surname = sc.next/*Line*/();
			System.out.print("Enter midname: ");
			String midname = sc.next/*Line*/();
			massive[i] = new Student(idid, name, surname, midname);
		}
		sc.close();
		quickSort(massive, 0, n-1);
		for (int i=0; i < n; i++) {
			System.out.println("Student ¹" + (i+1));
			massive[i].println();
		}
	}
}
