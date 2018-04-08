package com.cloud.pattern.strategry.vip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class IntermediateMemberStrategy implements MemberStrategy {

    private static final Logger logger = LoggerFactory.getLogger(IntermediateMemberStrategy.class);

    @Override
    public double calcPrice(double booksPrice) {
        logger.info("对中级会员的折扣为10%");
        return booksPrice * 0.9;
    }
}
