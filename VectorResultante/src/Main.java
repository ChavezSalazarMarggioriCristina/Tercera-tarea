public class Main
{
    public static void main(String args[])
    {
        VectorResultante primerVector = new VectorResultante(5,12);
        VectorResultante segundoVector = new VectorResultante(-2,-3);

        VectorResultante sumaVectores = primerVector.suma(segundoVector);
        double resultante = sumaVectores.obtenerResultante();

        System.out.printf("La resultante es: " + resultante);

        System.out.printf('\n'+"La suma de los vectores es: " + sumaVectores);
    }
}
