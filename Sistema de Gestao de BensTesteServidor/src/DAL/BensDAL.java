package DAL;

import Bean.*;
import Controle.Conexao;
import java.sql.*;
import javax.swing.*;

public class BensDAL {

    Conexao conexao = new Conexao();
    Connection con;
    ResultSet rs;
    PreparedStatement ps;

    public void cadastrar(BensBean bens) {
        String sql = "INSERT INTO bens (idbloco,idarmario,iddivisao,idambiente,tipo,descricao,marca,modelo,patrimonio,ni,valor)"
                + " VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bens.getIdbloco());
            ps.setInt(2, bens.getIdarmario());
            ps.setInt(3, bens.getIddivisao());
            ps.setInt(4, bens.getIdambiente());
            ps.setString(5, bens.getTipo());
            ps.setString(6, bens.getDescricao());
            ps.setString(7, bens.getMarca());
            ps.setString(8, bens.getModelo());
            ps.setString(9, bens.getPatrimonio());
            ps.setInt(10, bens.getNi());
            ps.setString(11, bens.getValor());
            ps.execute();
            JOptionPane.showMessageDialog(null, "Bem inserido com sucesso!!!");
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir bem!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void excluir(BensBean bens) {
        String sql = "DELETE FROM bens WHERE idben = ?";
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bens.getIdBen());
            ps.execute();
            conexao.fechaConexao();
            JOptionPane.showMessageDialog(null, "Bem excluido com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir bem!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void editar(BensBean bens) {
        String sql = "UPDATE bens SET idbloco = ?,idarmario = ?,iddivisao = ?,idambiente = ?,"
                + "tipo = ?,descricao=?,marca = ?,modelo = ?,"
                + "patrimonio = ?,ni = ?,valor = ? WHERE idben =?";
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            ps.setInt(1, bens.getIdbloco());
            ps.setInt(2, bens.getIdarmario());
            ps.setInt(3, bens.getIddivisao());
            ps.setInt(4, bens.getIdambiente());
            ps.setString(5, bens.getTipo());
            ps.setString(6, bens.getDescricao());
            ps.setString(7, bens.getMarca());
            ps.setString(8, bens.getModelo());
            ps.setString(9, bens.getPatrimonio());
            ps.setInt(10, bens.getNi());
            ps.setString(11, bens.getValor());
            ps.setInt(12, bens.getIdBen());
            ps.execute();
            conexao.fechaConexao();
            JOptionPane.showMessageDialog(null, "Bem atualizado com sucesso!!!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar bem!!!\n\nErro: " + ex.getMessage());

        }
    }
}
