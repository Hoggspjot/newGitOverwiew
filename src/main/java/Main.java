public class Main {
    public static void main(String[] args) {

        Foo foo = new Foo(1);
        Foo foo2 = new Foo(2);
        System.out.println(foo.getId());
        System.out.println(foo2.getId());
    }
}


class Foo {
    {
        System.out.println("Нестатический блок инициализации");
    }

    private int id;

    public Foo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
}


