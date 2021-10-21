package DAL;

import Bean.*;
import Controle.*;
import java.sql.*;
import javax.swing.JOptionPane;


public class BlocoDAL {

    Conexao conexao = new Conexao();
    Connection con = conexao.fazConexao();
    ResultSet rs;
    PreparedStatement ps;
    

    public void cadastrar(BlocosBean bloco) {
        String sql = "INSERT INTO blocos (idunidade,descricao) VALUES (?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bloco.getIdunidade());
            ps.setString(2, bloco.getDescricao());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bloco inserido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir Bloco!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(BlocosBean bloco) {
        String sql = "DELETE FROM blocos WHERE idbloco = ?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, bloco.getIdbloco());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bloco excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir Bloco!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(BlocosBean bloco) {
        String sql = "UPDATE blocos SET descricao = ?,idunidade=? WHERE idbloco = ?";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bloco.getDescricao());
            ps.setInt(2, bloco.getIdunidade());
            ps.setInt(3, bloco.getIdbloco());
           
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bloco atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar Bloco!!!\n\nErro: " + ex.getMessage());

        }
    }
}
