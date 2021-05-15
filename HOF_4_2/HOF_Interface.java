package HOF_4_2;

// 4.2 High order funcs (func-of-func)
public interface HOF_Interface {
    int apply(int x);

    public static int do_twice(HOF_Interface f, int x) {
        return f.apply(f.apply(x));
    }
}
