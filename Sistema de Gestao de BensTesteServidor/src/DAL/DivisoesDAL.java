package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class DivisoesDAL {

    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;

    public void cadastrar(DivisoesBean divisoes) {

        String sql = "INSERT INTO divisoes (idarmario,descricao) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, divisoes.getIdarmario());
            ps.setString(2, divisoes.getDescricao());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Divisão inserido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Divisão!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(DivisoesBean divisoes) {
        String sql = "DELETE FROM divisoes WHERE iddivisao = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, divisoes.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Divisão excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Divisão!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(DivisoesBean divisoes) {
        String sql = "UPDATE divisoes SET descricao = ?,idarmario=? WHERE iddivisao = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, divisoes.getDescricao());
            ps.setInt(2, divisoes.getIdarmario());
            ps.setInt(3, divisoes.getId());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Divisão atualizada com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Divisão!!!\n\nErro: " + ex.getMessage());

        }
    }
}
