package app;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public Conta(float s, boolean a){
        this.saldo = s;
        this.status = a;
    }

    public int getnumConta(){
        return this.numConta;
    }

    public void setnumConta(int num){
        this.numConta = num;
    }

    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String t){
        this.tipo = t;
    }

    public String getDono(){
        return this.dono;
    }

    public void setDono(String d){
        this.dono = d;
    }

    public float getSaldo(){
        return this.saldo;
    }
    public void setSaldo(float s){
        this.saldo = s;
    }

    public boolean getStatus(){
        return this.status;
    }
    public void setStatus(boolean a){
        this.status = a;
    }

    public void openAccount(){
        if(!this.status){
            System.out.println("Conta criada!");
        } else{
            System.out.println("A conta já está criada!");
        }
    }
    public void closeAccount(){
        if(this.status || this.saldo < 0 || this.saldo > 0){
            System.out.println("Fechando a conta!");
        } else{
            System.out.println("Não é possível fechar a conta!");
        }
    }
    public void depositar(float valor){
        if(this.status){
            this.saldo += valor;
            System.out.println("Depositando: R$" + valor);
        } else{
            System.out.println("Erro!");
        }
    }
    public void sacar(float valor){
        if(this.status || this.saldo > 0){
            this.saldo -= valor;
            System.out.println("Sacando: R$" + valor);
        } else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void pagarMensal(float mensalidade){
        if(this.status){
            this.saldo -= mensalidade;
            System.out.println("O valor pago de mensalidade foi de: R$" + mensalidade);
        }
    }
    public void retorno(){
        System.out.println("Meu número de conta é: " + getnumConta());
        System.out.println("Meu tipo de conta é: " + getTipo());
        System.out.println("O dono da conta é: " + getDono());
        System.out.println("Meu saldo atual é de: R$" + getSaldo());
    }
}
