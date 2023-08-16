
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author aluno
 */
public class Funcionario {
    
   private String nome;
   private String sobrenome;
   private int horasTrabalhadas;
   private double valorPorhora;
   private String nomeCompleto;
   private double salario;
  


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getValorPorhora() {
        return valorPorhora;
    }

    public void setValorPorhora(double valorPorhora) {
        this.valorPorhora = valorPorhora;
    }

    public String nomeCompleto(){

     return this.nome+ " "+this.sobrenome;
};

    public Double calcularSalario(){

    this.salario = this.horasTrabalhadas * this.valorPorhora;
    return this.salario;
};



public void exibirFuncionarios(){

 
 
};


}


  



