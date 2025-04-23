package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.util.List;
import java.util.Map;

public interface QueryInterpreter {
    List<Map<String, String>> interpret(Context context);
}
