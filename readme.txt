https://www.youtube.com/watch?v=bwXWIx5dZjw&t=686s
https://www.youtube.com/watch?v=WnlX7w4lHvM

This creates a Kafka topic inside our Kafka server
./bin/kafka-topics.sh --create --zookeeper "zookeeper:2181" --replication-factor 1 --partitions 1 --topic channel

This lists the topics that we have created in Kafka
 ./bin/kafka-topics.sh --list --zookeeper "zookeeper:2181"

This creates a command line kafka consumer. Through this we can check what was producer to our kafka server for a given topic
./kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic channel --from-beginnin

docker compose -f docker-compose.yml up