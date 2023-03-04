package exemplosmap;

import java.security.Key;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.management.ValueExp;
import javax.sound.midi.SysexMessage;

public class ExemploMap {
    public static void main(String[] args){

        // observações:
                /* Quando estiver trabalhando com Map<String, Double> carrosPopulares = new HashMap<>(){{
                 * put = adiciona, altera
                 * containsKey = verifica se a cheve é existente dentro do dicionario
                 * Get = Exibir o conteudo dentro de cada Chave
                */
                /*Quando Estiver trabalhando com   Set<String> modelos = carrosPopulares.keySet();
                 * 
                 * 
                 *  Abaixo foi crianda uma colleção com elementos do tipo double para armazenar todos  respectivos valores  dos carros dentro da coleção
                 * Collection<Double> consumos = carrosPopulares.values();
                */

        /*
         * Map<String,Double> carrosPopulares = new HashMap<>() Generics(jdk)
         *HashMao<String, Double> carrosPopulares = new HashMap<>();
         *
         */
        System.out.println("Crie um dicionario que relacione os modelos de carros e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>(){{
            // put = Por 
            put("Gol", 14.4);
            put("BMW", 7.2);
            put("Jetta", 5.0);
            put("Cronnos", 14.5);
            put("voyage", 10.0);
        }};
        System.out.println(carrosPopulares);
        System.out.println("\nsubstitua o valor de consumo de todos os carros:\n");
        carrosPopulares.put("voyage", 13.5);
        carrosPopulares.put("BMW", 12.0);
        carrosPopulares.put("Gol", 15.2);
        carrosPopulares.put("Cronnos", 12.5);
        carrosPopulares.put("Jetta", 8.0);

        System.out.println(carrosPopulares);

        System.out.println("\nConfira se o veiculo tucson é existente dentro do dicionario: "+carrosPopulares.containsKey("Tucson"));
        System.out.println("confira se o veiculo Jetta é exuistente dentro do dicionario: "+carrosPopulares.containsKey("Jetta"));

        System.out.println("\n\n");// Variavel.Get
        System.out.println("Agora vamos trabalhar com o conteudo dentro de cada Key");
        System.out.println("Exibindo o consumo de cada veiculo: ");
        System.out.println("uno "+ carrosPopulares.get("uno"));
        System.out.println("Jetta "+ carrosPopulares.get("Jetta"));
        System.out.println("Gol "+ carrosPopulares.get("Gol"));
        System.out.println("BMW "+ carrosPopulares.get("BMW"));
        System.out.println("voyage "+ carrosPopulares.get("voyage"));
        System.out.println("Cronnos "+ carrosPopulares.get("Cronnos"));

        System.out.println("\n\n Set<String> modelos = carrosPopulares.keySet();");
        System.out.println("exiba os modelos  ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

        System.out.println("\n\n");

        System.out.println("Collection<Double> consumos = carrosPopulares.values();");
        System.out.println("Exiba o consumo dos carros ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);




    }
    
}
