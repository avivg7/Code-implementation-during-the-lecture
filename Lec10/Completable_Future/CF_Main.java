import java.util.concurrent.CompletableFuture;

public class CF_Main {
	
	public static String deepThought() {
		// 7m years of calculation...
		return "42";
	}

	public static void main(String[] args) {
		CompletableFuture.supplyAsync( ()-> { return deepThought();})
		.thenApply((answer)->Integer.parseInt(answer))
		.thenApply(x->x*2)
		.thenApply(x->x.toString())
		.thenApply(str -> new StringBuilder(str).reverse().toString())
		.thenAccept(str->System.out.println("answer: " + str));
	}
}