package componentes;

public abstract class Elemento {
    protected int precioBase;

    public int getPrecio() {
        return this.precioBase;
    }
    public void cambiarPrecioBase(int nuevo_precio) {
        this.precioBase = nuevo_precio;
    }
}
