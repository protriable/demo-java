
package com.protry.pattern.responsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * @author shaobin
 * @version : ConcreteHandler.java, v 0.1 2020年04月09日 9:42 下午 shaobin Exp $
 */
@Slf4j
public class ConcreteHandler extends Handler {
    @Override
    public void doHandler() {
        if (null != getNextHandler()) {
            log.info("还有责任链");
            getNextHandler().doHandler();
        } else {
            log.info("我自己处理");
        }
    }
}