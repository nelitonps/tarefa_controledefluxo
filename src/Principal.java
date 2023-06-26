/**
 * @author Neliton
 * @version 1.0
 */
public class Principal {

    public static void main(String[] args){
        Calculo calculo = new Calculo();

        calculo.setNota1(2);
        calculo.setNota2(6);
        calculo.setNota3(3);
        calculo.setNota4(4);

        System.out.println("A media é: " + calculo.calculoMedia());
        if(calculo.calculoMedia() >= 7){
            System.out.println("Aprovado");
        }
        else if (calculo.calculoMedia() >=5) {
            System.out.println("Recuperação");
        }
        else {
            System.out.println("Reprovado");
        }
    }

}
