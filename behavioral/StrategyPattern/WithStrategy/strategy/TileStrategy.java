package behavioral.StrategyPattern.WithStrategy.strategy;

public class TileStrategy implements FlooringStrategy {
    @Override
    public void floor() {
        // Add the Tile flooring code
        System.out.println("Tile Flooring");
    }
}
