package chapter11.Lab09;

import java.util.*;

public class main {
    public static void yeuCau1() {
//        ArrayList<Member> members = new ArrayList<>();
//        Member mb1 = new Member(1, "qh1", 36);
//        Member mb2 = new Member(2, "qh2", 20);
//        Member mb3 = new Member(3, "qh3", 25);
//        Member mb4 = new Member(4, "qh4", 50);
//        Member mb5 = new Member(5, "qh5", 18);
//
//        members.add(mb1);
//        members.add(mb2);
//        members.add(mb3);
//        members.add(mb4);
//        members.add(mb5);

        List<Member> members = Arrays.asList(
                new Member(1, "qh1", 36),
                new Member(2, "qh2", 20),
                new Member(3, "qh3", 25),
                new Member(4, "qh4", 50),
                new Member(5, "qh5", 18)
        );

        for (Member member : members) {
            System.out.println(member);
        }
    }

    public static void yeuCau2() {
        HashSet<Integer> members = new HashSet<>();
        Member mb1 = new Member(10, "qh1", 36);
        Member mb2 = new Member(2, "qh2", 20);
        Member mb3 = new Member(33, "qh3", 25);
        Member mb4 = new Member(40, "qh4", 50);
        Member mb5 = new Member(5, "qh5", 18);
        Member mb6 = new Member(10, "qh5", 18);

        members.add(mb1.getId());
        members.add(mb2.getId());
        members.add(mb3.getId());
        members.add(mb4.getId());
        members.add(mb5.getId());
        members.add(mb6.getId());

        System.out.println(members);
    }

    public static void yeuCau3() {
        TreeSet<Member> rankedMembers = new TreeSet<>();
        Member mb1 = new Member(10, "qh1", 36);
        Member mb2 = new Member(2, "qh2", 20);
        Member mb3 = new Member(33, "qh3", 25);
        Member mb4 = new Member(40, "qh4", 50);
        Member mb5 = new Member(5, "qh5", 18);
        Member mb6 = new Member(10, "bla bla", 36);

        rankedMembers.add(mb1);
        rankedMembers.add(mb2);
        rankedMembers.add(mb3);
        rankedMembers.add(mb4);
        rankedMembers.add(mb5);
        rankedMembers.add(mb6);

        for (Member rankedMember : rankedMembers) {
            System.out.println(rankedMember);
        }
    }

    public static void yeuCau4() {
        HashMap<Integer, Integer> pointMap = new HashMap<>();

        pointMap.put(2, 11);
        pointMap.put(3, 50);
        pointMap.put(1, 5);
        pointMap.put(16, 25);

        if (pointMap.containsKey(1)) {
            int currentPoint = pointMap.get(1);
            pointMap.put(1, currentPoint + 10);
        }
        System.out.println("Danh sach diem thuong: ");
        for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + " , Point: " + entry.getValue());

        }
    }

    public static void yeuCau5() {
        ArrayList<Member> members = new ArrayList<>();
        members.add(new Member(3, "QH", 21));
        members.add(new Member(10, "TH", 36));
        members.add(new Member(2, "Bla Bla", 18));
        members.add(new Member(4, "java", 35));

        TreeMap<Integer, String> idNameMap = new TreeMap<>();

        for (Member m : members) {
            idNameMap.put(m.getId(), m.getName());
        }
        System.out.println("TreeMap ID -> Name: ");
        for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
            System.out.println("ID: " + entry.getKey() + ", Name: " + entry.getValue());
        }
    }

    static void main(String[] args) {
//        yeuCau1();
//        yeuCau2();
//        yeuCau3();
//        yeuCau4();
        yeuCau5();
    }
}
