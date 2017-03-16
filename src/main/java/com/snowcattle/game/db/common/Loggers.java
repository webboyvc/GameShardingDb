package com.snowcattle.game.db.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by jwp on 2017/2/28.
 */
public class Loggers {
    /** 数据库相关的日志 */
    public static final Logger dbLogger = LoggerFactory.getLogger("db");
    /** 数据实体代理的日志 */
    public static final Logger dbProxyLogger = LoggerFactory.getLogger("dbProxy");
}
