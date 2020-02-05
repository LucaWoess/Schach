import java.util.Scanner;

public class Schach
{
	Spielfiguren[][] schachbrett;
	static Scanner Sc = new Scanner(System.in);
	
	Farbe w = Farbe.W;
	Farbe s = Farbe.S;

		
	public Schach(int SCHACHBRETTLAENGE) 
	{
		schachbrett = new Spielfiguren[SCHACHBRETTLAENGE][SCHACHBRETTLAENGE];
	}
	
	public static void schachbrettAnzeigen(String schachbrettfelder[][])
	{
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		System.out.println("|   | a | b | c | d | e | f | g | h |");
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		for(int i= schachbrett.length -1;i>=0;i--)
		{
			System.out.println("| "+(i+1)+" | "+schachbrett[i][1]+" | "+schachbrettfelder[i][1]+" | "+schachbrettfelder[i][2]+" | "+schachbrettfelder[i][3]+" | "+schachbrettfelder[i][4]+" | "+schachbrettfelder[i][5]+" | "+schachbrettfelder[i][6]+" | "+schachbrettfelder[i][7]+" |");
			System.out.println("+---+---+---+---+---+---+---+---+---+");
		}
	}
	
	public int anzahlAnFigurenAmFeld()
	{
		int anzahlFiguren = 0;
			for(int i=0;i < 8;i++)
			{
				for(int k=0;k < 8;i++)
				{
					if(schachbrett[i][k] != null) anzahlFiguren++;
				}
			}
		return anzahlFiguren;
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
	     while(!(Figur.equalsIgnoreCase("K"))||!(Figur.equalsIgnoreCase("D"))||!(Figur.equalsIgnoreCase("P"))||!(Figur.equalsIgnoreCase("L"))||!(Figur.equalsIgnoreCase("T"))||!(Figur.equalsIgnoreCase("B"))) 
	     {
	        System.err.println("Ungültige Eingabe! Bitte wählen sie einen der oben aufgelisteten Buchstaben aus!");
	        System.out.print("\nGeben Sie an, welche Figur Sie platzieren möchten: ");
			Figur = Sc.nextLine();
	     }
	}
}
