package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {

    // Ponto 2: Conexão com o Banco de Dados
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Ponto 3: Tentativa de carregar o driver (erro de tipografia aqui)
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { }
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    // Ponto 1: Entrada de dados (parâmetros login e senha)
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        // Ponto 2: Conexão com o Banco de Dados chamada aqui
        Connection conn = conectarBD();
        
        // Ponto 4: Construção da instrução SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "';";
        
        try {
            // Ponto 5: Execução do SQL
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            // Ponto 6: Verificação do resultado
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) { }
        // Ponto 7: Saída de dados (variáveis result e nome)
        return result;
    }
}
// fim da class
