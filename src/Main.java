public class Main {

    public static void main(String[] args) {

        int numeroIf = 0;

        if (numeroIf > 0) {
            System.out.println("El numero es positivo");
        } else if (numeroIf < 0) {
            System.out.println("El numero es negativo");
        } else {
            System.out.println("El numero es cero");
        }


        int numeroWhile = 0;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }

        do{
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        } while(numeroWhile < 3);



        int numeroFor = 0;

        for(; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        var estacion = "Invierno";

        switch (estacion){
            case "Primavera":
                System.out.println("Es Primavera");
                break;
            case "Verano":
                System.out.println("Es Verano");
                break;
            case "Otoño":
                System.out.println("Es Otoño");
                break;
            case "Invierno":
                System.out.println("Es Invierno");
                break;
            default:
                System.out.println("No es una estación del año");

        }



    }
}
