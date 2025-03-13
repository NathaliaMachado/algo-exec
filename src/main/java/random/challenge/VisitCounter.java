package random.challenge;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/*
The system you work with on a daily basis runs multiple microservices. You have been asked to prepare an
aggregation that represents the number of user visits to all microservices, for use by data analysts.
The architect you're working with has already designed the API, which consists of a single class: VisitCounter 0.
VisitCounter D has a single method, count O. It returns Map<Long, Long> 0 -this map should contain the number of
visits by the user with a given ID. This method accepts an array of Map<$tring, UserStats> .Every map represents
the total number of visits per user to a given microservice. There are some problems, however. -. The map key,
which isa String 0,should be parseable to Long D - but it may not be. You must skip any such faulty entries.

For some keys, UserStats D maybe null 0 .You must skip any such faulty entries. O.of type
Optional <Long> will never be null o ;however, it might • UserStats D has a single field,
visitCount getter for this field is also implemented. This field be empty. You must skip any such faulty entries.
Remember that you may receive some invalid input: null o, empty maps, and so on. Handle it all appropriately and
return an empty map. Assumptions The UserStats D class is already implemented. You do not have to write the
implementation of this class as a part of your solution. Available packages and libraries •
You may use Java 8 Streams APl to implement your solution.
 */

public class VisitCounter {

    public static void main(String[] args) {
        VisitCounter visitCounter = new VisitCounter();

        Map<String, UserStats> microservice1 = new HashMap<>();
        microservice1.put("1", new UserStats(Optional.of(5L)));
        microservice1.put("2", new UserStats(Optional.of(3L)));
        microservice1.put("abc", new UserStats(Optional.of(10L))); // Invalid key
        microservice1.put("3", null); // Null value

        Map<String, UserStats> microservice2 = new HashMap<>();
        microservice2.put("1", new UserStats(Optional.of(2L)));
        microservice2.put("2", new UserStats(Optional.empty())); // Empty optional
        microservice2.put("4", new UserStats(Optional.of(8L)));

        Map<Long, Long> result = visitCounter.count(microservice1, microservice2);

        System.out.println(result);
    }

    static public Map<Long, Long> count(Map<String, UserStats>... visits) {

        if (visits == null || visits.length == 0) {
            return Collections.emptyMap();
        }

        Map<Long, Long> aggregatedVisits = new HashMap<>();

        for (Map<String, UserStats> visitMap : visits) {
            if (visitMap == null) continue;

            visitMap.forEach((key, userStats) -> {
                try {
                    Long userId = Long.parseLong(key);
                    if (userStats != null && userStats.getVisitCount().isPresent()) {
                        aggregatedVisits.merge(userId, userStats.getVisitCount().get(), Long::sum);
                    }
                } catch (NumberFormatException ignored) {}
            });
        }

        return aggregatedVisits;
    }
}

    class UserStats {
        private Optional<Long> visitCount;

        public UserStats(Optional<Long> visitCount) {
            this.visitCount = visitCount;
        }

        public Optional<Long> getVisitCount() {
            return visitCount;
        }
    }


