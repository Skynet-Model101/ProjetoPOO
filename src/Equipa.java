
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Classe Equipa
 *
 * @author @Skynet-Model101
 * @author @DiogoPereiraMatos
 * @author @MiguelFernandes13
 * @see jogador.java
 */
public class Equipa {

    /**
     * Numero de titulares na equipa.
     */
    private int nTitulares;

    /**
     * Numero de suplentes na equipa.
     */
    private int nSuplentes;

    /**
     * List de jogadores, neste caso titulares.
     */
    private List<Jogador> titulares;

    /**
     * List de jogadores, neste caso suplentes.
     */
    private List<Jogador> suplentes; // Array List de jogadores, neste caso suplentes.

    /**
     * Metodo que cria uma instancia de equipa com valores pre-defenidos.
     *
     * @param void
     * @return void
     */
    public Equipa() {
        this.nTitulares = 0;
        this.nSuplentes = 0;
        this.titulares = new ArrayList<>();
        this.suplentes = new ArrayList<>();
    }

    /**
     * Metodo que cria uma instancia de equipa com os valores recebidos.
     *
     * @param nTitulares
     * @param nSuplentes
     * @param titulares
     * @param suplentes
     */
    public Equipa(int nTitulares, int nSuplentes, ArrayList<Jogador> titulares, ArrayList<Jogador> suplentes) {
        this.nTitulares = nTitulares;
        this.nSuplentes = nSuplentes;
        this.titulares = titulares.stream().map(Jogador::clone).collect(Collectors.toList());
        this.suplentes = suplentes.stream().map(Jogador::clone).collect(Collectors.toList());
    }

    /**
     * Metodo que cria uma instancia de equipa a partir de outra equipa recebida.
     *
     * @param e
     */
    public Equipa(Equipa e) {
        this.nTitulares = e.getnTitulares();
        this.nSuplentes = e.getnSuplentes();
        this.titulares = e.getTitulares();
        this.suplentes = e.getSuplentes();
    }

    /**
     * Metodo que debolve o numero de titulares na equipa.
     *
     * @return nTitulares
     */
    public int getnTitulares() {
        return this.nTitulares;
    }

    /**
     * Metodo que altera o numero de suplentes na equipa
     *
     * @param nTitulares
     */
    public void setnTitulares(int nTitulares) {
        this.nTitulares = nTitulares;
    }

    /**
     * Metodo que debolve o numero de suplentes na equipa.
     *
     * @return nSuplentes
     */
    public int getnSuplentes() {
        return this.nSuplentes;
    }

    /**
     * Metodo que altera o numero de suplentes na equipa
     *
     * @param nSuplentes
     */
    public void setnSuplentes(int nSuplentes) {
        this.nSuplentes = nSuplentes;
    }

    /**
     * Metodo que devolve a lista de titulares da equipa.
     *
     * @return titulares
     */
    public List<Jogador> getTitulares() {
        return this.titulares.stream().map(Jogador::clone).collect(Collectors.toList());
    }

    /**
     * Metodo que altera os valores do ArrayList de joagdores titulares.
     *
     * @param titulares
     * @param nTitulares
     */
    public void setTitulares(ArrayList<Jogador> titulares, int nTitulares) {
        this.nTitulares = nTitulares;
        this.titulares = new ArrayList<Jogador>(nTitulares);
        for (Jogador t : titulares)
            this.titulares.add(t);
    }

    /**
     * Metodo que devolve a lista de suplentes da equipa.
     *
     * @return suplentes
     */
    public List<Jogador> getSuplentes() {
        return this.suplentes.stream().map(Jogador::clone).collect(Collectors.toList());
    }

    /**
     * Metodo que altera os valores do ArrayList de jogadores suplentes.
     *
     * @param suplentes
     * @param nSuplentes
     */
    public void setSuplentes(ArrayList<Jogador> suplentes, int nSuplentes) {
        this.nSuplentes = nSuplentes;
        this.suplentes = new ArrayList<Jogador>(nSuplentes);
        for (Jogador s : suplentes)
            this.suplentes.add(s);
    }

    /**
     * Metodo que calcula o overall da equipa.
     *
     * @return overall da equipa
     */
    public double overallEquipa() {
        double overall = 0;
        for (Jogador t : this.titulares)
            overall += t.overall();
        for (Jogador s : this.suplentes)
            overall += s.overall();
        return (overall / (this.nTitulares + this.nSuplentes));
    }

}