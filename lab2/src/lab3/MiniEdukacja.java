package lab3;
import java.util.*; 

public class MiniEdukacja 
{
	
	private String name = new String();
	private String surname = new String();
	private int album;
	
	public MiniEdukacja()
	{
			
	}
		
	public void setName(String  string) 
	{
		this.name = string;
	}
		
	public void setSurname(String  string) 
	{
		this.surname = string;
	}
		
	public void setAlbum(int a) 
	{
		this.album = a;
	}	
		
	public String toString()
	{
		return surname + " " + name + " " + album;
	}


	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]) 
	{
		
		MiniEdukacja student1 = new MiniEdukacja();
		student1.setSurname("Kowal");
		student1.setName("Jan");
		student1.setAlbum(123456);
		
		MiniEdukacja student2 = new MiniEdukacja();
		student2.setSurname("Wilk");
		student2.setName("Krzysztof");
		student2.setAlbum(123454);
		
		MiniEdukacja student3 = new MiniEdukacja();
		student3.setSurname("Kruk");
		student3.setName("Marian");
		student3.setAlbum(127754);
		
		MiniEdukacja student4 = new MiniEdukacja();
		student4.setSurname("Sowa");
		student4.setName("Grzegorz");
		student4.setAlbum(122454);
		
		
		LinkedList Students = new LinkedList();

			Students.add(student1.toString());
			Students.add(student2.toString());
			Students.add(student3.toString());
			Students.add(student4.toString());
			
			Collections.sort(Students);
			
			Students.remove(student4.toString());
			
			System.out.println("Contents of Students: \n" + Students + "\n");
			
		LinkedList Groups = new LinkedList();
		
			Groups.add("Programowanie");
			Groups.add("Algebra");
			Groups.add("Analiza");
		
		LinkedList Enrolments = new LinkedList();
		
			Enrolments.add(student1.toString() + " " + Groups.get(0) + " " + Groups.get(1));
			Enrolments.add(student2.toString() + " " + Groups.get(1) + " " + Groups.get(2));
			Enrolments.add(student3.toString() + " " + Groups.get(0) + " " + Groups.get(2));
			
			System.out.println("Contents of Enrolments: \n" + Enrolments + "\n");
		
	}
}