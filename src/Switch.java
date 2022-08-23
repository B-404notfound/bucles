public class Switch {

    public static void main (String [] args){
        String estacion = "primavera";

       switch (estacion){
           case "verano":
               System.out.println("Es verano");
               break;
           case "invierno":
               System.out.println("Es invierno");
               break;
           case "primavera":
               System.out.println("es primavera");
               break;
           default:
               System.out.println("es otra estacion");
       }
    }
}
