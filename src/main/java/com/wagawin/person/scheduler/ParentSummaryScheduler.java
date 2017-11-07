package com.wagawin.person.scheduler;

import com.wagawin.person.business.service.ParentSummaryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ParentSummaryScheduler {

    private static final Logger log = LoggerFactory.getLogger(ParentSummaryScheduler.class);

    @Autowired
    private ParentSummaryService parentSummaryService;

    @Scheduled(fixedDelay = 1000*60*5 )
    public void processParentSummary() {
        log.info("Creating parent summary", new Date());
        parentSummaryService.create();
    }

}
