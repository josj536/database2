public class EjemploString {
    public static void main(String[] args) {
        String curso="hola";
        
        String curso2= new String("hola");
        
        boolean esigual= curso==curso2;
        System.out.println("esigual = " + esigual);

        esigual= curso.equals(curso2);
        System.out.println("esigual = " + esigual);

        String curso3="hola";
        esigual= curso == curso3;
        System.out.println("curso3 = " + esigual);
    }
}
