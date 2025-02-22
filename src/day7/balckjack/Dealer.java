package day7.balckjack;

import java.util.List;

public class Dealer {
    private List<Card> cards;
    // init card
    //join table
    // place bet
    // get init cards
    // deal
    // increase bet
    // stop dealing
    // win-check: compare score , take bets
    int bets;
    public boolean largeThan(Player p){
        return false;
    }

    public void updateBets(int currentBets){
        bets += currentBets;
    }
}
