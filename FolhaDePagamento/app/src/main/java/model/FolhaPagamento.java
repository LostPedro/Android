package model;

/**
 * Created by Graduação on 14/03/2016.
 */
public class FolhaPagamento {
    private int matricula;
    private String cpf;
    private String nome;
    private double salBase;

    public FolhaPagamento(){
        this.cpf = null;
        this.matricula = 0;
        this.nome = null;
        this.salBase = 0;
    }

    public FolhaPagamento(int matricula, double salBase){
        this.matricula=matricula;
        this.salBase=salBase;
    }

    public int getMatricula() {
        return matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }

    public double getSalBase() {
        return salBase;

    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSalBase(double salBase) {
        this.salBase = salBase;
    }

    public String toString() {
        return "Fo\n" +
                "    @OverridelhaPagamento{" +
                "matricula=" + matricula +
                ", cpf='" + cpf + '\'' +
                ", nome='" + nome + '\'' +
                ", salBase=" + salBase +
                '}';
    }

    public double fgts(double perFgts){
        return this.salBase * perFgts / 100;
    }

    public double inss(){
        if(this.salBase <= 1399.12){
            return this.salBase * 8/100;
        }else if(this.salBase <= 2331.88){
            return  this.salBase * 9/100;
        }else {
            return this.salBase * 11/100;
        }
    }

    public double valeTransporte(double percVale){
        return this.getSalBase() * percVale/100;
    }


}


