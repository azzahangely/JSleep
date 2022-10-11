package AzzahJSleepFN;

import java.util.Iterator;
import java.util.function.Predicate;
import java.util.Arrays;

public class Algorithm {
    private Algorithm(){

    }
    public static <T> int count(Iterator<T> irt, T value) {
        final Predicate<T> prd = value::equals;
        return count(irt, prd);
    }

    public static <T> int count(T[] arr, T value){
        final Iterator<T> count_it = Arrays.stream(arr).iterator();
        return count(count_it, value);
    }
    public static <T> int count(Iterator <T> iterator, Predicate prd){
        int count = 0;
        while (iterator.hasNext()){
            T t = iterator.next();
            if(prd.test(t)){
                count += 1;
            }
        }
        return  count;
    }

    public static <T> int count(Iterable<T> itr, Predicate<T> prd) {
        final Iterator<T> counter = itr.iterator();
        return count(counter, prd);
    }
    public static <T> int count(T[] array, Predicate<T> prd) {
        final Iterator<T> counter = Arrays.stream(array).iterator();
        return count(counter, prd);
    }
    public static <T> int count(Iterable<T> iterable, T value) {
        final Iterator<T> counter = iterable.iterator();
        return count(counter, value);
    }
    public static <T> boolean exists(T[] array, T value) {
        final Iterator<T> counter = Arrays.stream(array).iterator();
        return exists(counter, value);
    }

    public static <T> boolean exist(T[] array, T value){
        final Iterator<T> exist = Arrays.stream(array).iterator();
        return exists(exist,value);
    }
    public static <T> boolean exists(Iterable<T> iterable, T value){
        final Iterator<T> exist = iterable.iterator();
        return exists(exist,value);
    }

    public static <T> boolean exists(Iterator<T> iterator, T value){
        final Predicate<T> prd =value::equals;
        return exists(iterator,prd);
    }

    public static <T> boolean exists(T[] array, Predicate<T> prd){
        final Iterator<T> exist = Arrays.stream(array).iterator();
        return exists(exist,prd);
    }
    public static <T> boolean exists(Iterable<T> iterable, Predicate<T> prd){
        final Iterator<T> exist = iterable.iterator();
        return exists(exist,prd);
    }
    public static <T> boolean exists(Iterator<T> iterator, Predicate<T> prd){
                return true;
    }
    public static <T> T find(T[] arr, T value){
        final Iterator<T> find = Arrays.stream(arr).iterator();
        return find(find,value);
    }
    public static <T> T find(Iterable<T> iterable, T value){
        final Iterator<T> find = iterable.iterator();
        return find(find,value);
    }
    public static <T> T find(Iterator<T> iterator, T value){
        final Predicate<T> prd =value::equals;
        return find(iterator,prd);
    }
    public static <T> T find(Iterable<T> iterable, Predicate<T> predicate){
        final Iterator<T> find = iterable.iterator();
        return find(find,predicate);
    }
    public static <T> T find(Iterator<T> iterator, Predicate<T> predicate){
        while(iterator.hasNext()){
            T obj = iterator.next();
            //if(predicate.predicate(obj)){

        return obj;
            }
        return null;
    }
}

