package mx.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DAO {

    private Connection cn;
    private Connection cnprov;

    public Connection getCn() {
        return cn;
    }

    public void setCn(Connection cn) {
        this.cn = cn;
    }

    public Connection getCnprov() {
        return cnprov;
    }

    public void setCnprov(Connection cnprov) {
        this.cnprov = cnprov;
    }

//    private final String URL = "jdbc:sqlserver://192.168.1.37\\SQLEXPRESS;databaseName=SAE70Empre01";
//    private final String URL2 = "jdbc:sqlserver://FTP-DUCHE;databaseName=PortalProvNac";
//    private final String PASS = "Aspel**2013";
//    private final String PASS2 = "vxml}}2014";
//    private final String URL = "jdbc:sqlserver://localhost;databaseName=SAE70Empre01";
//    private final String URL2 = "jdbc:sqlserver://localhost;databaseName=PortalProvNac";
//    private final String PASS = "dmsis2019*#";
//    private final String PASS2 = "dmsis2019*#";
//    private final String URL = "jdbc:sqlserver://DESKTOP-NIHO3DH\\SQLEXPRESS;databaseName=SAE70Empre01D";
//    private final String URL2 = "jdbc:sqlserver://DESKTOP-NIHO3DH\\SQLEXPRESS;databaseName=PortalProvNac";
//    private final String PASS = "bacros";
//    private final String PASS2 = "bacros";
    private final String URL = "jdbc:sqlserver://localhost;databaseName=SAE70Empre01";
    private final String URL2 = "jdbc:sqlserver://localhost;databaseName=PortalProvNac";
    private final String PASS = "dmsis2019*#";
    private final String PASS2 = "dmsis2019*#";
    private final String USERNAME = "sa";

    public void Conectar() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cn = DriverManager.getConnection(URL, USERNAME, PASS);
        } catch (ClassNotFoundException | SQLException e) {
        }

    }

    public void Cerrar() throws SQLException {
        try {
            if (cn != null) {
                if (cn.isClosed() == false) {
                    cn.close();
                }
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    public void Conectarprov() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            cnprov = DriverManager.getConnection(URL2, USERNAME, PASS2);
        } catch (ClassNotFoundException | SQLException e) {
        }

    }

    public void Cerrarprov() throws SQLException {
        try {
            if (cnprov != null) {
                if (cnprov.isClosed() == false) {
                    cnprov.close();
                }
            }
        } catch (SQLException e) {
            throw e;
        }
    }

}
