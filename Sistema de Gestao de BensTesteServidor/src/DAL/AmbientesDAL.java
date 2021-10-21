package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class AmbientesDAL {

    Conexao conexao = new Conexao();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;

    public void cadastrar(AmbientesBean ambiente) {
        String sql = "INSERT INTO ambientes (idbloco,descricao) VALUES (?,?);";
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ambiente.getIdbloco());
            ps.setString(2, ambiente.getNome());

            ps.execute();
            conexao.fechaConexao();
            JOptionPane.showMessageDialog(null, "Ambiente inserido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Ambiente!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(AmbientesBean ambiente) {
        String sql = "DELETE FROM ambientes WHERE idambiente = ?";
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, ambiente.getId());
            ps.execute();
            conexao.fechaConexao();
            JOptionPane.showMessageDialog(null, "Ambiente excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Ambiente!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(AmbientesBean ambiente) {
        String sql = "UPDATE ambientes SET descricao = ?,idbloco=? WHERE idambiente = ?";

        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setString(1, ambiente.getNome());
            ps.setInt(2, ambiente.getIdbloco());
            ps.setInt(3, ambiente.getId());

            ps.execute();
            conexao.fechaConexao();
            JOptionPane.showMessageDialog(null, "Ambiente atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Ambiente!!!\n\nErro: " + ex.getMessage());
        }
    }
}
