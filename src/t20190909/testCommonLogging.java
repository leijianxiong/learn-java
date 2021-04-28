package t20190909;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/*
测试第三方日志服务
 */
public class testCommonLogging {
    public static final Log logStatic = LogFactory.getLog(testCommonLogging.class);
//    public final Log logNonStatic = LogFactory.getLog(testCommonLogging.class);

    public static void main(String[] args) {
        logStatic.info("test");
//        logNonStatic.warn("end");
        new testCommonLogging().testLog();
        logStatic.error("test error 1");
        logStatic.error("test error 2");
    }

    public void testLog() {
        logStatic.info("test log method");
    }

}
