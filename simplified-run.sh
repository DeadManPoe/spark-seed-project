CLASS="it.polimi.dice.spark.PiExample.class"
MASTER="yarn-client" #Insert master
NUM_EXECUTORS=1 #Insert number_of_executors
DRIVER_MEMORY="512m" #Insert amount of driver-memory
EXECUTOR_MEMORY="512m" #Insert amount of executor-memory
EXECUTOR_CORES=1 #Insert executor-cores
JAR_LOCATION="/home/DeadManPoe/spark-seed-project/target/scala-2.11/spark-seed-project-assembly-1.0.jar" #Insert here jar path
##
cd /usr/hdp/current/spark-client/bin
spark-submit --class $CLASS --master $MASTER --num-executors $NUM_EXECUTORS --driver-memory $DRIVER_MEMORY --executor-memory $EXECUTOR_MEMORY --executor-cores $EXECUTOR_CORES $JAR_LOCATION 1
