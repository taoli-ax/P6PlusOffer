package day7.balckjack;

import java.util.ArrayList;
import java.util.List;

public class Deck {
    private Dealer dealer;
    private List<Card> cards;
    private ArrayList<Player> players;

    public void addPlayers(){

    }
    private void shuffle(){
        // 牌类算法 52张牌 1/52
    }

    public void initialCards(){

    }
    public Card dealNextCard(){
        return cards.remove(0);
    }

    public void compareResult(List<Player> players ){
        for (Player player : players){
            int currentBets= player.currentBets;
            if(dealer.largeThan(player)){
                dealer.updateBets(currentBets);
                player.updateBets(-currentBets);
            }else {
                dealer.updateBets(currentBets);
                player.updateBets(-currentBets);
            }
        }
    }
}
