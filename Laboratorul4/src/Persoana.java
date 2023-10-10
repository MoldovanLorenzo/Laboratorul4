public class Persoana {
private String _nume;
private String _prenume;
private int _cnp;
private int _varsta=0;
private int _anulNasterii;
private String _lunaNasterii;
private int _ziuaNasterii;
private String _adresa;

public Persoana(String nume, String prenume, int cnp,int varsta, int anulNasterii, String lunaNasterii, int ziuaNasterii, String adresa)
{
    this._nume=nume;
    this._prenume=prenume;
    this._cnp=cnp;
    this._varsta=varsta;
    this._anulNasterii=anulNasterii;
    this._lunaNasterii=lunaNasterii;
    this._ziuaNasterii=ziuaNasterii;
    this._adresa=adresa;
}

public String toString()
{
    return "numele persoanei este: "+ _nume + _prenume + _cnp + "cu varsta: " + _varsta + "nascut la: " + _anulNasterii+ _lunaNasterii+ _ziuaNasterii + "la adrsa: " + _adresa;
}
}