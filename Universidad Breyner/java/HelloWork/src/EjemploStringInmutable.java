public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "hola";
        String profesor="breyner";

        String detalle=curso+"con el instructor"+profesor;
        System.out.println("detalle = " + detalle);

        int numeroA= 10;
        int numeroB= 5;

        System.out.println(detalle + (numeroB + numeroA));
        System.out.println(detalle + numeroB + numeroA);
        String detalle2=curso.concat(profesor);
        System.out.println("detalle2 = " + detalle2);
        
    }
}
