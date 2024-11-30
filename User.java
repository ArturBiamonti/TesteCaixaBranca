package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * A classe User é responsável por gerenciar a conexão com o banco de dados,
 * autenticar usuários e verificar suas credenciais.
 */
public class User {

    /**
     * Estabelece a conexão com o banco de dados MySQL.
     * 
     * @return Connection A conexão com o banco de dados ou null se a conexão falhar.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            conn = DriverManager.getConnection(url);
        } catch (Exception e) { }
        return conn;
    }

    public String nome = "";
    public boolean result = false;

    /**
     * Verifica se um usuário existe no banco de dados, comparando o login
     * e a senha fornecidos com os registrados no banco.
     * 
     * @param login O login do usuário.
     * @param senha A senha do usuário.
     * @return boolean Retorna true se o usuário for encontrado e false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();
        //INSTRUÇÃO SQL
        sql += "select nome from usuarios ";
        sql += "where login = '" + login + "'";
        sql += " and senha = '" + senha + "';";
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                result = true;
                nome = rs.getString("nome");
            }
        } catch (Exception e) { }
        return result;
    }
}
