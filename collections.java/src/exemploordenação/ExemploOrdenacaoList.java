package exemploordenação;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Estudaor difernça entre o compareTOR E COMPAREBLE

public class ExemploOrdenacaoList {
    public static void main(String[] args){

        List<Gato> meusGatos = new ArrayList<>(){{

            add(new Gato("zeus" , 2, "preto"));
            add(new Gato("zeus" , 4, "preto e marrom"));
            add(new Gato("Perseu" , 4, "preto e branco"));
        }};
        System.out.println("Ordem de inserção:");
        System.out.println(meusGatos);

        System.out.println("ordem aleatoria:");
        Collections.shuffle(meusGatos);
        System.out.println(meusGatos);
        
       // System.out.println("ordem idade");
       // Collections.sort(meusGatos);
      //  System.out.println(meusGatos);
       // meusGatos.sort();  // Para ser utilizado precisamos do comparretor 
       // mas estamos tulizando o compareble
                // Sort faz comparação
            
                // Agora vamos ordenar tulizando a inteface comparetor
        // Abaixo sao exemplos de duas formas de se fazer comparação
        //Collections.sort(meusGatos, new ComparetorIdade());
        //System.out.println(meusGatos);
        meusGatos.sort(new ComparetorIdade());
        System.out.println(meusGatos);


        System.out.println("Ordem por Cor: de acordo com a primeira letra > ordem alfabetica");
        meusGatos.sort(new CompretorCor());
        System.out.println(meusGatos);

        System.out.println("Ordem Nome/ Cor/ Idade");
        meusGatos.sort(new ComparatorNomeCorIdade());
        // se nome for igual
                // vai ordenar por cor
                // se cor for igual
                        //vai ordenar por idade
                        // se idade for igual 
                                // Os gatos sao iguais 
        System.out.println(meusGatos);
    }
    /*Dadas as seguintes informçoes sobre meus gatos
     * crie umas lista e ordene esta lista exibindo:
     * (nome, idade , cor)
     */
    
     //Gato1 = nome: magrao, idade:3, cor = preto e branco
     //Gato1 = nome: matrix, idade:5, cor =  branco
     //Gato1 = nome: tiffani, idade:4, cor = preto 


 
}
// Criando objeto Gato
class Gato implements Comparable<Gato>{
    private String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome,Integer idade, String cor){
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }
    
    public String getNome(){
        return nome;
    }
    public Integer getIdade(){
        return idade;
    }
    public String getCor(){
        return cor;
    }
    // Ao executar  o programa desta observação para cima
    //  o codigo ira gerar o endereço de memoria 
    // entao vamos sobrescrever dentro da classe gato 
    // utilizando informações da mesma
    @Override
    public String toString(){
        return "{" +
        " nome "+ nome +
        " ,idade "+ idade+
        " ,cor "+cor + 
        "}";
    }
    // Ao utilizar o compareble, somos obrigados a sobrecrever o compareTo
    @Override
    public int compareTo(Gato gato){
        return this.getNome().compareToIgnoreCase(gato.getNome());
        // utilizamos o this pois estamos dnetro da classe gato
    }
}
// para utilzar o comparetor devemos criar uma classe
class ComparetorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

class CompretorCor implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        return g1.getCor().compareToIgnoreCase(g2.getCor());
        // Estamos comparando a cor dos gatos que sao Strings
        // Se as cores forem iguais vai retornar 0
        //se Gato 1 for maior que o  Gato 2  vai retornar 1: numero positivo
        // se Gato 2 for maior que o Gato 1 vai retornar -1: numero negativo
    }
}
class ComparatorNomeCorIdade implements Comparator<Gato>{
    @Override
    public int compare(Gato g1, Gato g2){
        int nome = g1.getNome().compareToIgnoreCase(g2.getNome());
        if(nome != 0) return nome;

        int cor = g1.getCor().compareToIgnoreCase(g2.getCor());
        if(cor != 0 ) return cor;

        // Se Nao retorne
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}