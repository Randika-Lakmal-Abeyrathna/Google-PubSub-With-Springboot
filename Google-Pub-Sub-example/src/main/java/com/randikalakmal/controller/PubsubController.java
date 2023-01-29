package com.randikalakmal.controller;

import com.randikalakmal.outbound.OutboundConfiguration;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/send")
@RequiredArgsConstructor
@Slf4j
public class PubsubController {

    private final OutboundConfiguration.PubsubOutboundGateway gateway;

    @PostMapping("/")
    public void sendMessage(@RequestBody String message){
        log.info("Send Message ",message);
        gateway.sendToPubsub(message);
    }

}
