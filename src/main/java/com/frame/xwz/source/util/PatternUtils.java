package com.frame.xwz.source.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.frame.xwz.source.exception.ComponentConstance.BRACKETS_IN_PATTERN;
import static com.frame.xwz.source.exception.ComponentConstance.SQL_PATTERN;


/**
 * @author xuweizhi
 * @date 2019/04/16 15:28
 */
public class PatternUtils {

    public static Pattern getSqlPatter(String regex) {
        return Pattern.compile(regex);
    }

    /**
     * 获取 #{} 内部中的内容，包括括号
     */
    public static Matcher getSqlMatcher(String sql) {
        return getSqlPatter(SQL_PATTERN).matcher(sql);
    }

    /**
     * 获取 ()内部中的内容，不包括括号
     */
    public static Matcher getBarcketMatcher(String sql) {
        return getSqlPatter(BRACKETS_IN_PATTERN).matcher(sql);
    }

    public static String replaceSql(String sql) {
        return sql.replaceAll(SQL_PATTERN, "?");
    }
}
