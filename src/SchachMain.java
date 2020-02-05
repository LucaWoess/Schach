public class SchachMain 
{
	final static int SCHACHBRETTLAENGE=8;

	Figur k = Figur.KOENIG;
	Figur d = Figur.DAME;
	Figur l = Figur.LAEUFER;
	Figur p = Figur.PFERD;
	Figur t = Figur.TURM;
	Figur b = Figur.BAUER;

	static Farbe w = Farbe.WEISS;
	static Farbe s = Farbe.SCHWARZ;

	Schachspielfiguren koenig1 = new Schachspielfiguren(k, w);
	Schachspielfiguren koenig2 = new Schachspielfiguren(k, s);
	Schachspielfiguren dame1 = new Schachspielfiguren(d, w);
	Schachspielfiguren dame2 = new Schachspielfiguren(d, s);
	Schachspielfiguren laeufer1 = new Schachspielfiguren(l, w);
	Schachspielfiguren laeufer2 = new Schachspielfiguren(l, s);
	Schachspielfiguren turm1 = new Schachspielfiguren(t, w);
	Schachspielfiguren turm2 = new Schachspielfiguren(t, s);
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

	public static void main(String[] args)
	{
		Schach schachbrett = new Schach(SCHACHBRETTLAENGE);

		schachbrett.schachbrettAnzeigen();
		schachbrett.figurPlatzieren();
		System.out.println("Anzahl der weiﬂen Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld(w));
		System.out.println("Anzahl der schwarzen Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld(s));
		System.out.println("Anzahl aller Figuren auf dem Spielbrett: " + schachbrett.anzahlAnFigurenAmFeld());
	}
}
