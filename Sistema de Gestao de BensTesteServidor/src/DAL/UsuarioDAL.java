package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.*;

/**
 * @author Vitor Santos
 */
public class UsuarioDAL {

    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;

    public void cadastrar(UsuariosBean user) {
        String sql = "INSERT INTO usuarios (nome,login,senha,dicasenha,nivel)VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getSenha());
            ps.setString(4, user.getDica());
            ps.setInt(5, user.getNivel());

            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario inserido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Usuario!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(UsuariosBean user) {
        String sql = "DELETE FROM usuarios WHERE idusuario = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, user.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir usuario!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(UsuariosBean user) {
        String sql = "UPDATE usuarios SET nome = ?,login = ?,senha = ?, dicasenha = ?,nivel = ? WHERE idusuario = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, user.getNome());
            ps.setString(2, user.getLogin());
            ps.setString(3, user.getSenha());
            ps.setString(4, user.getDica());
            ps.setInt(5, user.getNivel());
            ps.setInt(6, user.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Usuario atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Usuario!!!\n\nErro: " + ex.getMessage());

        }
    }

}
