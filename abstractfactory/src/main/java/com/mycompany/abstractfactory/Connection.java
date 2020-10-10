package com.mycompany.abstractfactory;

/**
 *
 * @author Vladimir
 */
public abstract class Connection {

    private String uri;
    private String username;
    private String password;
    private Integer port;

    public Connection() {
    }

    // Установить соединение
    public void connect() {
        System.out.println("connecting...");
        System.out.println(toString());
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getPort() {
        return port;
    }

    public void setPort(Integer port) {
        this.port = port;
    }

    @Override
    public String toString() {
        return "Connection{" + "uri=" + uri + ", username=" + username + ", password=" + password + ", port=" + port + '}';
    }

}
