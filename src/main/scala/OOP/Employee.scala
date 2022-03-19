package OOP
import java.util.Map.Entry
import scala.collection.mutable.ListBuffer

class Employee (private val job: String, private val salary: Double, private val name: String) {
  def getName(): String = name
  def getJob(): String = job
  def getSalary(): Double = salary
}

object Employee {

  def getJobAndItsAverageSalary(employees: ListBuffer[Employee]): Map[String, Double] = {
    val jobAndAverageSalary = employees.groupBy(employee => employee.getJob())
      .map(entry => entry._1 -> entry._2.map(em => em.getSalary()).sum/entry._2.size)
    jobAndAverageSalary
  }

  def main (args: Array[String]): Unit = {
    val employees = new ListBuffer[Employee]()
    employees.addOne(new Employee("Developer", 10, "yoshi"))
    employees.addOne(new Employee("Builder", 20, "lee"))
    employees.addOne(new Employee("Chef", 30, "warrio"))
    employees.addOne(new Employee("Developer", 60, "don"))
    employees.addOne(new Employee("Chef", 10, "ra"))
    employees.addOne(new Employee("Builder", 10, "leo"))
    employees.addOne(new Employee("Developer", 100, "ralph"))

    println(Employee.getJobAndItsAverageSalary(employees))
  }
}
