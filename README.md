# effective-java

### Author: Rodrigo León

1. Implement cache service. Cache entries (objects) – simple custom class with one String field. Your cache service should have 2 methods: get and put.

* Max Size = 100 000 
* Eviction policy 
* Logging 
* Give statistic to user 
* Support concurrency 

2. Implement binary search algorithm:

* recursively

3. TODO - Implement merge-sort algorithm with desired complexity of O(N log(N)). Provide unit and benchmark tests.

4. TODO - Implement insertion-sort algorithm with desired complexity of O (N^2) in worst case and space complexity O (1). Provide unit and benchmark tests.

5. TODO - Integrate sort implementations into binary search implementation in the most efficient way using appropriate software design and patterns. Use parametrized tests for testing similar cases in different sort implementations. Use suggestions from “Effective java”.

6. TODO - Implement binary tree bypass algorithm. Become familiar with binary tree as data structure and its implementation\usage in JDK.

### Code Implementation

1. SimpleCache
```bash
mvn clean compile test
mvn exec:java -Dexec.mainClass="com.epam.task.SimpleCache"
```

2. RecursiveSearch
```bash
mvn clean compile test
mvn exec:java -Dexec.mainClass="com.epam.task.RecursiveSearch"
```

