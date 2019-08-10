package Atividade2;

import java.util.Calendar;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) throws Exception {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) throws Exception {
        if (this.dia < 0 || this.dia > 31)
            throw new Exception("O dia deve ser entre 1 e no máximo 31");

        switch (this.mes)
        {
            case 2:
                if (this.dia > 29)
                    throw new Exception("Dia inválido para este mês");
            case 4:
            case 6:
            case 9:
            case 11:
                if (this.dia > 30)
                    throw new Exception("Dia inválido para este mês");
        }

        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) throws Exception {
        if (mes < 1 || mes > 12)
            throw new Exception("O mês deve ser entre 1 e 12");

        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) throws Exception {
        if(String.valueOf(ano).length() != 4)
            throw new Exception("O ano deve conter 4 letras");

        this.ano = ano;
    }

    public String getData()
    {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }
}
