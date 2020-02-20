public class SchachMain 
{
	final static int SCHACHBRETTLAENGE=8;

	public static void main(String[] args)
	{
		Figur k = Figur.K;
		Figur d = Figur.D;
		Figur l = Figur.L;
		Figur p = Figur.P;
		Figur t = Figur.T;
		Figur b = Figur.B;

		Farbe w = Farbe.WEISS;
		Farbe s = Farbe.SCHWARZ;

		Schachspielfiguren koenig1 = new Schachspielfiguren(k, w);
		Schachspielfiguren koenig2 = new Schachspielfiguren(k, s);
		Schachspielfiguren dame1 = new Schachspielfiguren(d, w);
		Schachspielfiguren dame2 = new Schachspielfiguren(d, s);
		Schachspielfiguren laeufer1 = new Schachspielfiguren(l, w);
		Schachspielfiguren laeufer2 = new Schachspielfiguren(l, w);
		Schachspielfiguren laeufer3 = new Schachspielfiguren(l, s);
		Schachspielfiguren laeufer4 = new Schachspielfiguren(l, s);
		Schachspielfiguren turm1 = new Schachspielfiguren(t, w);
		Schachspielfiguren turm2 = new Schachspielfiguren(t, w);
		Schachspielfiguren turm3 = new Schachspielfiguren(t, s);
		Schachspielfiguren turm4 = new Schachspielfiguren(t, s);
		Schachspielfiguren pferd1 = new Schachspielfiguren(p, w);
		Schachspielfiguren pferd2 = new Schachspielfiguren(p, w);
		Schachspielfiguren pferd3 = new Schachspielfiguren(p, s);
		Schachspielfiguren pferd4 = new Schachspielfiguren(p, s);
		Schachspielfiguren bauer1 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer2 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer3 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer4 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer5 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer6 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer7 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer8 = new Schachspielfiguren(b, w);
		Schachspielfiguren bauer9 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer10 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer11 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer12 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer13 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer14 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer15 = new Schachspielfiguren(b, s);
		Schachspielfiguren bauer16 = new Schachspielfiguren(b, s);
		
		Schach schachbrett = new Schach(SCHACHBRETTLAENGE);
		System.out.println("K...König");
		System.out.println("D...Dame");
		System.out.println("P...Pferd");
		System.out.println("L...Läufer");
		System.out.println("T...Turm");
		System.out.println("B...Bauer");
		schachbrett.schachbrettAnzeigen();
		schachbrett.figurPlatzieren(bauer1,2,1);
		System.out.println("Anzahl der weißen Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld(w));
		System.out.println("Anzahl der schwarzen Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld(s));
		System.out.println("Anzahl aller Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld());
	}
}
