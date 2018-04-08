package com.cloud.pattern.strategry.vip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class AdvanceMemberStrategy implements MemberStrategy {

    private static final Logger logger = LoggerFactory.getLogger(AdvanceMemberStrategy.class);
    @Override
    public double calcPrice(double booksPrice) {
        logger.info("对于高级会员的折扣为20%");
        return booksPrice * 0.8;
    }
}
