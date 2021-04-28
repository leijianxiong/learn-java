package t20190909;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/*
测试第三方日志服务
 */
public class testSlf4jLogback {
    public static final Logger logStatic = LoggerFactory.getLogger(testSlf4jLogback.class);
//    public final Log logNonStatic = LogFactory.getLog(testCommonLogging.class);

    public static void main(String[] args) {
        logStatic.info("test");
//        logNonStatic.warn("end");
        new testSlf4jLogback().testLog();
        logStatic.error("test error 1 for slf4j");
        logStatic.error("test error 2 for slf4j");
    }

    public void testLog() {
        logStatic.info("test log method");
    }

}
