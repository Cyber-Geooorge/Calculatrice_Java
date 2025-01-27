
public class Calculatrice {

    public double additionner(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }


    public double soustraire(double nombre1, double nombre2)  {
        return nombre1 - nombre2 ;
    }


    public double multiplier(double nombre1, double nombre2) {
        return nombre1 * nombre2;
     }


    public double diviser (double nombre1, double nombre2) {
        return nombre1 /  nombre2 ;
    }


    public double calculer(double  nombre1, double nombre2, String operateur ) {
        switch (operateur) {

            case "+":
                return additionner(nombre1, nombre2);
            case "-":
                return soustraire(nombre1, nombre2);
            case "*":
                return multiplier(nombre1, nombre2);
            case "/":
                return diviser(nombre1, nombre2);

            default:
                return 0;

        }
    }
}