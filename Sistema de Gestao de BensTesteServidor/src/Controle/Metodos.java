package Controle;

import java.sql.*;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.*;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;

public class Metodos {

    DefaultTableModel modelo = new DefaultTableModel();
    ResultSet rs;
    PreparedStatement ps;
    Conexao conexao = new Conexao();
    Connection con;
    private String nivel, campo, bloco = "", unidade = "", div = "", am = "", ar = "";
    private int id = 0, divisao, armario, ambiente;

    public int contaChar(String s, char c) {

        char letra = c;
        char[] palavra = s.toCharArray();
        int cont = 0;
        for (int i = 0; i < palavra.length; i++) {
            if (palavra[i] == letra) {
                cont++;
            }
        }
        System.out.println("Número de ocorrências da letra '" + letra + "': " + cont);

        return cont;
    }

    public void listaBens(JTable tb) {

        String sql = "select b.idben,b.tipo ,b.descricao,b.marca,b.modelo,b.patrimonio,"
                + "b.valor,u.nome as unidade,b.iddivisao,b.idarmario,b.idambiente,b.idbloco,"
                + "bl.descricao as bloco from bens as b,blocos as bl,unidades as u where"
                + " b.idbloco = bl.idbloco and bl.idunidade = u.idunidade";

        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }

