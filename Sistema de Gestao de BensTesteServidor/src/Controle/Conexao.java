package Controle;

import java.sql.*;
import javax.swing.JOptionPane;

public class Conexao {

    static String url = "jdbc:mysql://192.168.10.3:3307/bens";
    static String driver = "com.mysql.jdbc.Driver";
    static String user = "root";
    static String password = "oc2014";
    ResultSet rs;
    static Connection con;
    PreparedStatement ps;

//    public static void main(String args[]) {
//        fazConexao();
//        JOptionPane.showMessageDialog(null, "bLZ!!!!");
//    }
    public static Connection fazConexao() {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection(url, user, password);
            Class.forName(driver);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fazer conexão com o banco de dados!!!\n\nErro: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex.getMessage());
        }
        return con;
    }

    public void fechaConexao() {
        try {
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao fechar conexão!!!\n\nErro: " + ex.getMessage());
        }
    }

    public ResultSet run(String query) {
        try {
            ps = fazConexao().prepareStatement(query);
            rs = ps.executeQuery(query);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return rs;
    }
}
