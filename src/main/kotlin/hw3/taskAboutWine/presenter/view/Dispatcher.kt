package hw3.taskAboutWine.presenter.view

import hw3.taskAboutWine.presenter.WineAgingCalculationServiceImpl
import java.lang.StringBuilder
import java.time.LocalDate
import java.time.Month

fun main() {
    val wine = Wine(
        "Colon-Sigurg (Chateau)",
        StringBuilder(
            "This wine demonstrates the qualities that have made Marlborough" +
                    " famous for its Avignon Blanc."
        ),
        "France",
        LocalDate.of(1992, Month.MAY, 11),
        StringBuilder("Вредно много употреблять ")
    )
    val wineAgingCalculationServiceImpl = WineAgingCalculationServiceImpl()
    val calculate = wineAgingCalculationServiceImpl.calculate(wine)
    println(calculate)
}