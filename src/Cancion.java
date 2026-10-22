public class Cancion extends Contenido implements Reproducible, Descargable {
    private int duracionSeg;

    public Cancion(String titulo, String autor, int duracionSeg) {
        super(titulo, autor);
        this.duracionSeg = duracionSeg;
    }

    public String tipo() {
        return "Canción";
    }

    public int getDuracionSeg() {
        return duracionSeg;
    }

    public void reproducir() {
        System.out.println("Reproduciendo canción: " + getTitulo());
    }

    public double calcularTamanoMB() {
        return (duracionSeg / 60.0) * 1.5;
    }
}
