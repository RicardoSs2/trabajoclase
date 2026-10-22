public class Podcast extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;
    private int episodio;

    public Podcast(String titulo, String autor, int duracionSeg, int episodio) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
        this.episodio = episodio;
    }

    public String tipo() {
        return "Podcast";
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void reproducir() {
        System.out.println("Reproduciendo podcast: " + getTitulo() + " episodio " + episodio);
    }

    public double calcularTamanoMB() {
        return duracionSeg / 60.0;
    }
}
