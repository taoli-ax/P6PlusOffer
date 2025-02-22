package day7.balckjack;

public class Player {
    // join table
    public Deck deck;
    private String name;
    public boolean stopDealing;
    public boolean joinGame(Deck deck) {
        return true;
    }

    public int totalBets;
    public int currentBets;
    public void placeBet(int amount) {
        currentBets += amount;
    }
    public void insertCard(Card card) {

    }
    public void dealNextCard() {
        //接受deck 给的next card,加入到手牌
        Card nextCard = deck.dealNextCard();
        insertCard(nextCard);
    }

    public void stopDealing(){

    }

    public void updateBets(int currentBets) {

    }
}
