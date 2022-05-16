package hw3.task_Salary


 abstract class Employee(
    var id: Int? = null,
    var name: String? = null,
    var surname: String? = null,
    var position: String? = null,
    var hourlyRate: Double? = null
) {
    abstract fun <T : Employee> calculatingMonthlyAverageSalary(hourlyRate: Double): Double
}
