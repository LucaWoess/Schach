import java.util.Scanner;

public class Schach 
{
	static Spielfiguren[][] schachbrett;
	static Scanner Sc = new Scanner(System.in);
	static int SCHACHBRETTLAENGE = 8;
	static String[][] felder = new String[SCHACHBRETTLAENGE][SCHACHBRETTLAENGE];

	Farbe w = Farbe.WEISS;
	Farbe s = Farbe.SCHWARZ;
	
	//Initiale Befüllung des Bretts

	public Schach(int SCHACHBRETTLAENGE) 
	{
		schachbrett = new Spielfiguren[SCHACHBRETTLAENGE][SCHACHBRETTLAENGE];
		for(int i=0;i<SCHACHBRETTLAENGE;i++)
		{
			for(int k=0;k<SCHACHBRETTLAENGE;k++)
			{
				felder[i][k]=" ";
			}
		}
	}

	public static void schachbrettAnzeigen()
	{
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		System.out.println("|   | a | b | c | d | e | f | g | h |");
		System.out.println("+---+---+---+---+---+---+---+---+---+");
		for(int i= SCHACHBRETTLAENGE-1;i>=0;i--)
		{
			System.out.println("| "+(i+1)+" | "+felder[i][0]+" | "+felder[i][1]+" | "+felder[i][2]+" | "+felder[i][3]+" | "+felder[i][4]+" | "+felder[i][5]+" | "+felder[i][6]+" | "+felder[i][7]+" |");
			System.out.println("+---+---+---+---+---+---+---+---+---+");
		}
	}

	public int anzahlAnFigurenAmFeld()
	{
		return anzahlAnFigurenAmFeld(w) + anzahlAnFigurenAmFeld(s);
	}

	public int anzahlAnFigurenAmFeld(Farbe f)
	{
		int anzahlFiguren = 0;
		for(int i=0;i < SCHACHBRETTLAENGE;i++)
		{
			for(int k=0;k < SCHACHBRETTLAENGE;k++)
			{
				if(felder[i][k] != " " && schachbrett[i][k].figurfarbe==f) {anzahlFiguren++;}
			}
		}
		return anzahlFiguren;
	}



	public static void figurPlatzieren(Schachspielfiguren fig, int x,int y)
	{
		if(felder[x][y]==" ")
		{
			schachbrett[x][y] = fig;
			felder[x][y] = fig.figurtyp.toString();
			schachbrettAnzeigen();
		}
		else 
		{
			System.out.println("Auf diesem Feld befindet sich bereits eine Figur!");
		}
		/*String figur;
		System.out.print("Geben Sie an, welche Figur Sie platzieren möchten: ");
		figur = Sc.nextLine();
		System.out.println(figur);
		while( !(figur.equalsIgnoreCase("K")) ||
				(figur.equalsIgnoreCase("D")) ||
				(figur.equalsIgnoreCase("P")) ||
				(figur.equalsIgnoreCase("L")) ||
				(figur.equalsIgnoreCase("T")) ||
				(figur.equalsIgnoreCase("B")))
		{
			System.err.println("Ungültige Eingabe! Bitte wählen sie einen der oben aufgelisteten Buchstaben aus!");
			System.out.print("\nGeben Sie an, welche Figur Sie platzieren möchten: ");
			figur = Sc.nextLine();
		}*/
	}
}
