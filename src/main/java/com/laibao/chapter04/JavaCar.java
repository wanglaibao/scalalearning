package com.laibao.chapter04;

/**
 * @author laibao wang
 * @date 2017-11-13
 * @version
 */
public class JavaCar {

    private final int year;

    private final String brand;

    private final String manufacturer;

    private int miles;

    public JavaCar(int yearOfMake,String brand,String manufacturer) {
        this.year = yearOfMake;
        this.brand = brand;
        this.manufacturer = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public String getBrand() {
        return brand;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getMiles() {
        return miles;
    }

    public void drive(int distance) {
        miles += Math.abs(distance);
    }
}
