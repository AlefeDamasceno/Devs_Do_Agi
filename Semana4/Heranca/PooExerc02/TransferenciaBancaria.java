package br.com.devsdoagi.Semana4.Heranca.PooExerc02;

public class TransferenciaBancaria extends Transacao{
        private String contaOrigem;
        private String contaDestino;

        public TransferenciaBancaria(String id, String data, double valor, String contaOrigem, String contaDestino){
            super(id, data, valor);
            this.contaOrigem = contaOrigem;
            this.contaDestino = contaDestino;
        }

        public void resumoTransferencia(){
            System.out.printf("Transferência de R$ %.2f de %s para %s!", valor, contaOrigem, contaDestino);
        }
}

