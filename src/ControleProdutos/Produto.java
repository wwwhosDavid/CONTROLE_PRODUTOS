package ControleProdutos;

//Criando a classe produto

public class Produto {
	
 private String nome;
 private double precoCusto;
 private double precoVenda;

 // Criando o construtor do produto
 public Produto(String nome, double precoCusto, double precoVenda) {
     this.nome = nome;
     this.precoCusto = precoCusto;
     this.precoVenda = precoVenda;
 }

 // Metodo para calcular o lucro
 
 public double calcularLucro() {
     return precoVenda - precoCusto;
 }

 // Get e set
 
 public String getNome() {
     return nome;
 }

 public void setNome(String nome) {
     this.nome = nome;
 }

 public double getPrecoCusto() {
     return precoCusto;
 }

 public void setPrecoCusto(double precoCusto) {
     this.precoCusto = precoCusto;
 }

 public double getPrecoVenda() {
     return precoVenda;
 }

 public void setPrecoVenda(double precoVenda) {
     this.precoVenda = precoVenda;
 }
}

//Criando classe produto alimenticio

class ProdutoAlimenticio extends Produto {
	
	//Herda de produto
	
 private String dataValidade;
 private String informacoesNutricionais;

 // Construtor de prod alimenticio
 
 public ProdutoAlimenticio(String nome, double precoCusto, double precoVenda, String dataValidade, String informacoesNutricionais) {
     super(nome, precoCusto, precoVenda);
     this.dataValidade = dataValidade;
     this.informacoesNutricionais = informacoesNutricionais;
 }

 // Get e set
 
 public String getDataValidade() {
     return dataValidade;
 }

 public void setDataValidade(String dataValidade) {
     this.dataValidade = dataValidade;
 }

 public String getInformacoesNutricionais() {
     return informacoesNutricionais;
 }

 public void setInformacoesNutricionais(String informacoesNutricionais) {
     this.informacoesNutricionais = informacoesNutricionais;
 }
}

//Criando classe produtovestuario

class ProdutoVestuario extends Produto {
	
	//Herda de produto
	
 private String tamanho;
 private String cor;
 private String material;

 // Construtor de produtovestuario
 
 public ProdutoVestuario(String nome, double precoCusto, double precoVenda, String tamanho, String cor, String material) {
     super(nome, precoCusto, precoVenda);
     this.tamanho = tamanho;
     this.cor = cor;
     this.material = material;
 }

 // Get e set
 
 public String getTamanho() {
     return tamanho;
 }

 public void setTamanho(String tamanho) {
     this.tamanho = tamanho;
 }

 public String getCor() {
     return cor;
 }

 public void setCor(String cor) {
     this.cor = cor;
 }

 public String getMaterial() {
     return material;
 }

 public void setMaterial(String material) {
     this.material = material;
 }
}

//Classe principal para rodar o código

 class Main {
 public static void main(String[] args) {
	 
     // Produto alimenticio
	 
     ProdutoAlimenticio arroz = new ProdutoAlimenticio("Arroz", 3.50, 5.00, "01/12/2025", "100g: Calorias: 350, Proteínas: 7g, Carboidratos: 75g");
     System.out.println("Produto: " + arroz.getNome());
     System.out.println("Lucro: " + arroz.calcularLucro());
     System.out.println("Validade: " + arroz.getDataValidade());
     System.out.println("Informações Nutricionais: " + arroz.getInformacoesNutricionais());

     // Produto vestuario
     
     ProdutoVestuario camiseta = new ProdutoVestuario("Camiseta", 20.00, 40.00, "M", "Azul", "Algodão");
     System.out.println("\nProduto: " + camiseta.getNome());
     System.out.println("Lucro: " + camiseta.calcularLucro());
     System.out.println("Tamanho: " + camiseta.getTamanho());
     System.out.println("Cor: " + camiseta.getCor());
     System.out.println("Material: " + camiseta.getMaterial());
 }
}

