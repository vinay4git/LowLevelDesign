package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.util.List;
import java.util.Map;

public class SelectInterpret implements QueryInterpreter{

    String columns;
    FromInterpreter fromInterpreter;

    public SelectInterpret(String columns, FromInterpreter fromInterpreter) {
        this.columns = columns;
        this.fromInterpreter = fromInterpreter;
    }

    @Override
    public List<Map<String, String>> interpret(Context context) {
        context.setColumns(columns);
        return fromInterpreter.interpret(context);
    }

}
