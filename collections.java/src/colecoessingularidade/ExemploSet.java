package colecoessingularidade;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ExemploSet {
    // Aprenderemos :
    // As caracteristicas da interface set
    // Como e quando utilizar  HashSet, linkedHashSet e treeSet
    // Conhecer os primeiros Metodos

    // pacote java.util.set
    // obs: Nao permite elementos duplicados
    //       Nao possui indice, nao é possivel acessar pelo indice diferent de list
    // TreeSet para ordenação
// HashSet implementa diretanmente de set
// LinkediHashSet extende de HashSet
    public static void main(String[] args){
        // Formas de iniciar o Set
        System.out.println("Criando lista");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 6d, 8d, 4.5, 6.7));
        // (Jdk5)- Diamond Operator///     Arrays.asList() para adicionar elementos apos criar a lista
        System.out.println(notas.toString());
        // rertorno de elementos em String fora de ordem

        System.out.println(" exibir indice");
        System.out.println(" adicionar no indice 4 o valor 99.0");
        System.out.println("Substituindo notas 8.5 por 83.0");

        // Temos e metodo contains na interfaxce HashSet
        System.out.println("confira se a notas 8.5 esta no conjundo : =>" + notas.contains(8.5));

        System.out.println("Exiba a terceira adicionada: ");
        
        // Para exibir min/max valor , Usamos Collections 
        System.out.println("exiba a menor nota: "+ Collections.min(notas));
        System.out.println("Exibindo maior nota: " + Collections.max(notas));

        // Para realizar a soma de valores dentro de uma lista 
        // Utilizamos o Interator
        System.out.println("\nExibindo a soma de valores");
        // iterando dentro de notas
        Iterator<Double> iterator = notas.iterator();
        // Abaixo a nossa variavel de controle
        Double soma = 0.0;
        // equanto houver proximo
        while(iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("{ soma de valores "+soma+ " }");

        System.out.println("exibindo a quantidade de elementos dentro da lista: ");
        System.out.println(notas.size());


        System.out.println("\nMedia das notas: "+(soma/notas.size()));

        System.out.println("remova a nota 8.5: ");
        notas.remove(8.5);
        System.out.println(notas);
        System.out.println("Numero de elementos na lista apos a remoção "+ notas.size());

        System.out.println("Remova o item com indice 3: ");

        System.out.println("Removendo valores menores ou iguais a 6:  ");
        Iterator<Double> iterator1 = notas.iterator();

        while(iterator1.hasNext()){
            Double next = iterator1.next();
            if(next <= 6) iterator1.remove();
            
        }
        System.out.println(notas);

        System.out.println("exiba as notas na ordem de inserção: ");
        // Para trabalhar com ordem de inserção devemos trabalhar com LinkedHashSet
        Set<Double> notas2 = new LinkedHashSet<>();
        // os elementos nao foram adicionados na criação da lista
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(6d);
        notas2.add(8d);
        notas2.add(4.5);    
        notas2.add(6.7);
        notas2.add(6.7); // este valor nao sera exibido pois LinkedHashSet nao permite repetiçoes

        System.out.println(notas2);



        System.out.println("Exibindo em ordem crescente: ");
        // Para trabalhar com a ordem natural dos elementos devemos utilizar a TreeSet
         // Estamos trabalhando com Double onde Ha o  compareble
         Set<Double> notas3 = new TreeSet<>(notas2);
         System.out.println(notas3);

         System.out.println("\nApague todo o conjunto");
         notas.clear();
         System.out.println(notas);

         System.out.println("Confira se o elemento esta vazio: "+ notas.isEmpty());


         System.out.println("Confira se o conjunto esta vazio: "+notas.isEmpty());
         System.out.println("Confira se o conjunto 2 esta  vazio: "+notas2.isEmpty());
         System.out.println("Confira se o conjunto 3 esta  vazio: "+notas3.isEmpty());
         notas.clear();
         notas2.clear();
         notas3.clear();
         System.out.println("segunda verificação , o conjunto esta vazio?"+notas.isEmpty());
         System.out.println("segunda verificação , o conjunto esta vazio?"+ notas2.isEmpty());
         System.out.println("segunda verificação , o conjunto esta vazio?"+notas3.isEmpty());
    }
}


