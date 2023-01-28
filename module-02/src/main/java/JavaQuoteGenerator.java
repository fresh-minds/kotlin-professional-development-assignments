import java.util.List;
import java.util.Random;

public final class JavaQuoteGenerator {

    private static final Random RANDOM = new Random();
    private static final List<String> QUOTES = List.of(
            "You're gonna need a bigger boat.",
            "Frankly, my dear, I don't give a damn.",
            "Hasta la vista, baby.",
            "I feel the need — the need for speed!",
            "Chewie, we're home.",
            "I'm going to make him an offer he can't refuse.",
            "We rob banks."
    );

    private JavaQuoteGenerator() {
        // Hide constructor to avoid unnecessary instantiation
    }

    public static String next() {
        int randomNumber = RANDOM.nextInt(QUOTES.size() + 5);

        if (randomNumber > QUOTES.size() - 1) {
            return null;
        }

        return QUOTES.get(randomNumber);
    }
}
