package com.didispace.stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Input;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.annotation.Poller;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.SubscribableChannel;
import org.springframework.messaging.support.GenericMessage;

interface ExampleBinder {

    String NAME = "example-topic";

    @Input(NAME)
    SubscribableChannel input();

}
