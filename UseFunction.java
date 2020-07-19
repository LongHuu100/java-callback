import java.util.function.Function;

public MyClass {
    public static String applyFunction(String name, Function<String,String> function){
        return function.apply(name);
    }
}

// User
MyClass.applyFunction("42", str -> "the answer is: " + str);
// returns "the answer is: 42"
