package hw3.task_Salary

import java.io.BufferedReader
import java.io.File
import java.io.IOException

const val HOURLY_CALCULATION_FORMULA = 20.8 * 8
fun main() {
    val hrSpecialist = HourlySalary()
    val systemAnalyst = HourlySalary()
    val qa = HourlySalary()
    val softwareEngineer = HourlySalary()
    val databaseEngineer = HourlySalary()
    val systemAdministrator = FixedSalary()
    val securitySpecialist = FixedSalary()
    val supportSpecialist = FixedSalary()


    val employees: List<Employee> = listOf(
        systemAnalyst.apply {
            id = 1
            name = "Alexey"
            surname = "Kolmogorov"
            hourlyRate = 7.5
            position = "System Analyst"
            val salary = calculatingMonthlyAverageSalary<Employee>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )
        }, hrSpecialist.apply {
            id = 2
            name = "Alexandr"
            surname = "Morozov"
            hourlyRate = 8.0
            position = "HR"
            val salary = calculatingMonthlyAverageSalary<Employee>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )
        }, qa.apply {
            id = 3
            name = "Marat"
            surname = "Sergeev"
            hourlyRate = 16.5
            position = "QA"
            val salary = calculatingMonthlyAverageSalary<Employee>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname        
     
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )
        }, softwareEngineer.apply {
            id = 4
            name = "Oleg"
            surname = "Artemov"
            hourlyRate = 19.0
            position = "Software Engineer"
            val salary = calculatingMonthlyAverageSalary<Employee>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )

        }, databaseEngineer.apply {
            id = 5
            name = "Vadim"
            surname = "Federov"
            hourlyRate = 13.0
            position = "Database Engineer"
            val salary = calculatingMonthlyAverageSalary<Employee>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )
        }, securitySpecialist.apply {
            id = 7
            name = "Dmitri"
            surname = "Nikolaev"
            position = "System Administrator"
            hourlyRate = 37_329.0
            val salary = calculatingMonthlyAverageSalary<FixedSalary>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )

        }, supportSpecialist.apply {
            id = 8
            name = "Artem"
            surname = "Dymov"
            position = "Support Specialist"
            hourlyRate = 48_500.0
            val salary = calculatingMonthlyAverageSalary<FixedSalary>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )

        }, systemAdministrator.apply {
            id = 6
            name = "Egor"
            surname = "Klimonov"
            position = "System Administrator"
            hourlyRate = 56_780.0
            val salary = calculatingMonthlyAverageSalary<FixedSalary>(hourlyRate!!)
            println()
            println(
                """
             ID number of employee: $id
             Employee name        : $name
             Employee surname     : $surname
             Employee position    : $position
             Employee salary      : $salary
        """.trimIndent()
            )


//    //Sorting Employee
//    val sorted = employees.sortedBy { it.hourlyRate }
//    println(sorted.toString())
//    //First Five Employee
//    val takeFirstFive = employees.take(5)
//    println(takeFirstFive)
//    //Last Three Employee
//    val takeLastThree = employees.takeLast(3)
//    println(takeLastThree)
        })


}

fun List<Employee>.sortedEmployeeBySalary() = this.sortedBy { it.hourlyRate }
fun List<Employee>.getFirstFiveEmployee(): List<Employee> = this.take(5).toList()
fun List<Employee>.getLastThree(): List<Employee> = this.takeLast(3).toList()


object Dispatcher {
    fun writeToFile(data: List<Employee>) = try {
        File("Input.txt").printWriter().use { out ->
            data.map { "${it.id}, ${it.name}, ${it.surname}, ${it.position} ${it.hourlyRate}" }.sortedBy { it }
                .forEach { out.println(it) }
        }
    } catch (e: IOException) {
        println(message = e.message)
    }

    fun readToFile() {
        try {
            val bufferedReader: BufferedReader = File("Input.txt").bufferedReader()
            val result = bufferedReader.use {
                bufferedReader.readText()
            }
            println(result)

        } catch (e: IOException) {
            println(e.message)
        }
    }
}


