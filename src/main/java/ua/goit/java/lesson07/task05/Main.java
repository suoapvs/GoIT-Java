package ua.goit.java.lesson07.task05;

import java.util.*;

/**
 * @author Yurii Salimov (yuriy.alex.salimov@gmail.com)
 */
public class Main {

    public static void main(String[] args) {
        final List<Integer> listInt1 = new ArrayList<>();
        final List<Integer> listInt2 = new LinkedList<>();
        System.out.println("Integer 1000: ");
        System.out.println("Добавление - ArrayList: " + getTimeAddInt(listInt1, 1000));
        System.out.println("Добавление - LinkedList: " + getTimeAddInt(listInt2, 1000));
        System.out.println("Set - ArrayList: " + getTimeSetInt(listInt1, 1000));
        System.out.println("Set - LinkedList: " + getTimeSetInt(listInt2, 1000));
        System.out.println("Get - ArrayList: " + getTimeGet(listInt1));
        System.out.println("Get - LinkedList: " + getTimeGet(listInt2));
        System.out.println("Remove - ArrayList: " + getTimeRemoveInt(listInt1));
        System.out.println("Remove - LinkedList: " + getTimeRemoveInt(listInt2));

        final List<String> listString1 = new ArrayList<>();
        final List<String> listString2 = new LinkedList<>();
        System.out.println("Strings: 1000");
        System.out.println("Добавление - ArrayList: " + getTimeAddStr(listString1, 1000));
        System.out.println("Добавление - LinkedList: " + getTimeAddStr(listString2, 1000));
        System.out.println("Set - ArrayList: " + getTimeSetStr(listString1, 1000));
        System.out.println("Set - LinkedList: " + getTimeSetStr(listString2, 1000));
        System.out.println("Get - ArrayList: " + getTimeGet(listString1));
        System.out.println("Get - LinkedList: " + getTimeGet(listString2));
        System.out.println("Remove - ArrayList: " + getTimeRemoveStr(listString1));
        System.out.println("Remove - LinkedList: " + getTimeRemoveStr(listString2));

        final List<Integer> listInt3 = new ArrayList<>();
        final List<Integer> listInt4 = new LinkedList<>();

        System.out.println("Integer 10000: ");
        System.out.println("Добавление - ArrayList: " + getTimeAddInt(listInt3, 10000));
        System.out.println("Добавление - LinkedList: " + getTimeAddInt(listInt4, 10000));
        System.out.println("Set - ArrayList: " + getTimeSetInt(listInt3, 10000));
        System.out.println("Set - LinkedList: " + getTimeSetInt(listInt4, 10000));
        System.out.println("Get - ArrayList: " + getTimeGet(listInt3));
        System.out.println("Get - LinkedList: " + getTimeGet(listInt4));
        System.out.println("Remove - ArrayList: " + getTimeRemoveInt(listInt3));
        System.out.println("Remove - LinkedList: " + getTimeRemoveInt(listInt4));

        final List<String> listString3 = new ArrayList<>();
        final List<String> listString4 = new LinkedList<>();
        System.out.println("Strings: 10000");
        System.out.println("Добавление - ArrayList: " + getTimeAddStr(listString3, 10000));
        System.out.println("Добавление - LinkedList: " + getTimeAddStr(listString4, 10000));
        System.out.println("Set - ArrayList: " + getTimeSetStr(listString3, 10000));
        System.out.println("Set - LinkedList: " + getTimeSetStr(listString4, 10000));
        System.out.println("Get - ArrayList: " + getTimeGet(listString3));
        System.out.println("Get - LinkedList: " + getTimeGet(listString4));
        System.out.println("Remove - ArrayList: " + getTimeRemoveStr(listString3));
        System.out.println("Remove - LinkedList: " + getTimeRemoveStr(listString4));

    }

    public static void addInt(final List<Integer> list, final int n) {
        for (int i = 0; i < n; i++) {
            list.add(i);
        }

    }

    public static void setInt(final List<Integer> list, final int n) {
        for (int i = 0; i < n; i++) {
            list.set(i, (i + i));
        }
    }

    public static void addStr(final List<String> list, final int n) {
        for (int i = 0; i < n; i++) {
            list.add(i + "");
        }

    }

    public static void setStr(final List<String> list, final int n) {
        for (int i = 0; i < n; i++) {
            list.set(i, i + "");
        }
    }

    public static void get(List list) {
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }

    }

    public static void removeStr(final List<String> list) {
        final Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }

    public static void removeInt(final List<Integer> list) {
        final Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            iterator.remove();
        }
    }

    public static long getTimeAddInt(final List<Integer> list, final int n) {
        final long start = System.nanoTime();
        addInt(list, n);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static long getTimeSetInt(final List<Integer> list, final int n) {
        final long start = System.nanoTime();
        setInt(list, n);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static long getTimeAddStr(final List<String> list, final int n) {
        final long start = System.nanoTime();
        addStr(list, n);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static long getTimeSetStr(final List<String> list, final int n) {
        final long start = System.nanoTime();
        setStr(list, n);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static<T> long getTimeGet(final List<T> list) {
        final long start = System.nanoTime();
        get(list);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static long getTimeRemoveStr(final List<String> list) {
        final long start = System.nanoTime();
        removeStr(list);
        final long end = System.nanoTime();
        return (end - start);
    }

    public static long getTimeRemoveInt(final List<Integer> list) {
        final long start = System.nanoTime();
        removeInt(list);
        final long end = System.nanoTime();
        return (end - start);
    }
}
