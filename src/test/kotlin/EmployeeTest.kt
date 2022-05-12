import hw3.task_Salary.Dispatcher
import hw3.task_Salary.Employee
import hw3.task_Salary.FixedSalary
import hw3.task_Salary.HourlySalary
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

const val SALARY = 1500.0
const val Hourly_RATE = 7.5

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class EmployeeTest {


    @Test
    fun `calculating Fixed Salary`() {
        val fixedSalary = FixedSalary()
        assertEquals(SALARY, fixedSalary.calculatingMonthlyAverageSalary<Employee>(SALARY))
    }


    @Test
    @Disabled
    fun `calculating hourly salary`() {
        val hourlySalary = HourlySalary()
        assertEquals(hourlySalary, hourlySalary.calculatingMonthlyAverageSalary<Employee>(Hourly_RATE))

    }

    @Test
    fun `write to file`() {
        val employee = listOf<Employee>(
            HourlySalary(1, "Vasiliy"), HourlySalary(2, "Alexandro"), HourlySalary(3, "Jake")
        )
        val excepted = Dispatcher.writeToFile(employee)
        assertEquals(
            """
            1 Vasiliy
            2 Alexandro
            3 Jake
        """.trimIndent(), excepted
        )
    }


}