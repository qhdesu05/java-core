package chapter9.Inner_Class_va_Nested_Class;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    static class UserID {
        private String ID;
        private String address;

        public UserID(String ID, String address) {
            this.ID = ID;
            this.address = address;
        }

//        public void printInfo() {
//            System.out.println("Outside name = " + name);
//        }

        public String getID() {
            return ID;
        }

        public void setID(String ID) {
            this.ID = ID;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }
    }


}
