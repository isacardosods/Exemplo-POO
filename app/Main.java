package app;

public class Main {
    static void main(String[] args) {
        Conta c1 = new Conta(0f,true);
        c1.setnumConta(135);
        c1.setDono("Isoca");
        c1.setTipo("Conta corrente");
        c1.setStatus(true);
        c1.setSaldo(50f);
        c1.depositar(300f);
        c1.pagarMensal(12f);

        Conta c2 = new Conta(0f,false);
        c2.setnumConta(246);
        c2.setDono("Raianne");
        c2.setTipo("Conta poupança");
        c2.setStatus(true);
        c2.setSaldo(150f);
        c2.depositar(500f);
        c2.pagarMensal(20f);
        c2.sacar(100f);


        c1.retorno();
        c2.retorno();
    }
}
