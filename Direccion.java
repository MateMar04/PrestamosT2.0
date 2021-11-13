class Direccion {
    private final String calle;
    private final String numero;
    private final Barrio barrio;

    public Direccion(String calle, String numero, Barrio barrio) {
        this.calle = calle;
        this.numero = numero;
        this.barrio = barrio;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", numero=" + numero + " " + barrio + '}';
    }


}
