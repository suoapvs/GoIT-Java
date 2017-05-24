# [![GoIt Java](goit-logo.jpg)](http://java.new.goit.ua)

## Java Homework

### [Домашнее задание № 2.1](/src/main/java/ua/goit/java/lesson02/task01)
Input: array with size = 10 can be of one of two data types: int and double.
Calculate:
- sum
- min/max
- max positive
- multiplication
- modulus of first and last element
- second largest element

As a result you should have methods with following names :
- sum(int array[]), sum(double[])
- min(int array[]), min(double[])
- max(int array[]), max(double[])
- maxPositive(int array[]), maxPositive(double array[]),
- multiplication  (int array[]), multiplication (double[])
- modulus(int array[]), modulus(double[])
- secondLargest(int array[]), secondLargest(double[])


### [Домашнее задание № 2.2](/src/main/java/ua/goit/java/lesson02/task02)
Continue with BANK example
2.1 Write method which withdraws money from account and takes commission 5% of the transaction.
Print OK + commission + balance after withdrawal. Print NO is withdrawal is not possible.

**Example**
<table>
    <tr>
        <th>Input</th>
        <th>Input</th>
    </tr>
    <tr>
        <td>
            balance = 100 <br>
            withdrawal = 10
        </td>
        <td>
            balance = 100 <br>
            withdrawal = 99
        </td>
    </tr>
    <tr>
        <th>Output</th>
        <th>Output</th>
    </tr>
    <tr>
        <td>
            OK 0.5 89.5
        </td>
        <td>
            NO
        </td>
    </tr>
</table>


### [Домашнее задание № 2.3](/src/main/java/ua/goit/java/lesson02/task03)
You need to write method which withdraw money of particular account owner if he/she can.
Print name + NO of withdrawal fs not possible and name + sum of withdrawal + balance after
withdrawal in other case. Commission is 5% for all cases.

**Example**
<table>
    <tr>
        <th>Input</th>
        <th>Input</th>
    </tr>
    <tr>
        <td>
            <code>
                int[] balances = {1200, 250, 2000, 500, 3200}; <br>
                String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"}; <br>
                <br>
                String ownerName = Ann; <br>
                double withdrawal = 100;
            </code>
        </td>
        <td>
            <code>
                int[] balances = {1200, 250, 2000, 500, 3200}; <br>
                String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"}; <br>
                <br>
                String ownerName = Oww; <br>
                double withdrawal = 490;
            </code>
        </td>
    </tr>
    <tr>
        <th>Output</th>
        <th>Output</th>
    </tr>
    <tr>
        <td>
            Ann 100 145
        </td>
        <td>
            Oww NO
        </td>
    </tr>
</table>


### [Домашнее задание № 2.4](/src/main/java/ua/goit/java/lesson02/task04)
You need to write method which will fund (пополнение) balance of particular user.
Print name + balance after funding

<table>
    <tr>
        <th>Input</th>
    </tr>
    <tr>
        <td>
            <code>
                int[] balances = {1200, 250, 2000, 500, 3200}; <br>
                <br>
                String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"}; <br>
                <br>
                String ownerName = Oww; <br>
                double withdrawal = 100;
            </code>
        </td>
    </tr>
    <tr>
        <th>Output</th>
    </tr>
    <tr>
        <td>
            Oww 600
        </td>
    </tr>
</table>


### [Домашнее задание № 3.1](/src/main/java/ua/goit/java/lesson03/task01)
Добавить метод sing к классу Bird, потом измените основной метод соответственно,
чтобы код вывел следующий текст:
```
 I am walking
 I am flying
 I am singing
 I am Bird
 ```


### [Домашнее задание № 3.2](/src/main/java/ua/goit/java/lesson03/task02)
Напишите класс с названием Arithmetic с методом add, который принимает целые
числа как параметры и возвращает переменную типа integer, которая есть их суммой.

Напишите класс Adder, который наследуется от класса Arithmetic.
У класса Adder должен быть метод check, который сравнивает 2 номера и возвращает true,
если а>=b и false в других случаях.

