class Cliente {
    private final String nombre;
    private final String telefono;
    private final String email;
    private final Direccion direc;

    public Cliente(String nombre, String telefono, String email, Direccion direc) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.direc = direc;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + " " + direc + '}';
    }

}
