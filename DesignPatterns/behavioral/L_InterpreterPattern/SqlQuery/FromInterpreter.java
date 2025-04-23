package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.util.List;
import java.util.Map;

public class FromInterpreter implements QueryInterpreter{
    String table;
    WhereInterpreter whereInterpreter;

    public FromInterpreter(String table, WhereInterpreter whereInterpreter) {
        this.table = table;
        this.whereInterpreter = whereInterpreter;
    }

    @Override
    public List<Map<String, String>> interpret(Context context) {
        context.setTableName(table);
        if (whereInterpreter == null){
            context.setWhereClause((s) -> true);
            return context.search();
        }
        return whereInterpreter.interpret(context);
    }
}
