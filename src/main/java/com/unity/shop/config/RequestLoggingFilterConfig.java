package com.unity.shop.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CommonsRequestLoggingFilter;

@Configuration
public class RequestLoggingFilterConfig {

    @Bean
    public CommonsRequestLoggingFilter logFilter() {
        CommonsRequestLoggingFilter filter
          = new CommonsRequestLoggingFilter();
        filter.setIncludeQueryString(true);
        filter.setIncludePayload(true);
        filter.setMaxPayloadLength(10000);
        filter.setIncludeHeaders(false);
        filter.setBeforeMessageSuffix(" =========\n================================================================================================");
        filter.setBeforeMessagePrefix("\n================================================================================================\n========== Request : ");
        filter.setAfterMessagePrefix("");
        filter.setAfterMessageSuffix("");
        return filter;
    }
}
