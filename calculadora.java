import java.util.Scanner;
class calculadora{
    public static Scanner tec = new Scanner(System.in);
    public static void menu() {
        System.out.println("");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicacion");
        System.out.println("4. Division");
        System.out.println("5. Potenciacion");
        System.out.println("6. Raiz");
        System.out.println("7. Salir");
    }
    public static void suma() {
        System.out.println("");
        System.out.println("1. Suma");
        System.out.print("Sumando 1: ");
        double sumando1=Double.valueOf(tec.nextLine());
        System.out.print("Sumando 2: ");
        double sumando2=Double.valueOf(tec.nextLine());
        System.out.println("Suma Total: "+(sumando1+sumando2));
    }
    public static void resta() {
        System.out.println("");
        System.out.println("2. Resta");
        System.out.print("Minuendo: ");
        double minuendo=Double.valueOf(tec.nextLine());
        System.out.print("Sustraendo: ");
        double sustraendo=Double.valueOf(tec.nextLine());
        System.out.println("Diferencia: "+(minuendo-sustraendo));
    }
    public static void multiplicacion() {
        System.out.println("");
        System.out.println("3. Multiplicacion");
        System.out.print("Factor 1: ");
        double factor1=Double.valueOf(tec.nextLine());
        System.out.print("Factor 2: ");
        double factor2=Double.valueOf(tec.nextLine());
        System.out.println("Producto: "+(factor1*factor2));
    }
    public static void division() {
        System.out.println("");
        System.out.println("4. Division");
        System.out.print("Dividendo: ");
        double dividendo=Double.valueOf(tec.nextLine());
        System.out.print("Divisor: ");
        double divisor=Double.valueOf(tec.nextLine());
        if (divisor==0) {
            System.out.println("x_x ERROR X_X Indefinido");
        } else {
            System.out.println("Cociente: "+(dividendo/divisor));
        }
    }
    public static void potenciacion() {
        System.out.println("");
        System.out.println("5. Potenciacion");
        System.out.print("Base: ");
        double base=Double.valueOf(tec.nextLine());
        System.out.print("Exponente: ");
        double exponente=Double.valueOf(tec.nextLine());
        System.out.println("Resultado: "+(Math.pow(base,exponente)));
    }
    public static void raiz() {
        System.out.println("");
        System.out.println("6. Raiz");
        System.out.print("Indice: ");
        double indice=Double.valueOf(tec.nextLine());
        System.out.print("Radicando: ");
        double radical=Double.valueOf(tec.nextLine());
        System.out.println("Raiz: "+(Math.pow(radical,1/indice)));
    }
    public static void salir() {
        System.out.println("");
        System.out.println("7. Salir");
    }
    public static void main(String[] args) {
        int opcion;
        do{
            menu();
            System.out.print("Opcion: ");
            opcion=Integer.valueOf(tec.nextLine());
            switch(opcion){
                case 1:suma();
                    break;
                case 2:resta();
                    break;
                case 3:multiplicacion();
                    break;
                case 4:division();
                    break;
                case 5:potenciacion();
                    break;
                case 6:raiz();
                    break;
                case 7:salir();
                    break;    
                default:
                    break;
            }
        }while(opcion!=7);
    }
}