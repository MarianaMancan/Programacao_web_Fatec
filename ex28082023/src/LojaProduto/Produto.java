/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaProduto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Produto {
    
   private Integer id;
   private String nome;
   private Integer quantidade;
   private Float valor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Float getValor() {
        return valor;
    }

    public void setValor(Float valor) {
        this.valor = valor;
    }

public void Gravar(Produto p){

 Connection con = new Conexao().conectar();

  if(con!=null){

try{

   PreparedStatement ps;

  String sql = "insert into produtos (nome,quantidade,valor) values (?,?,?)";

  ps = con.prepareStatement(sql);
  ps.setString(1, getNome());
  ps.setInt(2, getQuantidade());
  ps.setFloat(3, getValor());

         if(ps.executeUpdate()!=0){
                    con.close();
                    System.out.println("Sucesso ao inserir");
                }else{
                    System.out.println("Não foi possível inserir");
                }      
            } catch (SQLException erro) {
                System.out.println("Exceção causada na inserção" + erro);
            }
        }else{
            System.out.println("Não foi estabelecida a conexão");
        }
    }
    



}
