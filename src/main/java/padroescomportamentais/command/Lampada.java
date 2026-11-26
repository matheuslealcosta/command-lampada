package padroescomportamentais.command;

public class Lampada {

    private String comodo;
    private String situacao;

    public Lampada(String comodo) {
        this.comodo = comodo;
    }

    public String getSituacao() {
        return situacao;
    }

    public void ligar() {
        this.situacao = "Lâmpada ligada";
    }

    public void desligar() {
        this.situacao = "Lâmpada desligada";
    }
}
