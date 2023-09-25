import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcion = 0;

        Cuenta cuenta1=new Cuenta(100,"JULIAN LANDINEZ");
        System.out.println();
        System.out.println("----Estos son los datos generales de la cuenta----");
        System.out.println(cuenta1.getDatosCuenta());


        do{
            System.out.println("Ingese el numero de la opcion que desea realizar");
            System.out.println();
            System.out.println("1. Hacer un retiro");
            System.out.println("2. Hacer un ingreso");
            System.out.println("3. Obtener saldo");
            System.out.println("4. obtener los datos generales");
            System.out.println("5. salir");

            opcion = leer.nextInt();

            switch(opcion){
                case 1:
                    System.out.println("¿cuanto dinero desea retirar?");
                    double retiro = leer.nextDouble();
                    cuenta1.setRetiro(retiro);
                    break;
                case 2:
                    System.out.println("¿cuanto dinero desea ingresar?");
                    double ingreso = leer.nextDouble();
                    cuenta1.setIngreso(ingreso);
                    break;

                case 3:System.out.println("El saldo de tu cuenta es: ");
                    System.out.println(cuenta1.getSaldoDeCuenta());
                    break;

                case 4:
                    System.out.println("Los datos de la cuenta son: : ");
                    System.out.println(cuenta1.getDatosCuenta());
                    break;





            }


        }while (opcion <= 4 & opcion > 0);


    }
}