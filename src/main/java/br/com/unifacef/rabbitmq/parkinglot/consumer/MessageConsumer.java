package br.com.unifacef.rabbitmq.parkinglot.consumer;

import br.com.unifacef.rabbitmq.parkinglot.configuration.ParkingLotConfiguration;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @RabbitListener(queues = ParkingLotConfiguration.QUEUE_MESSAGES)
    public void receiveMessage(Message message) {
        throw new RuntimeException("Business Rule Exception");
    }

}