Сигнатура методов:
```
int add(Integer a, Integer b)
boolean check(Integer a, Integer b)
```


### [Домашнее задание № 3.3](/src/main/java/ua/goit/java/lesson03/task03)
Создать следующую структуру классов.

Класс Course с полями:
```
 Date startDate,
 String name,
 int hoursDuration,
 String teacherName.
```

Создайте 2 конструктора с аргументами
```
 startDate, name;
 hourseDuration, name, teacherName.
```

Класс Student с полями:
```
 String firstName,
 String lastName,
 int group,
 Course[] coursesTaken,
 int age.
```
С 2 конструкторами с аргументами
```
 firstName, lastName, group;
 lastName, coursesTaken.
```

CollegeStudent унаследован от Student.
Дополнительные поля:
```
String collegeName, int rating, long id.
```
Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.

Class SpecialStudent унаследован от CollegeStudent.
Дополнительные поля:
```
long secretKey, String email.
```
Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.

Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
У вас должно быть 13 объектов в классе Solution.


### [Домашнее задание № 3.4](/src/main/java/ua/goit/java/lesson03/task04)
Создайте класс User со следующими полями:
```
 String name,
 int balance,
 int monthsOfEmployment,
 String companyName,
 int salary,
 String currency.
```

Создайте get-, set-методы и конструктор с аргументами - всеми полями класса.
Напишите методы:
```
 void paySalary() - добавляет заработную плату к балансу пользователя
 withdraw(int summ) - снимает деньги с баланса с комиссией 5%, если сумма < 1000 и комиссией 10% в других случаях
 companyNameLength - вычисляет длину имя компании
 monthIncreaser(int addMonth) - увеличивает monthsOfEmployment на addMonth
```


### [Домашнее задание № 4.1](/src/main/java/ua/goit/java/lesson04/task01)
Создайте следующую структуру:
Абстрактный класс Bank и 3 класса, которые его расширяют: USBank, EUBank, ChinaBank.

Абстрактный класс Bank должен содержать поля:
```
long id
String bankCountry
Currency currency
int numberOfEmployees
double avrSalaryOfEmployee
long rating
long totalCapital
```

Создайте get-,set-методы и конструктор с аргументами - всеми полями.
Методы:
```
abstract int getLimitOfWithdrawal()
abstract int getLimitOfFunding()
abstract int getMonthlyRate()
abstract int getCommission(int summ)
double moneyPaidMonthlyForSalary()
```


### [Домашнее задание № 4.2](/src/main/java/ua/goit/java/lesson04/task02)
Создайте следующую структуру: Enum Currency.

Currency - это Enum с двумя значениями: USD, EUR.


### [Домашнее задание № 4.3](/src/main/java/ua/goit/java/lesson04/task03)
Создайте следующую структуру:

Класс User, который отображает пользователя банковской системы.

- USBank:
 - лимит снятия = 1000, если валюта - USD и 1200, если валюта - EUR
 - лимит пополнения - 10000, если EUR, и нет лимита, если USD
 - месячная ставка - 1% на USD и 2% на EUR
 - комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 - 6%, если EUR и до 1000 и 8%, если EUR и больше 1000

- EUBank:
 - лимит снятия = 2000, если валюта - USD и 2200, если EUR
 - лимит пополнения - 20000, если EUR и 10000, если USD
 - месячная ставка - 0% на USD и 1% на EUR
 - комиссия 5%, если USD и до 1000, 7%, если USD и больше 1000
 - 2%, если EUR и до 1000 и 4%, если EUR и больше 1000

- ChinaBank:
 - лимит снятия = 100, если валюта - USD и 150, если EUR
 - лимит пополнения - 5000, если EUR и 10000, если USD
 - месячная ставка - 1% на USD и 0% на EUR
 - комиссия 3%, если USD и до 1000, 5%, если USD и больше 1000
 - 10%, если EUR и до 1000 и 11%, если EUR и больше 1000


