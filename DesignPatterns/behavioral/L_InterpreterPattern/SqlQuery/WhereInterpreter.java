package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class WhereInterpreter implements QueryInterpreter{

    Predicate<Row> whereClauses;

    public WhereInterpreter(Predicate<Row> whereClauses) {
        this.whereClauses = whereClauses;
    }

    @Override
    public List<Map<String, String>> interpret(Context context) {
        context.setWhereClause(whereClauses);
        return context.search();
    }
}
