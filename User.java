import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class User {
    public Connection conectarDB() {
        Connection conn = null;//1
        try {
            Class.forName("com.mysql.Driver.Manager").newInstance();//2
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";//3
            conn = DriverManager.getConnection(url);//4
        } catch (Exception e) {//5
        }
        return conn;//6
    }

    public String nome = "";//7
    public boolean result = false;//8

    public boolean verificarUsuario(String login, String senha) {
        String sql = "";//9
        Connection conn = conectarDB();//10
        // instrução sql
        sql += "selet nome from usuarios ";//11
        sql += "where login = " + "'" + login + "'";//12
        sql += " and senha = " + "'" + senha + "';";//13
        try {
            Statement st = conn.createStatement();//14
            ResultSet rs = st.executeQuery(sql);//15
            if (rs.next()) {//16
                result = true;//17
                nome = rs.getString("nome");//18
            }
        } catch (Exception e) {//19
        }
        return result;//20
    }
}