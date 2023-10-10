public class Student {
private String _nume;
private String _prenume;
private double _medie;
private int nrInstantieri;

public void Student(String nume,String prenume,double medie)
{
this._nume=nume;
this._prenume=prenume;
this._medie=medie;
nrInstantieri++;
}
public int getNrInstante()
{
return nrInstantieri;
}
}
