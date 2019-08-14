import java.util.*;
import java.util.Map.Entry;
import java.util.stream.Collectors;

class Riddle {

    static final Map<Character, Integer> map = new HashMap<>();

    static {
        map.put('u', 9010);
        map.put('m', 15);
        map.put('p', 12624);
        map.put('o', 4001);
        map.put('a', 478);
        map.put('b', 3720);
        map.put('z', 335);
        map.put('h', 3999);
        map.put('v', 26);
        map.put('l', 46355);
        map.put('e', 5000);
        map.put('k', 991);
        map.put('w', 86);
        map.put('n', 2099);
        map.put('i', 99999);
        map.put('c', 10002);
        map.put('g', 87960);
        map.put('j', 67452);
        map.put('r', 6035);
        map.put('y', 700);
        map.put('q', 4075);
        map.put('d', 125);
        map.put('f', 47);
        map.put('x', 11405);
        map.put('s', 1074);
        map.put('t', 74877);
    }

    public static void main(String[] args) {
        System.out.println(solveLevelOne(map));
        System.out.println(solveLevelTwo(map));
        System.out.println(solveLevelThree(map));
        System.out.println(solveLevelFour(map));
    }

    static final List<Integer> LEVEL_ONE_OUTPUT = Arrays.asList(15, 26, 47, 86, 125, 335, 478, 700, 991, 1074, 2099, 3720, 3999, 4001, 4075, 5000, 6035, 9010, 10002, 11405, 12624, 46355, 67452, 74877, 87960, 99999);

    static List<Integer> solveLevelOne(Map<Character, Integer> map) {
        return new ArrayList<>(map.entrySet()).stream()
                .sorted(Comparator.comparing(Entry::getValue))
                .map(Entry::getValue)
                .collect(Collectors.toList());
    }

    static final String LEVEL_TWO_OUTPUT = "mvfwdzayksnbhoqerucxpljtgi";

    static String solveLevelTwo(Map<Character, Integer> map) {
        return new ArrayList<>(map.entrySet()).stream()
                .sorted(Comparator.comparing(Entry::getValue))
                .map(Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    static final String LEVEL_THREE_OUTPUT = "igtjlpxcureqohbnskyazdwfvm";

    static String solveLevelThree(Map<Character, Integer> map) {
        return new ArrayList<>(map.entrySet()).stream()
                .sorted(Comparator.comparing(Entry<Character, Integer>::getValue).reversed())
                .map(Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining());
    }

    static final String LEVEL_FOUR_OUTPUT = "i*g*t*j*l*p*x*c*u*r*e*q*o*h*b*n*s*k*y*a*z*d*w*f*v*m";

    static String solveLevelFour(Map<Character, Integer> map) {
        return new ArrayList<>(map.entrySet()).stream()
                .sorted(Comparator.comparing(Entry<Character, Integer>::getValue).reversed())
                .map(Entry::getKey)
                .map(String::valueOf)
                .collect(Collectors.joining("*"));
    }
}