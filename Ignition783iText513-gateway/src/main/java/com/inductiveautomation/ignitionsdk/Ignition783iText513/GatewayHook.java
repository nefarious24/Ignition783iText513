package com.inductiveautomation.ignitionsdk.Ignition783iText513;

import com.inductiveautomation.ignition.common.licensing.LicenseState;
import com.inductiveautomation.ignition.gateway.model.AbstractGatewayModuleHook;
import com.inductiveautomation.ignition.gateway.model.GatewayContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class GatewayHook extends AbstractGatewayModuleHook {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void setup(GatewayContext gatewayContext) {

    }

    @Override
    public void startup(LicenseState licenseState) {

    }

    @Override
    public void shutdown() {

    }
    
    public boolean isFreeModule(){
    	return true;
    }

}
