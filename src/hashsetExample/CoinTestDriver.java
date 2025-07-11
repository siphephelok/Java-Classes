package hashsetExample;

import java.util.HashSet;

public class CoinTestDriver {
    public static void main(String[] args) {
        //create the hashset
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();
        //create coin objects
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        //add the coins to the bag
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);
        System.out.println(bagOfCoins.contains(coin5));

    }//end method main
}//end class CoinTestDriver
