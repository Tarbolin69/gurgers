package hamburguesas;

import componentes.Extra;
import componentes.Medallon;

public abstract class Hamburguesa {
    protected int precioBase;

    public void cambiarPrecioBase(int nuevo_precio) {
        this.precioBase = nuevo_precio;
    }
    public abstract void addMedallon(Medallon medallon);
    public abstract void addExtra(Extra extra);
    public abstract int getPrecio();

}
