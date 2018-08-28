package com.protry.sofa.provider.service.impl;

import com.protry.sofa.provider.service.HelloSyncService;

public class HelloSyncServiceImpl implements HelloSyncService {

    @Override
    public String saySync(String string) {
        return "provider tell you : this is your say: " +  string;
    }
}
