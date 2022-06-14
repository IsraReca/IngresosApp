package lettuce.ingresosapp.bdd

import lettuce.ingresosapp.model.EgresoModel

class EgresosDataTable {
    companion object {
        fun addEgresos(mes: Int, egreso: EgresoModel) {

        }

        fun getEgresos(mes: Int): List<EgresoModel> {
            val egresos = mutableListOf<EgresoModel>()
            egresos.add(EgresoModel(10000, 1))
            egresos.add(EgresoModel(20000, 2))
            egresos.add(EgresoModel(30000, 3))
            return egresos
        }
    }
}