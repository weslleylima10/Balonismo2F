public class Balao {
    //Atributos
    int id;
    String registro;
    String cor;
    String tipo;
    int capacidade;
    double altura;
    String porte;
    double peso;

    // Métodos
    public String voar (){
        return "voando";
    }
    public Pessoa apresentarPessoa(Nome n1){
        Pessoa p1 = new Pessoa (n1);
        return p1;
    }

}
