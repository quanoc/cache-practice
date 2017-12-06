package com.quantumcs.ehcache;


import net.sf.ehcache.Cache;
import net.sf.ehcache.Element;

/**
 * @author zhouhy
 * @create 2017 -12-07 上午1:09
 */

public class MyCache<V> implements ICache<V>{
    private Cache cache = EhCacheFactory.getCache();



    @Override
    public V get(String key) {
        Element e = cache.get(key);
        if (e != null){
            return (V) e.getObjectValue();
        }else {
            return null ;
        }
    }

    @Override
    public void put(String key, V value) {
        cache.put(new Element(key, value));
    }



}
