package za.co.ajk.systemgateway.messaging.googlepubsub;

import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHandler;

import za.co.ajk.systemgateway.messaging.InterModulePubSubMessage;


public interface GoogleChannelManager {

    void pubSubMessageSender(InterModulePubSubMessage interModulePubSubMessage);
    MessageChannel pubsubInputChannel();
    MessageHandler messageReceiver();

}
