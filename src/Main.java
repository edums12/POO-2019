import Atividade2.Data;
import Atividade2.Hora;
import Atividade2.Triangulo;

public class Main {
    public static void main(String[] args) {
        try
        {
            System.out.println("ATIVIDADE 01");
            Triangulo triangulo = new Triangulo(10, 12);
            System.out.println("A área do triângulo é: " + triangulo.getArea());

            System.out.println("-----------------------------------------------");

            System.out.println("ATIVIDADE 02");
            Data data = new Data(12, 10, 2019);
            System.out.println(data.getData());

            System.out.println("-----------------------------------------------");

            System.out.println("ATIVIDADE 03");
            Hora hora = new Hora(13, 20, 15);
            System.out.println(hora.getHorario());
        }
        catch (Exception ex)
        {
            System.out.println("Opa! " + ex.getMessage());
        }

    }
}
