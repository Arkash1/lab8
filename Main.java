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
        System.out.println("���: " + name +
                ", �������: " + surname +
                ", ��� ��������: " + birthYear);
    }

    public void readBookAboutCar(Book book, Car car) {
        System.out.println(name + " ������ ����� " + book.getTitle() +
                " ��� ������ " + car.getBrand());
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
        System.out.println("�����: " + brand +
                ", ��� �������: " + year +
                ", ����� ���������: " + engineVolume + "�");
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
        System.out.println("��������: " + title +
                ", �����: " + author +
                ", ��� �������: " + year);
    }

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public int getYear() { return year; }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ���� ������ ��������
        System.out.println("������� ������ ��������:");
        System.out.print("���: ");
        String name = scanner.nextLine();
        System.out.print("�������: ");
        String surname = scanner.nextLine();
        System.out.print("��� ��������: ");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); // ������� ������

        // ���� ������ ����������
        System.out.println("\n������� ������ ����������:");
        System.out.print("�����: ");
        String brand = scanner.nextLine();
        System.out.print("��� �������: ");
        int carYear = scanner.nextInt();
        System.out.print("����� ���������: ");
        double engineVolume = scanner.nextDouble();
        scanner.nextLine(); // ������� ������

        // ���� ������ �����
        System.out.println("\n������� ������ �����:");
        System.out.print("��������: ");
        String title = scanner.nextLine();
        System.out.print("�����: ");
        String author = scanner.nextLine();
        System.out.print("��� �������: ");
        int bookYear = scanner.nextInt();
        scanner.nextLine(); // ������� ������

        // �������� ��������
        Person person = new Person(name, surname, birthYear);
        Car car = new Car(brand, carYear, engineVolume);
        Book book = new Book(title, author, bookYear);

        // ����� ����������
        System.out.println("\n����������:");
        person.displayInfo();
        car.displayInfo();
        book.displayInfo();
        person.readBookAboutCar(book, car);

        scanner.close();
    }
}