package org.sapsystems.util;

import java.util.UUID;

/**
 * Created by ChadMarthinussen2 on 2019/08/14.
 */
//this generates a random ID
public class Miscellaneous {
    public static String IDGenerator(){
        return UUID.randomUUID().toString();
    }
}
