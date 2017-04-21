package com.dbs.cst.ircp.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.dbs.cst.ircp.model.IRInput;

public class IRInputProcessor implements ItemProcessor<IRInput, IRInput> {

    private static final Logger log = LoggerFactory.getLogger(IRInputProcessor.class);

    @Override
    public IRInput process(final IRInput iRInput) throws Exception {

        log.info("Converting (" + iRInput + ") into (" + iRInput + ")");

        return iRInput;
    }

}
