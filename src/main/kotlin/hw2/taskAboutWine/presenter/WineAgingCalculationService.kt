package hw2.taskAboutWine.presenter

import hw2.taskAboutWine.view.Wine
import java.time.Period

interface WineAgingCalculationService {
    fun calculate(wine: Wine): String
}