package TipoAbstratodeDados;

public class Cliente {
    private long codigo;
    private String razaoSocial;
    private String endereco;
    private double previsaoVendas;

    public Cliente(long codigo, String razaoSocial, String endereco, double previsaoVendas) {
        this.codigo = codigo;
        this.razaoSocial = razaoSocial;
        this.endereco = endereco;
        this.previsaoVendas = previsaoVendas;
    }

    public String toString() {
        return "Codigo: "+ codigo +", Razao Social: "+ razaoSocial;
    }


    public long getCodigo() {
        return codigo;
    }
    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocia(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    public double getPrevisaoVendas() {
        return previsaoVendas;
    }
    public void setPrevisaoVendas(double previsaoVendas) {
        this.previsaoVendas = previsaoVendas;
    }    
}
