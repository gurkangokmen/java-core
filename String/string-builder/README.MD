| Feature            | String                | StringBuilder            | StringBuffer             |
|--------------------|-----------------------|--------------------------|--------------------------|
| Introduction       | Introduced in JDK 1.0 | Introduced in JDK 1.5    | Introduced in JDK 1.0    |
| Mutability         | Immutable             | Mutable                  | Mutable                  |
| Thread Safety      | Thread Safe           | Not Thread Safe          | Thread Safe              |
| Memory Efficiency  | High                  | Efficient                | Less Efficient           |
| Performance        | High (No-Synchronization) | High (No-Synchronization) | Low (Due to Synchronization) |
| Usage              | This is used when we want immutability. | This is used when Thread safety is not required. | This is used when Thread safety is required. |
