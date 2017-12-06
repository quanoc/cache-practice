package com.quantumcs;

import com.quantumcs.ehcache.MyCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class TestMyCache {
    private static Logger logger = LoggerFactory.getLogger(TestMyCache.class);

    private static MyCache<Integer> cache = new MyCache();
    public static void main( String[] args ) throws Exception {

        String key = "msgCount" ;


        cache.put(key,8);


        for (int i = 0; i < 9; i++) {

            logger.info("isLast: {}", isLast(key));
        }

    }


    public static boolean isLast(String key) throws Exception {
        Integer count = cache.get(key);
        logger.info("msg-count: {}", count);
        if (count == null) {
            throw new Exception("long-msg not found") ;
        }
        if (count == 0){
            return true;
        }else {
            cache.put(key, --count);
            return false;
        }

    }
}
