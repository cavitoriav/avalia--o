package classes;

    public class Aeronave {

    private String modelo;
    private Piloto numeroSerie;

    @Override
    public String toString() {
        String texto = " ";
        texto += "Modelo " + getModelo();
        texto += " - numeroSerie " + numeroSerie;
        return texto;
        }

        public String getModelo() {
            return modelo;
        }
        public void setModelo(String modelo) {
            this.modelo = modelo;
        }
        public Piloto getNumeroSerie() {
            return numeroSerie;
        }
        public void setNumeroSerie(Piloto numeroSerie) {
            this.numeroSerie = numeroSerie;
        }

        public void setNumeroSerie(String next) {
        }
    }
