package com.quantumcs.ehcache;

/**
 * @author
 * @create 2017 -12-07 上午1:11
 */
public interface ICache<T> {
    public T get(String key);

    public void put(String key, T t) ;
}