### [Домашнее задание № 4.4](/src/main/java/ua/goit/java/lesson04/task04)
Создайте следующую структуру:
Интерфейс BankSystem и его реализацию BankSystemImpl.

В классе User должны быть следующие поля:
```
long id
String name
double balance
int monthsOfEmployment
String companyName
int salary
Bank bank
```

Класс User не имеет собственных методов. Но перегружает метод toString.


### [Домашнее задание № 4.5](/src/main/java/ua/goit/java/lesson04/task05)
Создайте следующую структуру:
Класс Main с методом main, где вы должны создать 6 объектов класса User
(2 - USBank, 2 - EUBank, 2 - ChinaBank).

Создать интерфейс BankSystem с методами:
```
void withdrawOfUser(User user, int amount)
void fundUser(User user, int amount)
void transferMoney(User fromUser, User toUser, int amount)
void paySalary(User user)
```
и его релизацию.


### [Домашнее задание № 4.6](/src/main/java/ua/goit/java/lesson04/task06)
You need to following structure: abstarct class Bank and three classes that extends it:
USBank, EUBank, ChinaBank. Enum Currency. Class User that represents User of our Bank System.
Interface BankSystem and its implementation BankSystemImpl.

Create Main class with main method, where you should create 6 Users: 2 of USBank, 2 of EUBank
and 2 of ChinaBank. Run four different operations with every User’s balance and print its objects to console.


### [Домашнее задание № 5.1](/src/main/java/ua/goit/java/lesson05/task01)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Класс Room должен содержать следующие поля:
```
long id
int price
int persons
Date dateAvailableFrom
String hotelName
String cityName
```
Создайте get-,set-методы и конструктор с аргументами - всеми полями.


### [Домашнее задание № 5.2](/src/main/java/ua/goit/java/lesson05/task02)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Перегрузите методы equals и hashCode (2 объекты Room равны, когда поля price, persons и cityName равны).


### [Домашнее задание № 5.3](/src/main/java/ua/goit/java/lesson05/task03)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Создайте API интерфейс с одним методом
Room[] findRooms(int price, int persons, String city, String hotel)


### [Домашнее задание № 5.4](/src/main/java/ua/goit/java/lesson05/task04)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Создайте 3 реализации API, которые называются:
- BookingComAPI,
- TripAdvisorAPI,
- GoogleAPI.

В каждой реализации есть глобальная переменная Room[] rooms, которая должна быть инициализована
констуктором по умолчанию пятью разными объектами Room.


### [Домашнее задание № 5.5](/src/main/java/ua/goit/java/lesson05/task05)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Создать интерфейс DAO и его реализацию.
Методы выводят название операции и объекта, над которым она произведена.
```
Room save(Room room)
boolean delete(Room room)
Room update(Room room)
Room findById(long id)
```


### [Домашнее задание № 5.6](/src/main/java/ua/goit/java/lesson05/task06)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

Создайте класс Controller, в котором есть глобальная переменная API apis[] = new API[3],
которая содержит все реализации интерфейса API.
Также у Controller есть 2 метода:
```
Room[] requestRooms(int price, int persons, String city, String hotel) -
ищет все номера с запрашиваемыми параметрами.
Room[] check(API api1, API api2) -
Проверить, сколько одинаковых номеров возвращают две разные API.
 ```
Все методы используют доступные методы API для поиска.
Найденные номера формируют новую DB.


### [Домашнее задание № 5.7](/src/main/java/ua/goit/java/lesson05/task07)
Создайте часть System, которая может найти комнаты в отелях для бронирования и сохранить их в DataBase.

Архитектура следующая:
- Класс Room, который отображает сущность комнаты, которая используется в системе.
- API интерфейс и 3 его реализации.
- DAO интерфейс и его реализацию.
- Controller, который будет содержать логику.

Также создайте класс Main с методом main, чтобы отобразить результат.

!!! Сначала создайте UML диаграммы, и только потом пишите код. !!!

