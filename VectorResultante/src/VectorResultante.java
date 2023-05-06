import static java.lang.Math.cos;
public class VectorResultante
{
    public double a;
    public double b;

    public VectorResultante(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    public double getA()
    {
        return a;
    }

    public double getB()
    {
        return b;
    }

    //para sumar las ordenadas de los vectores
    public VectorResultante suma(VectorResultante vector)
    {
        double sumaA=this.a+vector.getB();
        double sumaB=this.b+vector.getA();
        return new VectorResultante(sumaA,sumaB);
    }

    //para hallar la resultante
    public double obtenerResultante()
    {
        double resultante;

        resultante = Math.sqrt(Math.pow(this.getA(),2)+Math.pow(this.getB(),2)+2*(this.getA()*this.getB()*cos(60)));
        return resultante;
    }
}