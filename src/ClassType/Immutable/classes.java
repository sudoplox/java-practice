package ClassType.Immutable;

// Immutable class with final fields and no setters
final class BasicImmutable {
    private final String name;
    private final int age;

    public BasicImmutable(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Immutable class with a mutable field (defensive copy)
final class ImmutableWithDefensiveCopy {
    private final String name;
    private final int[] scores;

    public ImmutableWithDefensiveCopy(String name, int[] scores) {
        this.name = name;
        this.scores = scores.clone(); // Defensive copy
    }

    public String getName() {
        return name;
    }

    public int[] getScores() {
        return scores.clone(); // Defensive copy
    }
}

// Immutable class using a builder pattern
final class ImmutableWithBuilder {
    private final String name;
    private final int age;

    private ImmutableWithBuilder(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static class Builder {
        private String name;
        private int age;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public ImmutableWithBuilder build() {
            return new ImmutableWithBuilder(this);
        }
    }
}

public class classes {
    public static void main(String[] args) {
        // Using BasicImmutable
        BasicImmutable basic = new BasicImmutable("Alice", 30);
        System.out.println("BasicImmutable: Name = " + basic.getName() + ", Age = " + basic.getAge());

        // Using ImmutableWithDefensiveCopy
        int[] scores = {90, 80, 70};
        ImmutableWithDefensiveCopy defensiveCopy = new ImmutableWithDefensiveCopy("Bob", scores);
        System.out.println("ImmutableWithDefensiveCopy: Name = " + defensiveCopy.getName() + ", Scores = " + java.util.Arrays.toString(defensiveCopy.getScores()));

        // Modifying the original array to show immutability
        scores[0] = 100;
        System.out.println("After modifying original array: Scores = " + java.util.Arrays.toString(defensiveCopy.getScores()));

        // Using ImmutableWithBuilder
        ImmutableWithBuilder builderImmutable = new ImmutableWithBuilder.Builder()
                .setName("Charlie")
                .setAge(25)
                .build();
        System.out.println("ImmutableWithBuilder: Name = " + builderImmutable.getName() + ", Age = " + builderImmutable.getAge());
    }
}