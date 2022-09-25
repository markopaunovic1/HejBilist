public class Vehicle {

    private String name;
    private int age;

    public int legalAge;

    public Vehicle(String name, int age, int legalAge) {
        this.name = name;
        this.age = age;
        this.legalAge = legalAge;
    }

    public void drive() {
        System.out.println("Car didn’t drive - there’s");
    }

    public void setDriver(Driver d1) {

        if (d1 <= legalAge) {
            System.out.println("Driver not changed!");
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void legalAge() {

    }
}