package com.ifc.edu.laboratorio;

  public class Computador extends Eletronicos {

        private final String marca;
        private final String cor;
        private final String formato;
        private final String altura;
        private final String comprimento;
        

        public Computador(String marca, String cor, String formato, String altura, String comprimento, String tipo) {
            super(tipo);
            this.marca = marca;
            this.cor = cor;
            this.formato = formato;
            this.altura = altura;
            this.comprimento = comprimento;

        }

        public String getMarca() {
            return marca;
        }

        public String getCor() {
            return cor;
        }

        public String getFormato() {
            return formato;
        }

        public String getAltura() {
            return altura;
        }

        public String getComprimento() {
            return comprimento;
        }

        public void ComputadorInformacoes() {
            System.out.println("Marca:" + getMarca());
            System.out.println("Cor:" + getCor());
            System.out.println("Formato:" + getFormato());
            System.out.println("Altura:" + getAltura());
            System.out.println("Comprimento:" + getComprimento());
            System.out.println("Tipo:" + getTipo());
        }
    }
