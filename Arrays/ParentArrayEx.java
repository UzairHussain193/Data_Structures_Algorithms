class animal {

}

class reptiles extends animal {

}

public class ParentArrayEx {
    public static void main(String[] args) {
        reptiles m1 = new reptiles();
        reptiles m2 = new reptiles();
        reptiles m3 = new reptiles();
        animal[] a = { m1, m2, m3 };

        System.out.println(a.getClass());

    }
}