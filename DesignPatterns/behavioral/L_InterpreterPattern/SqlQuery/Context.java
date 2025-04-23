package DesignPatterns.behavioral.L_InterpreterPattern.SqlQuery;

import java.lang.reflect.Field;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Context {
    static Map<String, List<Row>> tableContent = new HashMap();

    static {
        List<Row> list = Arrays.asList(
                new Row("Leonard", "Paris"),
                new Row("Davinci", "Venice")
        );

        tableContent.put("people",list);
    }
    String tableName;
    String columns;
    Predicate<Row> whereClause;

    public List<Map<String, String>> search() {
        return tableContent.entrySet()
                .stream().filter(stringListEntry -> stringListEntry.getKey().equalsIgnoreCase(tableName))
                .map(Map.Entry::getValue)
                .flatMap(Collection::stream)
                .filter(whereClause)
                .map(Context::parameters)
                .map(stringStringMap -> {
                    if (columns.equalsIgnoreCase("*")){
                        return stringStringMap;
                    } else {
                        HashMap<String, String> objectObjectHashMap = new HashMap<>();
                        Arrays.stream(columns.split(","))
                                .forEach(columnName -> {
                                     objectObjectHashMap.put(columnName, stringStringMap.get(columnName));
                                });
                        return objectObjectHashMap;
                    }
                })
                .collect(Collectors.toList());
    }

    public static Map<String, String> parameters(Object obj) {
        Map<String, String> map = new HashMap<>();
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            try { map.put(field.getName(), (String) field.get(obj)); } catch (Exception e) { }
        }
        return map;
    }
    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public String getColumns() {
        return columns;
    }

    public void setColumns(String columns) {
        this.columns = columns;
    }

    public void setWhereClause(Predicate<Row> whereClause) {
        this.whereClause = whereClause;
    }
}
class Row {
    String name;
    String city;

    public Row(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Row{" +
                "name='" + name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}