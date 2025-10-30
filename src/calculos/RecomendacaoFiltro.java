package calculos;

public class RecomendacaoFiltro {
    private String recomendacao;

    public void filtra(Classificavel classificavel){
        if(classificavel.getClassificacao() >= 4){
            System.out.println("ESTA ENTRE OS PREFERIDOS DO MOMENTO");
        }else if (classificavel.getClassificacao() >=2){
            System.out.println("BEM AVALIADO NO MOMENTO");
        }else {
            System.out.println("Coloque na sua lista para assitir depois");
        }
    }
}
