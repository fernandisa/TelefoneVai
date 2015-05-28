package telefone;

public class Smartphone {
   
    private boolean msgdetexto;
    private boolean despertador;
    private boolean wifi;
    private String resolucao;
    private boolean doisg;
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

    public boolean isWifi() {
        return wifi;
    }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public String getResolucao() {
        return resolucao;
    }

    public void setResolucao(String resolucao) {
        this.resolucao = resolucao;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public void setTelefone(Telefone telefone) {
        this.telefone = telefone;
    }

    public boolean isDoisg() {
        return doisg;
    }

    public void setDoisg(boolean doisg) {
        this.doisg = doisg;
    }
}
