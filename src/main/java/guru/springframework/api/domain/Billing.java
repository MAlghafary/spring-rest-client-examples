package guru.springframework.api.domain;

public class Billing {
    private Card card;

    public Billing() {
    }

    public Billing(Card card) {
        this.card = card;
    }

    public Card getCard() {
        return card;
    }
}
