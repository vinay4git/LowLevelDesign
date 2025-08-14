package LowLevelDesigns.simpledb;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class SimpleDBImpl implements SimpleDB{

    Map<String, Integer> db  = new HashMap<>();

    LinkedList<Map<String, Integer>> transactions = new LinkedList<>();


    @Override
    public void Set(String key, Integer value) {
        if(!transactions.isEmpty()) {
            transactions.getLast().put(key, value);
        } else {
            db.put(key, value);
        }
    }

    @Override
    public Integer Get(String key) {
        Iterator<Map<String, Integer>> mapIterator = transactions.descendingIterator();

        while (mapIterator.hasNext()) {
            Map<String, Integer> currentTransaction = mapIterator.next();

            if (currentTransaction.containsKey(key)) {
                return currentTransaction.get(key);
            }
        }

        return db.get(key);
    }

    @Override
    public void Unset(String key) {
        if(!transactions.isEmpty()) {
            transactions.getLast().put(key, null);
        } else {
            db.remove(key);
        }
    }

    @Override
    public void Begin() {
        transactions.addLast(new HashMap<>());
    }

    @Override
    public void Commit() throws Exception {
        if (transactions.isEmpty()) {
            throw  new RuntimeException("NO TRANSACTION");
        }

        Iterator<Map<String, Integer>> iterator = transactions.stream().iterator();

        while (iterator.hasNext()) {
            iterator.next().entrySet().stream().forEach(entry ->  {
                if(entry.getValue() == null) {
                    db.remove(entry.getKey());
                } else {
                    db.put(entry.getKey(), entry.getValue());
                }
            });
        }

        transactions.removeAll(transactions);
    }

    @Override
    public void Rollback() throws Exception {
        if (transactions.isEmpty()) {
            throw  new RuntimeException("NO TRANSACTION");
        }
        transactions.removeLast();
    }
}
