import java.util.Scanner;

public class Schach 
{
	static Scanner Sc = new Scanner(System.in);
	static final int FELDERANZAHL = 64;
	static final int SPALTENZAHL = 8;
	static final int REIHENZAHL = 8;
	static final String Koenig = "K";
	static final String Dame = "D";
	static final String Turm = "T";
	static final String Laeufer = "L";
	static final String Pferd = "P";
	static final String Bauer = "B";
	
	
	public static void main(String[] args) 
	{
		String[] [] schachbrettfelder = new String[SPALTENZAHL] [REIHENZAHL];
		//Befüllen der Schachbrettfelder
		for(int i=0;i<SPALTENZAHL;i++)
		{
			for(int k=0;k<REIHENZAHL;k++)
			{
				schachbrettfelder[i][k] = "-";
			}
		}
		schachbrettAnzeigen(schachbrettfelder);
		figurPlatzieren();
		
		
	}

	public static void schachbrettAnzeigen(String schachbrettfelder[][])
	{
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		System.out.println("|   | a | b | c | d | e | f | g | h |");
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		for(int i=REIHENZAHL-1;i>=0;i--)
		{
			System.out.println("| "+(i+1)+" | "+schachbrettfelder[i][1]+" | "+schachbrettfelder[i][1]+" | "+schachbrettfelder[i][2]+" | "+schachbrettfelder[i][3]+" | "+schachbrettfelder[i][4]+" | "+schachbrettfelder[i][5]+" | "+schachbrettfelder[i][6]+" | "+schachbrettfelder[i][7]+" |");
			System.out.println("+---+---+---+---+---+---+---+---+---+");
		}
	}
	
	public static void figurPlatzieren()
	{
		String Figur;
		System.out.println("K...König");
		System.out.println("D...Dame");
		System.out.println("P...Pferd");
		System.out.println("L...Läufer");
		System.out.println("T...Turm");
		System.out.println("B...Bauer");
	 	System.out.print("Geben Sie an, welche Figur Sie platzieren möchten: ");
	 	Figur = Sc.nextLine();
	     while(Figur!="K"||Figur!="D"||Figur!="P"||Figur!="L"||Figur!="T"||Figur!="B") 
	     {
	        System.out.println("Ungültige Eingabe! Bitte wählen sie einen der oben aufgelisteten Buchstaben aus!");
	        System.out.print("Geben Sie an, welche Figur Sie platzieren möchten: ");
			Figur = Sc.nextLine();
	     }
	}
}
