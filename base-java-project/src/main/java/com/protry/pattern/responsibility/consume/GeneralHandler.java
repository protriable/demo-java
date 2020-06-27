
package com.protry.pattern.responsibility.consume;

/**
 * @author shaobin
 * @version : GeneralHandler.java, v 0.1 2020年04月11日 4:53 下午 shaobin Exp $
 */
public class GeneralHandler extends ConsumeHandler {
    @Override
    public void doHandler(String user, double free) {
        if (free >= 1000) {
            if (user.equals("lwxzy")) {
                System.out.println("给予报销:" + free);
            } else {
                System.out.println("报销不通过");
            }
        } else {
            if (getNextHandler() != null) {
                getNextHandler().doHandler(user, free);
            }

        }
    }
}