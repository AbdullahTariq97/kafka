package kafka.practise;

// bootstrap.server : This is the address of the Kafka server

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

public class SampleProducer {

    public SampleProducer() {

//      Properties object is holding config for Kafka producer
        Properties properties = new Properties();
        properties.put("bootstrap.servers", "localhost:9092");

//      The messages/data sent from Kafka producer to Kafka broker/server is sent in the form of key-value pairs to a particular topic of the Kafka
//      These key-value pairs need a to be encrypted using a serializer. This converts key-value into a text based string
        properties.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        properties.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");

//      Producer initialized with the config specified above
        KafkaProducer producer = new KafkaProducer(properties);

//      The data from Kafka client needs to be sent as a Producer record object.
//      It requires the topic name to be passed into its constructor
//      As well as the key-value that needs to be sent to the Kafka broker
        ProducerRecord producerRecord = new ProducerRecord("channel", "key-name", "another value");

        producer.send(producerRecord);
        producer.close();
    }
}
