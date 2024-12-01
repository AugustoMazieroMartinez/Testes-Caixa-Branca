
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Classe User
 * @author Augusto
 */
public class User {

    /**
     * Estabelece uma conexão com o banco de dados MySQL.
     * 
     * @param conn representa a conexão do banco de dados.
     * @param url é o link de conexão com o banco de dados.
     * @return o valor de @param conn
     */
    public Connection conectarDB() {
        Connection conn = null; // 5
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance(); // 6
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123"; // 7
            conn = DriverManager.getConnection(url); // 8
        } catch (Exception e) { // 9
        }
        return conn; // 10
    }

    /**
     * Nome do usuário é inicializado vazio.
     * @param nome
     */
    public String nome = ""; // 1

    /**
     * Inicializa o resultado da verificação do login.
     * @param result
     */
    public boolean result = false; // 2

    /**
     * Verifica se um usuário existe no banco de dados com base em login e senha.
     * 
     * @param sql é o comando sql que será inserido como query.
     * @param conn é a variável que possui a conexão com o banco de dados.
     * @param login O nome de usuário para autenticação.
     * @param senha A senha associada ao usuário.
     * @param st É a variável que cria o statemente para a query.
     * @param rs É o resultado da query executada.
     * @param result se torna true se a query for bem sucedida.
     * @param nome recebe o valor de @param rs.
     * 
     * @return o valor de @param result
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = ""; // 3
        Connection conn = conectarDB(); // 4
        // Constrói a instrução SQL
        sql += "select nome from usuarios "; // 11
        sql += "where login = " + "'" + login + "'"; // 12
        sql += " and senha = " + "'" + senha + "';"; // 13

        try {
            Statement st = conn.createStatement(); // 14
            ResultSet rs = st.executeQuery(sql); // 15
            if (rs.next()) { // 16
                result = true; // 17
                nome = rs.getString("nome"); // 18
            }
        } catch (Exception e) { // 19
        }
        return result; // 20
    }
}