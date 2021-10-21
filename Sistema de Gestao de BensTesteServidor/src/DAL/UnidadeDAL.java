package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class UnidadeDAL {

    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;
    

    public void cadastrar(UnidadesBean unidade) {
        String sql = "INSERT INTO unidades (nome) VALUES (?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, unidade.getNome());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Unidade inserida com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Unidade!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(UnidadesBean unidade) {
        String sql = "DELETE FROM unidades WHERE idunidade = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, unidade.getId());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Unidade excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Unidade!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(UnidadesBean unidade) {
        String sql = "UPDATE unidades SET nome = ? WHERE idunidade = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, unidade.getNome());
            ps.setInt(2, unidade.getId());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Unidade atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Unidade!!!\n\nErro: " + ex.getMessage());

        }
    }
}
