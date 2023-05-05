public class Main
{
    public static void main(String args[])
    {
        sumaVectores primerVector = new sumaVectores(5,6);
        sumaVectores segundoVector = new sumaVectores(4,2);

        sumaVectores vectorSuma = primerVector.suma(segundoVector);
        double magnitudResultante = vectorSuma.magnitud();

        System.out.println("La magnitud del vector resultante suma es: " + magnitudResultante);
        System.out.println("El vector suma es: " + vectorSuma);
    }
}
