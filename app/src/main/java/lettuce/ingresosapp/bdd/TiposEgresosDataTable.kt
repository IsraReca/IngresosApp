package lettuce.ingresosapp.bdd

import lettuce.ingresosapp.model.TipoEgresoModel

class TiposEgresosDataTable {
    companion object {
        fun getTiposEgresos(): List<TipoEgresoModel> {
            val tipos = mutableListOf<TipoEgresoModel>()
            tipos.add(TipoEgresoModel(1, "Alchocol"))
            tipos.add(TipoEgresoModel(2, "Comida"))
            tipos.add(TipoEgresoModel(3, "Pizza"))
            return tipos
        }
    }
}