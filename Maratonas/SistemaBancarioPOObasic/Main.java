package hackaton.SistemaBancarioPOObasic;

public class Main {
    public static void main(String[] args) {
        Cliente c1 = new Cliente("Alefe Gomes", "12312312");
        Conta conta1 = new ContaCorrente("001", c1, 1000);

        conta1.depositar(1200);
        conta1.sacar(2500);
        conta1.depositar(1200);
        conta1.depositar(-20);

        System.out.printf("""
                        Titular: %s
                        NumeroConta: \
                        %s
                        Saldo: %.2f""",
                conta1.getTitular().getNome(),
                conta1.getNumeroConta(), conta1.getSaldo());
    }
}
