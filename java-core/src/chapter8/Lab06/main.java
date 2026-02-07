package chapter8.Lab06;

public class main {
    static void main(String[] args) {
        Engineer kySu = new Engineer("Programmer", "QH", 36);
        Manager boss = new Manager(10, "King", 38);

        Person[] listMember = {kySu, boss};
        for (Person person : listMember) {
            person.introduce(); //run time
            person.work();

            if (person instanceof Trainable) {
//                ((Trainable) person).attendTraining("learn java");
                Trainable test = (Trainable) person; //down casting
                test.attendTraining("learn java");
                test.feedback();
            }
            System.out.println();
        }
    }
}