В методе класса Main создайте Controller и сделайте 3 запроса с разными параметрами, чтобы найти номера.
Также проверьте все методы 3 раза с разными API, чтобы продемонстрировать, как работает программа.


### [Домашнее задание № 6.1](/src/main/java/ua/goit/java/lesson06/task01)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

Create ArraysUtils with following methods
```
sum(int array[])
min(int array[])
max(int array[])
maxPositive(int array[])
multiplication  (int array[])
modulus(int array[])
secondLargest(int array[])
```
these should be just copied from your HW2.

In addition add new methods
```
int[] reverse(int[] array)
int[] findEvenElements(int[] array)
```


### [Домашнее задание № 6.2](/src/main/java/ua/goit/java/lesson06/task02)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

In HW2 use methods from your ArraysUtils.


### [Домашнее задание № 6.3](/src/main/java/ua/goit/java/lesson06/task03)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

Make sure nobody can inherit your ArraysUtils.


### [Домашнее задание № 6.4](/src/main/java/ua/goit/java/lesson06/task04)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

Create User class with fields
```
long id
String firstName
lastName
int salary
int balance
```
and constructor with all fields.


### [Домашнее задание № 6.5](/src/main/java/ua/goit/java/lesson06/task05)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

Create сlass UserUtils with following methods
```
User[] uniqueUsers(User[] users)
//users are equal when all their field are equal
User[] usersWithContitionalBalance(User[] users, int balance)
//user’s balance == balance
User[] paySalaryToUsers(User[] users)
long[] getUsersId(User[] users)
User[] deleteEmptyUsers(User[] users)
```
Make sure paySalaryToUsers and getUsersId methods can’t be overriden in other classes.


### [Домашнее задание № 6.6](/src/main/java/ua/goit/java/lesson06/task06)
You need to create two classes ArraysUtils and UserUtils with static and final methods
and use ArraysUtils methods in HW2 to symplify it.

Create Main class with main method where you need to create some test users and demonstrate
how every method from UserUtils work.


### [Домашнее задание № 7.1](/src/main/java/ua/goit/java/lesson07/task01)
Класс User должен содержать поля:
```
 long id
 String firstName
 String lastName
 String city
 int balance
```

Класс Order:
```
 long id
 int price
 Currency currency
 String itemName
 String shopIdentificator
 User user
```


### [Домашнее задание № 7.2](/src/main/java/ua/goit/java/lesson07/task02)
В Main создайте 10 заказов с 10 пользователями и добавьте его в List.
- отсортируйте список за ценой заказа по убыванию
- отсортируйте список за ценой заказа по возрастанию и за городом пользователя
- отсортируйте список за наименованием и идентификатором заказа, и городом пользователя

Дополнительно (выполняется по желанию):
- удалите дублированные данные со списка
- удалите объекты, где цена меньше 1500
- разделите список на 2 списка - заказы в долларах и в гривнах
- разделите список на столько списков, сколько уникальных городов в User


### [Домашнее задание № 7.3](/src/main/java/ua/goit/java/lesson07/task03)
Создайте класс Main, где создайте 10 заказов с 10 пользователями и добавьте его в TreeSet.
Создайте 8 уникальных и 2 дублированых заказа.
- проверьте, содержит ли сет заказ, где фамилия пользователя - “Petrov”
- выведите заказ с наибольшей ценой, исспользуя только один сет-метод - get
- удалите заказы, где валюта доллар, используя Iterator


### [Домашнее задание № 7.4](/src/main/java/ua/goit/java/lesson07/task04)
Все подходящие структуры данных (массивы) для User с Домашней работы в модуле 5 должны быть перенесены.


### [Домашнее задание № 7.5](/src/main/java/ua/goit/java/lesson07/task05)
Сгенерируйте Integer и String ArrayList и LinkedList с 1000 и 10000 элементами.
Измерьте время выполнения этих методов и выведите их в консоль:
- add
- set
- get
- remove
