package model;

public class User {
    private String id;
    private String tipoConta;

    public User(String id, String tipoConta) {
        this.id = id;
        this.tipoConta = tipoConta;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", tipoConta='" + tipoConta + '\'' +
                '}';
    }
}
