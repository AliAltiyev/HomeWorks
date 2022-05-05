package hw2.taskAboutWine.presenter

import hw2.taskAboutWine.view.Wine
import java.time.LocalDate
import java.time.Period

class WineAgingCalculationServiceImpl : WineAgingCalculationService {
    override fun calculate(wine: Wine): String {
        val now = LocalDate.now()
        val between = Period.between(now, wine.spillDAte)
        return ("""
                   Info About wine : ${wine.infoAboutWine} 
                   Brand           : ${wine.wineName}  
                   Mady in         : ${wine.madeBy} 
                   Spill date      : ${wine.spillDAte} 
                   Some note       : ${wine.someNote} 
                   --------------------------------- 
                   Wine aging calculation: $between)""").trim()


    }

}