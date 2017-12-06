package com.quantumcs.ehcache;

import net.sf.ehcache.Cache;
import net.sf.ehcache.CacheManager;

/**
 * @author zhouhy
 * @create 2017 -12-07 上午12:56
 */

public class EhCacheFactory {
    private static final CacheManager manager = CacheManager.create();

    private static final Cache cache = manager.getCache("demoCache");


    public static Cache getCache(){
        return cache ;
    }
}
