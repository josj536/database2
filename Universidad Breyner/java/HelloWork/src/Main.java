import java.util.Locale;

public class Main {
    public static void main(String[] args){
        String saludar="hola mundo";
        System.out.println(saludar);
        //utilizamos toUpperCase para convertir ese string en mayuscula
        System.out.println("saludar = " + saludar.toUpperCase());

        int numero =10;
        //este como que envuelve a los int y estos para poder convertir ese numero y hacer un tipo de operaciones
        Integer num =10;

        System.out.println("numero = " + numero);
        System.out.println("num = " + num);

        boolean valor= true;
        int num2;
        if(valor){
            System.out.println("numero = " + numero);
            num2=10;
        }

        var numero3=15;
    }
}