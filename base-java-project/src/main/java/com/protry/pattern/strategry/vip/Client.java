package com.protry.pattern.strategry.vip;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author bshao
 */
public class Client {

    private static final Logger logger = LoggerFactory.getLogger(Client.class);

    public static void main(String[] args) {
        MemberStrategy strategy = new AdvanceMemberStrategy();

        Price price = new Price(strategy);

        double quote = price.quote(300);

        logger.info("图书的价格为： " + quote);
    }
}
