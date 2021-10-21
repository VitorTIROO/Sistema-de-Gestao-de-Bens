package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 * @author Vitor Santos
 */
public class ArmariosDAL {

    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;

    public void cadastrar(ArmariosBean armario) {
        String sql = "INSERT INTO armarios (idambiente,descricao) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, armario.getIdambiente());
            ps.setString(2, armario.getNome());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Armario inserido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Armario!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(ArmariosBean armario) {
        String sql = "DELETE FROM armarios WHERE idarmario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, armario.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Armario excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Armario!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(ArmariosBean armario) {
        String sql = "UPDATE armarios SET descricao = ?,idambiente=? WHERE idarmario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, armario.getNome());
            ps.setInt(2, armario.getIdambiente());
            ps.setInt(3, armario.getId());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Armario atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Armario!!!\n\nErro: " + ex.getMessage());

        }
    }
}
