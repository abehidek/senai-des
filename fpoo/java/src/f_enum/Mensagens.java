package f_enum;

public enum Mensagens {
    BemVindo("Olá seja bem vindo"),
    Saiu("Volte sempre");

    private String msg;

    Mensagens(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
