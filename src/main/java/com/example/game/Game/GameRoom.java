package com.example.game.Game;


import com.example.game.Game.card.Card;
import com.example.game.Game.player.Player;
import com.example.game.model.Timestamped;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class GameRoom {

    @Id
    private String gameRoomId = UUID.randomUUID().toString();

    @Column
    private String roomName;

    @Column
    @OneToMany(mappedBy = "gameRoom", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Card> deck;

    @Column
    @OneToMany
    private List<Card> graveyard;

    @Column
    @OneToMany(mappedBy = "gameRoom", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Player> playerList;

    public void addToDeck(List<Card> cards){
        this.deck.addAll(cards);
    }

    public void removeFromDeck(Card card){
        this.deck.remove(card);
    }

    public void addTograveyard(Card card){
        this.graveyard.add(card);
    }

    public void removeFromDeck(List<Card> cards) {
        this.deck.removeAll(cards);
    }

    public void graveyardToDeck () {
        Collections.shuffle(this.graveyard);
        this.deck.addAll(this.graveyard);
        this.graveyard.clear();
    }
}
