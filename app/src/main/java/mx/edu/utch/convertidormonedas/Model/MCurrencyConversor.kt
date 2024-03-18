// CurrencyConverterModel.kt
package mx.edu.utch.convertidormonedas.model

data class CurrencyConverterModel(
    val pesos: Double,
    val rate: Double = 16.71
) {
    val convertedAmount: Double
        get() = pesos * rate

    fun convertCurrency(): String {
        return "$pesos USD son ${String.format("%.2f", convertedAmount)} MNX"
    }
}
