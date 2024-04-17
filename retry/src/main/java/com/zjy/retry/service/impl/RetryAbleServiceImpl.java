package com.learn.retry.service.impl;

import com.learn.retry.service.RetryAbleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Retryable;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author learn
 */
@Slf4j
@Service
public class RetryAbleServiceImpl implements RetryAbleService {

    @Override
    @Retryable
    @Async
    public String testRetry() {
        log.info("Retry execute");
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        throw new RuntimeException();
    }
}
