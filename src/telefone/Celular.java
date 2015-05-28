package telefone;

public class Celular {
  
    private boolean msgdetexto;
    private boolean despertador;
    private Telefone telefone;
    

    public boolean isMsgdetexto() {
        return msgdetexto;
    }

    public void setMsgdetexto(boolean msgdetexto) {
        this.msgdetexto = msgdetexto;
    }

    public boolean isDespertador() {
        return despertador;
    }
    

    public void setDespertador(boolean despertador) {
        this.despertador = despertador;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    

    
    

}
