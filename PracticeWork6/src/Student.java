import java.util.Scanner;
import java.util.Arrays;

public class Student {
	private int IDNumber;
	private String Name;
	private String Surname;
	private String Midname;
	
	Student() {};
	
	public Student(int id, String n, String s, String m) {
		IDNumber = id;
		Name = n;
		Surname = s;
		Midname = m;
	}
	
	public void setIDNumber(int id) {
		this.IDNumber = id;
	}
	
	public void setName(String n) {
		this.Name = n;
	}
	
	public String getName() {
		return Name;
	}
	
	public void setSurname(String s) {
		this.Surname = s;
	}
	
	public void setMidname(String m) {
		this.Midname = m;
	}
	
	public void println() {
		System.out.println(IDNumber + " " + Name + " " + Surname + " " + Midname);
	}
	
	public static void quickSort(Student[] array, int low, int high) {
        if (array.length == 0)
            return;
        if (low >= high)
            return;
        int middle = low + (high - low) / 2;
        int opora = array[middle].IDNumber;
        int i = low, j = high;
        while (i <= j) {
            while (array[i].IDNumber < opora) {
                i++;
            }
            while (array[j].IDNumber > opora) {
                j--;
            }
            if (i <= j) {
                int id = array[i].IDNumber;
                array[i].IDNumber = array[j].IDNumber;
                array[j].IDNumber = id;
                String n = array[i].Name;
                array[i].Name = array[j].Name;
                array[j].Name = n;
                String s = array[i].Surname;
                array[i].Surname = array[j].Surname;
                array[j].Surname = s;
                String m = array[i].Midname;
                array[i].Midname = array[j].Midname;
                array[j].Midname = m;
                i++;
                j--;
            }
        }
        if (low < j)
            quickSort(array, low, j);
        if (high > i)
            quickSort(array, i, high);
    }
}
