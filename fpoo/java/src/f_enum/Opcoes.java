package f_enum;

public enum Opcoes {
   NAO (9), 
   SIM (1);
   int ordinal;

    private Opcoes(int ordinal) {
        this.ordinal = ordinal;
    }    
}
