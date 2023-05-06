public class Main
{
    public static void main(String args[])
    {
        VectorResultante primerVector = new VectorResultante(1,2);
        VectorResultante segundoVector = new VectorResultante(3,0);

        VectorResultante sumaVectores = new VectorResultante(primerVector.getA(), segundoVector.getB());
        //VectorResultante sumaVectores = primerVector.suma(segundoVector);
        double resultante = sumaVectores.obtenerResultante();

        VectorResultante sumaR1 = new VectorResultante(primerVector.getA(), segundoVector.getA());
        double suma1 = sumaR1.obtenerSuma1();

        VectorResultante sumaR2 = new VectorResultante(primerVector.getB(), segundoVector.getB());
        double suma2 = sumaR2.obtenerSuma2();


        System.out.printf("La resultante es: " + resultante);

        System.out.printf('\n'+"La suma del vector 1 y 2 es: " + '\n' + suma1 + '\n' + suma2);
        //System.out.printf('\n'+"La suma del vector 2 es: " + suma2);

    }
}
