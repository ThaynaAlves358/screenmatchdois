package calculos;

import br.com.alura.screenmatch.Filme;
import br.com.alura.screenmatch.Titulo;



    public class Calculadora {

        private int tempoTotal;

        public void inclui(Titulo titulo) {
            tempoTotal += titulo.getDuracaoEmMinutos();
        }

        public int getTempoTotal() {
            return tempoTotal;
        }

    }

