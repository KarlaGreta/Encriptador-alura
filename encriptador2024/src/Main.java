
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        boolean bucle=true;
        CambioDeMonedas cambioDeMonedas= new CambioDeMonedas();

        while (bucle){
            System.out.println("Bienvenido al conversor de monedas");
            System.out.println("1) Dólar => Peso Argentino");
            System.out.println("2) Peso Argentino => Dólar ");
            System.out.println("3) Dólar =>  Real brasileño");
            System.out.println("4) Real brasileño =>  Dólar");
            System.out.println("5) Dólar => Peso Colombiano");
            System.out.println("6) Peso Colombiano =>  Dólar");
            System.out.println("7) Salir");
            System.out.print("      Elija ua opción valida   ");
            int opcion=sca.nextInt();
            System.out.print("      Ingrese Monto     ");
            double monto=sca.nextDouble();

            String de="",para="";
            switch (opcion){
                case 1 :{ de="USD"; para="ARS";break;}
                case 2 :{ de="ARS"; para="USD";break;}
                case 3 :{ de="USD"; para="BRL";break;}
                case 4 :{ de="BRL"; para="USD";break;}
                case 5 :{ de="USD"; para="COP";break;}
                case 6 :{ de="COP"; para="USD";break;}
                case 7: {bucle=false;break;}
            }

            MonedaOmdb  monedaOmdb=cambioDeMonedas.cambio(de,para,monto);
            System.out.println("       Resultado "+monedaOmdb.conversion_result());
            System.out.println("-----------------------------------------     ");

        }



    }
}