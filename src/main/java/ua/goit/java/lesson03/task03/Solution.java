package ua.goit.java.lesson03.task03;

import java.util.Date;

/**
 * 3.3 Создать следующую структуру классов.
 * <p>
 * Класс Course с полями:
 * ```
 * Date startDate,
 * String name,
 * int hoursDuration,
 * String teacherName.
 * ```
 * <p>
 * Создайте 2 конструктора с аргументами
 * ```
 * startDate, name;
 * hourseDuration, name, teacherName.
 * ```
 * <p>
 * Класс Student с полями:
 * ```
 * String firstName,
 * String lastName,
 * int group,
 * Course[] coursesTaken,
 * int age.
 * ```
 * С 2 конструкторами с аргументами
 * ```
 * firstName, lastName, group;
 * lastName, coursesTaken.
 * ```
 * <p>
 * CollegeStudent унаследован от Student.
 * Дополнительные поля:
 * ```
 * String collegeName, int rating, long id.
 * ```
 * Создайте 3 конструктора: 2 таких же, как и в Student and один с аргументами - всеми полями класса.
 * <p>
 * Class SpecialStudent унаследован от CollegeStudent.
 * Дополнительные поля:
 * ```
 * long secretKey, String email.
 * ```
 * Создайте 3 конструктора: 2 таких же, как и в CollegeStudent и один с аргументом secretKey.
 * <p>
 * Создайте get-, set-методы для всех полей и сделайте их private согласно принципам ООП.
 * Создайте 5 объектов класса Course. Создайте объекты других классов, используя все конструкторы.
 * У вас должно быть 13 объектов в классе Solution.
 *
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Solution {

    public static void main(String[] args) {
        final Course one = new Course(new Date(), "CurrencyExchange");
        final Course two = new Course("Second", 10, "Petrov");
        final Course three = new Course("Third", 15, "Ivanov");
        final Course four = new Course(new Date(), "Forth");
        final Course five = new Course("Fifth", 25, "Pupkin");

        final Course[] core = { one, two, three };
        final Course[] medium = { two, three };
        final Course[] prof = { three, four, five };

        final Student student1 = new Student("Igor", "Novikov", 2);
        final Student student2 = new Student("Sidorov", core);

        final CollegeStudent collegeStudent1 = new CollegeStudent("Tolya", "Karavaev", 5);
        final CollegeStudent collegeStudent2 = new CollegeStudent("Gernenko", medium);
        final CollegeStudent collegeStudent3 = new CollegeStudent("Grisha", "Mashkin", 4, 35, prof, "NTU", 1, 1L);

        final SpecialStudent specialStudent1 = new SpecialStudent("Kolya", "Dub", 1);
        final SpecialStudent specialStudent2 = new SpecialStudent("Gorenko", prof);
        final SpecialStudent specialStudent3 = new SpecialStudent(123L);
    }
}
