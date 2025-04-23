package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SelectQueryIntrepreterMain {
    public static void main(String[] args) {
        Context ctx = new Context();
        QueryInterpreter selectInterpret = new SelectInterpret("name", new FromInterpreter("people", null));
        List<Map<String, String>> interpret = selectInterpret.interpret(ctx);
        System.out.println(interpret);
        //Arrays.stream(Row.class.getDeclaredFields()).filter(field -> field.getName().equalsIgnoreCase())

        //List<Map<String, Object>> collect = interpret.stream().map(row -> parameters(row)).collect(Collectors.toList());

        //System.out.println(collect);

        QueryInterpreter selectInterpret2 = new SelectInterpret("*", new FromInterpreter("people", null));
        List<Map<String, String>> interpret2 = selectInterpret2.interpret(ctx);
        System.out.println(interpret2);


        Predicate<Row> predicate = (row) -> row.getName().startsWith("Leo");
        QueryInterpreter selectInterpret3 = new SelectInterpret("*", new FromInterpreter("people", new WhereInterpreter(predicate)));
        List<Map<String, String>> interpret3 = selectInterpret3.interpret(ctx);
        System.out.println(interpret3);
    }


}
