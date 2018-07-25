package org.smart4j.framework.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 字符串工具类
 */
public final class StringUtil {
    private static final Logger LOGGER = LoggerFactory.getLogger(StringUtil.class);

    /**
     * 判断字符串是否为空
     */
    public static boolean isEmpty(String str) {
        if (str != null) {
            str = str.trim();
        }
        return StringUtils.isEmpty(str);
    }

    /**
     * 判断字符串是否非空
     */
    public static boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }

    /**
     * 拆分字符串
     */

    public static String[] splitString(String str, String delimiter){
        if(isNotEmpty(str) && isNotEmpty(delimiter)) {
            return str.split(delimiter);
        } else {
            LOGGER.error("str = " + str + ", delimiter = " + delimiter + "either cannot be null or empty");
            return null;
        }

    }
}