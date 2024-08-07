import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        String[] palavras = new String[10];

        palavras[5] = "ababa";

        Optional<String> checaNulo = Optional.ofNullable(palavras[5]);

        if (checaNulo.isPresent()) {
            String palavra = palavras[5].toLowerCase();
            System.out.print(palavra);
        } else
            System.out.println("A palavra é nula!");

        String[] frases = new String[5];
        frases[2] = "Generation Brasil";

        Optional<String> optionalVazio = Optional.empty();
        System.out.println("\n Exibir optionalVazio: " + optionalVazio);
        System.out.println("\n optionalVazio está vazio? " + optionalVazio.isEmpty());

        Optional<String> valor_indice_02 = Optional.of(frases[2]);
        System.out.println("\n Exibir valor_indice_02: " + valor_indice_02);
        System.out.println("\n Obter o conteúdo de valor_indice_02: " + valor_indice_02.get());
        System.out.println("\n valor_indice_02 está presente? " + valor_indice_02.isPresent());


    }
}
