package Atividade2;

public class Hora {
    private int hora;
    private int minuto = 0;
    private int segundo = 0;

    public Hora(int hora, int minuto, int segundo) throws Exception {
        this.setHora(hora);
        this.setMinuto(minuto);
        this.setSegundo(segundo);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) throws Exception {
        if (hora < 0 || hora > 24)
            throw new Exception("Hora deve estar entre 0 e 24");

        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) throws Exception {
        if (minuto < 0 || minuto > 60)
            throw new Exception("Minuto deve estrar entre 0 e 60");

        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) throws Exception {
        if (segundo < 0 || segundo > 60)
            throw new Exception("Segundo deve estrar entre 0 e 60");

        this.segundo = segundo;
    }

    public String getHorario()
    {
        return String.format("%02d", this.getHora()) + ":" + String.format("%02d", this.getMinuto()) + ":" + String.format("%02d", this.getSegundo());
    }
}
