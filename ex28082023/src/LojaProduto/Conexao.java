/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LojaProduto;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author aluno
 */
public class Conexao {
    private final String bd = "aula";
    private final String usuario = "root";
    private final String senha = "";

   public Connection conectar(){
    try{
    Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/" + bd,
                    usuario, senha);
      }catch(ClassNotFoundException |SQLException E){
    System.out.println(E);
            return null;

}

}
    
}
