import java.util.*;
import java.util.stream.*;

class Reading {
    String sensorId;
    int temperature;

    Reading(String sensorId, int temperature) {
        this.sensorId = sensorId;
        this.temperature = temperature;
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();

        List<Reading> readings = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            String id = sc.next();
            int temp = sc.nextInt();
            readings.add(new Reading(id, temp));
        }

        Map<String, Double> averageMap = readings.stream()
                .filter(r -> r.temperature > 50)
                .collect(Collectors.groupingBy(
                        r -> r.sensorId,
                        Collectors.averagingInt(r -> r.temperature)
                ));

        averageMap.entrySet().stream()
                .sorted(Map.Entry.<String, Double>comparingByValue().reversed())
                .forEach(entry ->
                        System.out.println(entry.getKey() + " " + entry.getValue()));

        sc.close();
    }
}