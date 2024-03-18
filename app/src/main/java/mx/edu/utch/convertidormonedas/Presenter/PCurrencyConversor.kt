package mx.edu.utch.convertidormonedas.presenter

import mx.edu.utch.convertidormonedas.model.CurrencyConverterModel
import mx.edu.utch.convertidormonedas.view.ConvertView

class PCurrencyConversor(private val view: ConvertView) {

    fun convertCurrency(pesos: Double) {
        val model = CurrencyConverterModel(pesos)
        val message = model.convertCurrency()
        view.showConversionResult(message)
    }
}
