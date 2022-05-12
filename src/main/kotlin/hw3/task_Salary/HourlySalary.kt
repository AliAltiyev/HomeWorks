package hw3.task_Salary

public class HourlySalary(
    id: Int? = null,
    name: String? = null,
    surname: String? = null,
    position: String? = null,
    hourlyRate: Double? = null
) : Employee(id, name, surname, position, hourlyRate) {

    override infix fun <T : Employee> calculatingMonthlyAverageSalary(hourlyRate: Double): Double {

        return hourlyRate.times(HOURLY_CALCULATION_FORMULA)
    }


}
