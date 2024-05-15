package hamburguesas;

import componentes.Extra;
import componentes.Medallon;

public class HamburguesaSimple extends Hamburguesa {
    private Medallon primerMedallon;
    private Extra primerExtra;

    public HamburguesaSimple(int precio_base) {
        this.precioBase = precio_base;
    }

    @Override
    public int getPrecio() {
        return primerMedallon.getPrecio() + primerExtra.getPrecio() + this.precioBase;
    }

    @Override
    public void addMedallon(Medallon medallon) {
        this.primerMedallon = medallon;
    }

    @Override
    public void addExtra(Extra extra) {
        if (primerMedallon != null) {
            this.primerExtra = extra;
        }

    }

}
