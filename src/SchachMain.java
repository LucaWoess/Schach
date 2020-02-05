public class SchachMain 
{
	public final int SCHACHBRETTLAENGE=8;
	
	Figur koenig = Figur.K;
	Figur dame = Figur.D;
	Figur laeufer = Figur.L;
	Figur pferd = Figur.P;
	Figur turm = Figur.T;
	Figur bauer = Figur.B;
	
	Farbe w = Farbe.W;
	Farbe s = Farbe.S;
	
	Schach schachbrett = new Schach(SCHACHBRETTLAENGE);
	
	Schachspielfiguren koenig1 = new Schachspielfiguren(koenig, w);
	Schachspielfiguren koenig2 = new Schachspielfiguren(koenig, s);
	Schachspielfiguren dame1 = new Schachspielfiguren(dame, w);
	Schachspielfiguren dame2 = new Schachspielfiguren(dame, s);
	Schachspielfiguren laeufer1 = new Schachspielfiguren(laeufer, w);
	Schachspielfiguren laeufer2 = new Schachspielfiguren(laeufer, s);
	Schachspielfiguren turm1 = new Schachspielfiguren(turm, w);
	Schachspielfiguren turm2 = new Schachspielfiguren(turm, s);
	Schachspielfiguren bauer1 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer2 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer3 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer4 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer5 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer6 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer7 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer8 = new Schachspielfiguren(bauer, w);
	Schachspielfiguren bauer9 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer10 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer11 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer12 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer13 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer14 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer15 = new Schachspielfiguren(bauer, s);
	Schachspielfiguren bauer16 = new Schachspielfiguren(bauer, s);
	
	System.out.println("Anzahl aller Figuren auf dem Brett: " + schachbrett.anzahlAnFigurenAmFeld());
}
