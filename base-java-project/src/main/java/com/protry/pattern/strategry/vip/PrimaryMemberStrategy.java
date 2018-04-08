package com.cloud.pattern.strategry.vip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class PrimaryMemberStrategy implements MemberStrategy {

    private static final Logger logger = LoggerFactory.getLogger(PrimaryMemberStrategy.class);

    @Override
    public double calcPrice(double booksPrice) {
        logger.info("对初级会员没有折扣");
        return booksPrice;
    }
}
