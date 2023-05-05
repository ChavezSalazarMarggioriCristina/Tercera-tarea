public class SumaVectores
{
    public double a;
    public double b;

    public sumaVectores(double a, double b)
    {
        this.a= a;
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

    public sumaVectores suma(sumaVectores vectorDiferente)
    {
        double sumaA=this.a+vectorDiferente.getA();
        double sumaB=this.b+vectorDiferente.getB();
        return new sumaVectores(sumaA,sumaB);
    }
    public double magnitud()
    {
        return Math.sqrt(Math.pow(this.a,2)+Math.pow(this.b,2)+Math.atan2(this.b,this.a));
    }


}
