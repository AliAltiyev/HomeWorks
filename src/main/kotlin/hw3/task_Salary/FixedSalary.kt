package hw3.task_Salary

import kotlinx.serialization.Serializable


class FixedSalary(
    id: Int? = null,
    name: String? = null,
    surname: String? = null,
    position: String? = null,
    hourlyRate: Double? = null
) : Employee(id, name, surname, position, hourlyRate) {

    override infix fun <T : Employee> calculatingMonthlyAverageSalary(hourlyRate: Double): Double {
        return hourlyRate
    }
}
