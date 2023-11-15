/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hashsettask;

/**
 *
 * @author Dell 7300
 */
import java.util.HashSet;
public class CoinTestDriver {
    public static void main(String[] args) {
        // create the hashset
        HashSet<Coin> bagOfCoins = new HashSet<Coin>();

        // create coin objects
        Coin coin1 = new Coin(1);
        Coin coin2 = new Coin(2);
        Coin coin5 = new Coin(5);
        Coin coin10 = new Coin(10);
        Coin coin20 = new Coin(20);
        Coin coin50 = new Coin(50);
        Coin coin100 = new Coin(100);

        // add the coins to the bag
        bagOfCoins.add(coin1);
        bagOfCoins.add(coin2);
        bagOfCoins.add(coin5);
        bagOfCoins.add(coin10);
        bagOfCoins.add(coin20);
        bagOfCoins.add(coin50);
        bagOfCoins.add(coin10);

        // find coin in the bag
        findCoin(bagOfCoins, coin10);
        findCoin(bagOfCoins, coin100);

        // display bag contents
        displayBagContents(bagOfCoins);

        // display bag details
        displayBagDetails(bagOfCoins);

        // remove all elements from the set
        bagOfCoins.clear();

        // display bag details after removal
        displayBagDetails(bagOfCoins);
    }

    static void findCoin(HashSet<Coin> bagOfCoins, Coin coin) {
        if (bagOfCoins.contains(coin))
            System.out.println("There is a coin " + coin.getDenomination() + " in the bag");
        else
            System.out.println("There is no coin " + coin.getDenomination() + " in the bag");
    }

    static void displayBagContents(HashSet<Coin> bagOfCoins) {
        // display the contents of the bag
        for (Coin coin : bagOfCoins)
            System.out.println(coin.getDenomination());
    }

    static void displayBagDetails(HashSet<Coin> bagOfCoins) {
        if (bagOfCoins.isEmpty())
            System.out.println("There are no coins in the bag");
        else
            System.out.println("There are " + bagOfCoins.size() + " coins in the bag");
    }
}