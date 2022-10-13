package AzzahJSleepFN;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.Arrays;

public class Algorithm {
    private Algorithm() {
    }
    // ------------------------ Case Study ----------------------
    //COUNT 1
    public static <T> int count(Iterator<T> iterator, T value)  throws exception
    {
        final Predicate<T> prd = value::equals;
        return count(iterator, (T) prd);
    }

    //COUNT 2
    public static <T> int count(T[] T_arr, T value) throws exception
    {
        final Iterator<T> i = Arrays.stream(T_arr).iterator();
        return count(i, value);
    }

    //COUNT 3
    public static <T> int count(Iterator<T> iterator, Predicate prd) throws exception
    {
        int i = 0;
        while (iterator.hasNext()) {
            if (prd.test(iterator.next())) {
                i++;
            }
        }
        return i;
    }

    //COUNT 4
    public static <T> int count(Iterable<T> iterable, Predicate prd) throws exception
    {
        final Iterator<T> i = iterable.iterator();
        return count(iterable.iterator(), prd);
    }

    //COUNT 5
    public static <T> int count(T[] T_arr, Predicate prd) throws exception
    {
        final Iterator<T> i = Arrays.stream(T_arr).iterator();
        return count(i, prd);
    }

    //COUNT 6
    public static <T> int count(Iterable<T> iterable, T value) throws exception
    {
        final Predicate<T> prd = value::equals;
        return count(iterable, (T) prd);
    }

    // batas, jujur kenapa banyak banget si bang pusing banget huhuhuhu//

    //Exist 1
    public static <T> boolean exist(Iterable<T> iterable, T value)  throws exception {
        final Iterator<T> exist = iterable.iterator();
        return exist((Iterable<T>) exist, value);
    }

    //Exist 2
    public static <T> boolean exist(Iterable<T> iterable, Predicate prd) throws exception {
        final Iterator<T> exist = iterable.iterator();
        return exist((Iterable<T>) exist, prd);
    }

    //Exist 3
    public static <T> boolean exist(T[] T_arr, Predicate<T> prd) throws exception
    {
        final Iterator<T> exist = Arrays.stream(T_arr).iterator();
        return exist((Iterable<T>) exist, prd);
    }

    //Exist 4
    public static <T> boolean exist(T[] T_arr, T value) throws exception
    {
        final Iterator<T> exist = Arrays.stream(T_arr).iterator();
        return exist((Iterable<T>) exist, value);
    }

    //Exist 5
    public static <T> boolean exist(Iterator<T> iterator, T value)  throws exception
    {
        final Predicate<T> prd = value::equals;
        return exist((Iterator<T>) iterator, (T) prd);
    }

    //Exist 6
    public static <T> boolean exist(Iterator<T> iterator, Predicate<T> prd)  throws exception
    {
        while (iterator.hasNext()) {
            if (prd.test(iterator.next())) {
                return true;
            }
        }
        return false;
    }

    // batas, jujur kenapa banyak banget si bang pusing banget huhuhuhu//

    //Find 1 : t array sama predicate <T>
    public static <T> T find(T[] T_arr, Predicate<T> prd)  throws exception
    {
        final Iterator<T> find = Arrays.stream(T_arr).iterator();
        return find((Iterator<T>) find, prd);
    }

    //Find 2 iterable sama predicate
    public static <T> T find(Iterable<T> iterable, Predicate<T> prd)  throws exception
    {
        final Iterator<T> find = iterable.iterator();
        return find((Iterable<T>) find, prd);
    }

    //Find 3 : t array sama value
    public static <T> T find(T[] T_arr, T value)  throws exception
    {
        final Iterator<T> find = Arrays.stream(T_arr).iterator();
        return find((Iterator<T>) find, value);
    }

    //Find 4 : iterable sama value
    public static <T> T find(Iterable<T> iterable, T value)  throws exception
    {
        final Iterator<T> find = iterable.iterator();
        return find((Iterable<T>) find, value);
    }

    //Find 5 : iterator sama t value
    public static <T> T find(Iterator<T> iterator, T value)  throws exception
    {
        final Predicate<T> prd = value::equals;
        return find((Iterator<T>) iterator, (T) prd);
    }

    //Find 6 : iterator sama predicate
    public static <T> T find(Iterator<T> iterator, Predicate<T> prd)  throws exception
    {
        while (iterator.hasNext()) {
            final T t_var = iterator.next();
            if (prd.test(t_var)) {
                return t_var;
            }
        }
        return null;
    }

    // ------------------------ Post Test  ----------------------
    // nambah collect (6) dan paginate (3) isi nya ngikutin cs aja bismillah ya bang

    //Collect 1 : iterable sama T value
    public static <T> List collect(Iterable<T> iterable, T value) throws exception
    {
        final Predicate<T> prd = value::equals;
        return collect((Iterable<T>) iterable, (T) prd);
    }

    //Collect 2 : iterable sama predicate
    public static <T> List collect(Iterable<T> iterable, Predicate<T> prd) throws exception
    {
        final Iterator<T> collect = iterable.iterator();
        return collect((Iterable<T>) collect, prd);
    }

    //Collect 3 : T array sama T value
    public static <T> List collect(T[] T_arr, T value)  throws exception
    {
        final Predicate<T> prd = value::equals;
        return collect((T[]) T_arr, (T) prd);
    }

    //Collect 4 : Iterator sama T value
    public static <T> List collect(Iterator<T> iterator, T value)  throws exception
    {
        final Predicate<T> prd = value::equals;
        return collect((Iterator<T>) iterator, (T) prd);
    }

    //Collect 5 : T array sama predicate
    public static <T> List collect(T[] T_arr, Predicate<T> prd) throws exception
    {
        final Iterator<T> collect = Arrays.stream(T_arr).iterator();
        return collect((Iterator<T>) collect, prd);
    }

    //Collect 6 : Iterator sama predicate
    public static <T> List collect(Iterator<T> iterator, Predicate<T> prd) throws exception
    {
        final List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            final T t_var = iterator.next();
            if (prd.test(t_var)) {
                list.add(t_var);
            }
        }
        return list;
    }

    // batas, jujur kenapa banyak banget si bang pusing banget huhuhuhu//

    //Paginate 1 : T array, int, int, predicate
    public static <T> List paginate(T[] T_arr, int page, int pageSize, Predicate<T> prd) throws exception
    {
        final Iterator<T> paginate = Arrays.stream(T_arr).iterator();
        return paginate((Iterator<T>) paginate, page, pageSize, prd);
    }

    //Paginate 2 : Iterator, int, int, predicate
    public static <T> List paginate(Iterator<T> iterator, int page, int pageSize, Predicate<T> prd)  throws exception
    {
        final List<T> list = new ArrayList<>();
        while (iterator.hasNext()) {
            final T t_var = iterator.next();
            if (prd.test(t_var)) {
                list.add(t_var);
            }
        }
        return list;
    }

    //Paginate 3 : Iterable, int, int, predicate
    public static <T> List paginate(Iterable<T> iterable, int page, int pageSize, Predicate<T> prd)  throws exception
    {
        final Iterator<T> paginate = iterable.iterator();
        return paginate((Iterable<T>) paginate, page, pageSize, prd);
    }

    //biar gak recursing infinitely kata stackoverflow gini
    private static class exception extends Throwable
    {
        public exception(String not_implemented) {
        }
    }
}

