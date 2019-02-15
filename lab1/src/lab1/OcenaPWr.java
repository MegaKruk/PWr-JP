package lab1;
//import java.io.Console; Problem z zrobieniem wejœcia u¿ytkownika

public class OcenaPWr
{
	
	private static int Album;
	private static String GradeNum = new String();
	private static String GradeWord = new String();
	
	public OcenaPWr( int Album, String GradeNum, String GradeWord )
	{
		
		this.Album = Album;
		this.GradeNum = GradeNum;
		this.GradeWord = GradeWord;
		
	}
	
	public String toString()
	{
		return Album + " " + GradeNum + " " + GradeWord; 
	}  
	
	public void setAlbum(int a)
	{
		this.Album = a;
	}
	
	public void setGradeNum(String b)
	{
		this.GradeNum = b;
	}
	
	public void setGradeWord(String c)
	{
		this.GradeWord = c;
	}
	
	public static void main(String args[])
	{  
		OcenaPWr ocena = new OcenaPWr( Album, GradeNum, GradeWord );
		
		String[] LegalGradeNum = { "-", "2.0", "3.0", "3.5", "4.0", "4.5", "5.0", "5.5" };
		
		String[] LegalGradeWord = { "niezdefiniowana", "niedostateczny", "dostateczny",
				"plus dostateczny", "dobry", "dobry plus", "bardzo dobry", "celujacy" };
		
		//Console console = System.console();
		
		System.out.println( "Podaj numer indeksu \n" );
		//ocena.setAlbum(Integer.parseInt(console.readLine())); tutaj nastêpowa³ crash
		ocena.setAlbum(123456);
		System.out.println( "Podaj ocene \n" );
		//String s = console.readLine();
		String s = "5.0";
		
		int counter = 0;
		int pointer = 0;
		
		for( int i = 0; i < 8; i++ )
		{
			
			if( LegalGradeNum[i].equals(s) )
			{
				counter++;
				pointer = i;
			}	
		}
		
		for( int i = 0; i < 8; i++ )
		{
			
			if( LegalGradeWord[i].equals(s) )
			{
				counter++;
				pointer = i;
			}
		}
		
		if( counter != 0 )
		{
			ocena.setGradeNum(LegalGradeNum[pointer]);
			ocena.setGradeWord(LegalGradeWord[pointer]);
			System.out.println(ocena);
		}
		else
			System.out.println("Error! Illegal expression! \n");
			
	}  

}		// W javie nie ma destruktora. Kiedy plik jest otwierany w javie system
		// "zaznacza" go jako u¿ywany i nie pozwala go usun¹æ innym procesom.
		// close(); "odznacza" ten plik, po czym inne procesy mog¹ go np. usun¹æ.
		// Garbage collector wzywa metodê finalize(), kiedy nie mo¿e znalezc
		// referencji do tego obiektu. Oznacza ona obiekt jako "do wyrzucenia."