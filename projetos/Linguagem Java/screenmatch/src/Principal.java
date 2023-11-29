import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;


public class Principal {
    public static void main(String[] args) {
        Filme oPoderosoChefao = new Filme();
        oPoderosoChefao.setNome("O poderoso chefão");
        oPoderosoChefao.setAnoDeLancamento(1970);
        oPoderosoChefao.setDuracaoEmMinutos(180);

        Filme AvatarFilme = new Filme();
        AvatarFilme.setNome("Avatar");
        AvatarFilme.setAnoDeLancamento(1970);
        AvatarFilme.setDuracaoEmMinutos(200);

        oPoderosoChefao.exibeFichaTecninca();
        oPoderosoChefao.avalia(8);
        oPoderosoChefao.avalia(5);
        oPoderosoChefao.avalia(10);
        //System.out.println(meuFilme.somaDasAvaliacoes);
        System.out.println(oPoderosoChefao.getTotalDeAvaliacoes());
        System.out.println(oPoderosoChefao.pegaMedia());

        Serie lost = new Serie();
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2000);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setAtiva(false);
        lost.setMinutosPorEpisodio(50);
        System.out.println(lost.getDuracaoEmMinutos());


        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(oPoderosoChefao);
        calculadora.inclui(lost);
        calculadora.inclui(AvatarFilme);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(oPoderosoChefao);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalvisualizacoes(300);
        filtro.filtra(episodio);





    }
}
