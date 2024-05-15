package hamburguesas;

import componentes.Extra;
import componentes.Medallon;

public class HamburguesaDoble extends Hamburguesa {
    private Medallon primerMedallon;
    private Medallon segundoMedallon;
    private Extra primerExtra;
    private Extra segundoExtra;

    public HamburguesaDoble(int precio_base) {
        this.precioBase = precio_base;
    }

    @Override
    public int getPrecio() {
        return primerMedallon.getPrecio() + segundoMedallon.getPrecio() + primerExtra.getPrecio() + segundoExtra.getPrecio() + this.precioBase;
    }

    @Override
    public void addMedallon(Medallon medallon) {
        if (primerMedallon == null) {
            this.primerMedallon = medallon;
        } else {
            this.segundoMedallon = medallon;
        }
    }

    @Override
    public void addExtra(Extra extra) {
        if (primerMedallon != null && primerExtra == null) {
            this.primerExtra = extra;
        }
        if (segundoMedallon != null && segundoExtra == null) {
            this.segundoExtra = extra;
        }
    }
}