            while (rs.next()) {
                divisao = rs.getInt("iddivisao");
                armario = rs.getInt("idarmario");
                ambiente = rs.getInt("idambiente");
                unidade = rs.getString("unidade");
                bloco = rs.getString("bloco") + " - ";
                if (divisao == 0) {
                    div = "";
                } else {
                    div = getCampo("divisoes", "iddivisao", divisao, "descricao") + " - ";
                }
                if (armario == 0) {
                    ar = "";
                } else {
                    ar = getCampo("armarios", "idarmario", armario, "descricao") + " - ";
                }
                if (ambiente == 0) {
                    am = "";
                } else {
                    am = getCampo("ambientes", "idambiente", ambiente, "descricao") + " - ";
                }

                String[] dadosLinhas = {String.valueOf(rs.getInt(1)),
                    rs.getString(3),
                    rs.getString(2),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6),
                    rs.getString(7),
                    div + ar + am + bloco + unidade};
                modelo.addRow(dadosLinhas);
            }
            conexao.fechaConexao();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar bens!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void pesquisaBens(JTable tb) {
        String sql = "select * from bens";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                String[] dadosLinhas = {
                        String.valueOf(rs.getInt("id")), 
                                       rs.getString("tipo"), 
                                       rs.getString("descricao"), 
                                       rs.getString("marca"),
                                       rs.getString("modelo"), 
                                       rs.getString("patrimonio"), 
                                       rs.getString("valor"), 
                                       rs.getString("")};
                modelo.addRow(dadosLinhas);
            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar bens!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaAcesso(JTable tb) {

        String sql = "select * from acess";

        modelo = (DefaultTableModel) tb.getModel();

        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("id")),
                    rs.getString("Usuario"),
                    rs.getString("Dta"),
                    rs.getString("Hora"),
                    rs.getString("horasaida")};
                modelo.addRow(dadosLinhas);
            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuarios!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaUser(JTable tb) {
        String sql = "select * from usuarios";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                int niveli = rs.getInt("nivel");
                if (niveli == 0) {
                    nivel = "Administrador";
                } else if (niveli == 1) {
                    nivel = "Comum";
                } else if (niveli == 2) {
                    nivel = "Controle";
                }
                String[] dadosLinhas = {
                        String.valueOf(rs.getInt("idusuario")), 
                        rs.getString("nome"), 
                        rs.getString("login"), 
                        rs.getString("senha"),
                        rs.getString("dicasenha"), nivel};
                modelo.addRow(dadosLinhas);
            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Usuarios!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaUnidades(JTable tb) {
        String sql = "select * from unidades";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("idunidade")), rs.getString("nome")};
                modelo.addRow(dadosLinhas);

            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Unidade!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaBlocos(JTable tb) {
        String sql = "select b.idbloco,b.descricao,a.nome from "
                + "unidades AS a, blocos AS b "
                + "WHERE b.idunidade = a.idunidade ";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String[] dadosLinhas = {String.valueOf(rs.getInt("idbloco")),
                    rs.getString("descricao"), rs.getString("nome")};
                modelo.addRow(dadosLinhas);

            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Blocos!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaArmarios(JTable tb) {
        String sql = "select ar.idarmario, ar.descricao as armario ,a.idambiente,"
                + "a.descricao as ambientes,b.descricao as bloco,u.nome as unidades "
                + "from armarios as ar,ambientes AS a,blocos AS b, "
                + "unidades as u WHERE ar.idambiente=a.idambiente "
                + "and  a.idbloco = b.idbloco and b.idunidade = u.idunidade";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String ambiente = rs.getString("ambientes");
                String bloco = rs.getString("bloco");
                String unidade = rs.getString("unidades");
                String[] dadosLinhas = {String.valueOf(rs.getInt("idarmario")),
                    rs.getString("armario"),
                    ambiente + " - " + bloco + " - " + unidade};
                modelo.addRow(dadosLinhas);

            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Armarios!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaAmbientes(JTable tb) {
        String sql = "select a.idambiente,a.descricao,b.descricao as bloco,u.nome from ambientes AS a,"
                + " blocos AS b,unidades as u WHERE a.idbloco = b.idbloco and b.idunidade = u.idunidade";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                bloco = rs.getString("bloco");
                unidade = rs.getString("nome");

                String[] dadosLinhas = {String.valueOf(rs.getInt("idambiente")),
                    rs.getString("descricao"), bloco + " - " + unidade};
                modelo.addRow(dadosLinhas);

            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Ambientes!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void listaDivisoes(JTable tb) {
        
        String sql = "select d.iddivisao,d.descricao as divisao, ar.idarmario ,"
                + "ar.descricao as armario,a.idambiente,a.descricao as ambiente,"
                + "b.idbloco,b.descricao as bloco,u.idunidade,u.nome as unidade from "
                + "divisoes as d, armarios as ar,ambientes a,blocos as b,unidades as u "
                + "where d.idarmario = ar.idarmario and ar.idambiente = a.idambiente "
                + "and a.idbloco = b.idbloco and b.idunidade = u.idunidade";
        modelo = (DefaultTableModel) tb.getModel();
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            tb.removeAll();
            for (int i = modelo.getRowCount() - 1; i >= 0; i--) {
                modelo.removeRow(i);
            }
            while (rs.next()) {
                String armario = rs.getString("armario");
                String ambiente = rs.getString("ambiente");
                String bloco = rs.getString("bloco");
                String unidade = rs.getString("unidade");
                String[] dadosLinhas = {String.valueOf(rs.getInt("iddivisao")),
                    rs.getString("divisao"),
                    armario + " - " + ambiente + " - " + bloco + " - " + unidade};
                modelo.addRow(dadosLinhas);

            }
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar Divisões!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void chamaRelatorio(String sql, String caminho) {
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            JRResultSetDataSource rsl = new JRResultSetDataSource(rs);
            JasperPrint p = JasperFillManager.fillReport(caminho, new HashMap(), rsl);
            JasperViewer jv = new JasperViewer(p, false);
            jv.setVisible(true);
            jv.toFront();
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o sql!!!\n\nErro: " + ex.getMessage());
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(null, "Arquivo .jasper não encontrado!!!\n\nErro: " + ex.getMessage());
        }
    }

    public void carreagaCB(String sql, String campo, JComboBox b, String campoAdicional) {
        try {
            con = conexao.fazConexao();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            b.removeAllItems();
            b.addItem(campoAdicional);
            while (rs.next()) {
                b.addItem(rs.getString(campo));
            }
            b.setSelectedIndex(-1);
            conexao.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao carregar comboBox!!!\n\nErro: "
                    + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int getId(String tabela, String coluna, String valor, String idTabelaSelec) {

        String sql = "select * from " + tabela + " where " + coluna + "= '" + valor + "'";

        try {
            PreparedStatement pst;
            ResultSet rst;
            Conexao c = new Conexao();
            Connection conn = c.fazConexao();
            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();
            if (rst.next()) {
                id = rst.getInt(idTabelaSelec);
            }
            c.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar o ID!!!\n\nErro: " + ex.getMessage(),
                    "Erro de SQL", JOptionPane.ERROR_MESSAGE);
        }
        return id;
    }

    public String getCampo(String tabela, String colunaID, int Idvalor, String campoRetonado) {
        String sql = "select " + campoRetonado + " from " + tabela + " where " + colunaID + " = " + Idvalor + "";

        try {
            Conexao c = new Conexao();
            PreparedStatement pst;
            ResultSet rst;
            Connection conn = c.fazConexao();

            pst = conn.prepareStatement(sql);
            rst = pst.executeQuery();

            if (rst.next()) {
                campo = rst.getString(campoRetonado);
            } else if (rst == null) {
                JOptionPane.showMessageDialog(null, "Campo Inexitente!!!");
            }
            c.fechaConexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao pegar campo!!!\n\nErro: " + ex.getMessage(),
                    "Erro de SQL!!!", JOptionPane.ERROR_MESSAGE);
        }
        return campo;
    }

}
