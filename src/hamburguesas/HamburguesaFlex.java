package hamburguesas;

import componentes.Extra;
import componentes.Medallon;

import java.util.ArrayList;
import java.util.List;

public class HamburguesaFlex extends Hamburguesa {
    private List<Medallon> medallones = new ArrayList<>();
    private List<Extra> extras = new ArrayList<>();

    public HamburguesaFlex(int precio_base) {
        this.precioBase = precio_base;
    }

    @Override
    public void addMedallon(Medallon medallon) {
        medallones.add(medallon);
    }

    @Override
    public void addExtra(Extra extra) {
        extras.add(extra);
    }

    @Override
    public int getPrecio() {
        int precio_final = this.precioBase;
        for (Medallon medallon : medallones) {
            precio_final += medallon.getPrecio();
        }
        for (Extra extra : extras) {
            precio_final += extra.getPrecio();
        }
        return precio_final;
    }
}
