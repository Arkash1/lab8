package com.company;

import java.util.Scanner;

class Person {
    private String name;
    private String surname;
    private int birthYear;

    public Person(String name, String surname, int birthYear) {
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name +
                ", Фамилия: " + surname +
                ", Год рождения: " + birthYear);
    }

    public void readBookAboutCar(Book book, Car car) {
        System.out.println(name + " читает книгу " + book.getTitle() +
                " про машину " + car.getBrand());
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getBirthYear() { return birthYear; }
}

class Car {
    private String brand;
    private int year;
    private double engineVolume;

    public Car(String brand, int year, double engineVolume) {
        this.brand = brand;
        this.year = year;
        this.engineVolume = engineVolume;
    }

    public void displayInfo() {
        System.out.println("Марка: " + brand +
                ", Год выпуска: " + year +
                ", Объем двигателя: " + engineVolume + "л");
    }

    public String getBrand() { return brand; }
    public int getYear() { return year; }
    public double getEngineVolume() { return engineVolume; }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public void displayInfo() {
        System.out.println("Название: " + title +
                ", Автор: " + author +
                ", Год выпуска: " + year);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ввод данных человека
        System.out.println("Введите данные человека:");
        System.out.print("Имя: ");
        String name = scanner.nextLine();
        System.out.print("Фамилия: ");
        String surname = scanner.nextLine();
        System.out.print("Год рождения: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Ввод данных автомобиля
        System.out.println("\nВведите данные автомобиля:");
        System.out.print("Марка: ");
        String brand = scanner.nextLine();
        System.out.print("Год выпуска: ");
        int carYear = scanner.nextInt();
        System.out.print("Объем двигателя: ");
        double engineVolume = scanner.nextDouble();
        scanner.nextLine(); // Очистка буфера

        // Ввод данных книги
        System.out.println("\nВведите данные книги:");
        System.out.print("Название: ");
        String title = scanner.nextLine();
        System.out.print("Автор: ");
        String author = scanner.nextLine();
        System.out.print("Год выпуска: ");
        int bookYear = scanner.nextInt();
        scanner.nextLine(); // Очистка буфера

        // Создание объектов
        Person person = new Person(name, surname, birthYear);
        Car car = new Car(brand, carYear, engineVolume);
        Book book = new Book(title, author, bookYear);

        // Вывод информации
        System.out.println("\nРезультаты:");
        person.displayInfo();
        car.displayInfo();
        book.displayInfo();
        person.readBookAboutCar(book, car);

        scanner.close();
    }
}