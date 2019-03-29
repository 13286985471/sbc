package sbc.logging;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
    Logger logger=LoggerFactory.getLogger(getClass());
    @Test
    public void contextLoads() {
        logger.trace("trace");
        logger.debug("这里是debug日志");
        logger.info("info");
        logger.warn("warn");
        logger.error("error");
    }
}
