public class Task5 {

    public static void main(String[] args) {
        System.out.println("""
                           byte short char int long float double boolean
                byte        т     ня    я   ня  ня   ня    ня      x
                short       я     т     я   ня  ня   ня    ня      x
                char        я     я     т   ня  ня   ня    ня      x
                int         я     я     я    т  ня   ня    ня      x
                long        я     я     я    я   т   ня    ня      x
                float       я     я     я    я   я    т    ня      x
                double      я     я     я    я   я    я    т       x
                boolean     x     x     x    x   x    x    x       T
                 \s""");
    }

}