Проект Airport: 

Создать список самолётов вылетающих в ближайшие два часа.


Проект Employee: 

1. Создайте класс компании Company, содержащей сотрудников и реализующей методы:

найм одного сотрудника — hire(),
найм списка сотрудников – hireAll(),
увольнение сотрудника – fire(),
получение значения дохода компании – getIncome().
Аргументы и возвращаемое значение методов выберите на основании логики работы вашего приложения.

2. Создайте два метода, возвращающие список указанной длины (count). Они должны содержать сотрудников, отсортированных по убыванию и возрастанию заработной платы:

List<Employee> getTopSalaryStaff(int count),
List<Employee> getLowestSalaryStaff(int count).

3. Создайте классы сотрудников с информацией о зарплатах и условиями начисления зарплаты:

Manager — зарплата складывается из фиксированной части и бонуса в виде 5% от заработанных для компании денег. Количество заработанных денег для компании генерируйте случайным образом от 115 000 до 140 000 рублей.
TopManager — зарплата складывается из фиксированной части и бонуса в виде 150% от заработной платы, если доход компании более 10 млн рублей.
Operator — зарплата складывается только из фиксированной части.

Каждый класс сотрудника должен имплементировать интерфейс Employee. В интерфейсе Employee должен быть объявлен метод, возвращающий зарплату сотрудника:

getMonthSalary()

Аргументы и возвращаемое значение метода выберите в соответствии с логикой начисления зарплат. В интерфейсе при необходимости объявляйте необходимые методы.


Проект GetSizeDirectory: 

Вычислить размер директории.
