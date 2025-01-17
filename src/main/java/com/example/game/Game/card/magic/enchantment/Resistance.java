package com.example.game.Game.card.magic.enchantment;

import com.example.game.Game.GameRoom;
import com.example.game.Game.card.Card;
import com.example.game.Game.card.Deck;
import com.example.game.Game.card.Target;

import static com.example.game.Game.card.CardType.ENCHANTMENT;

public class Resistance extends Card {
    public Resistance(Deck deck) {
        this.gameDeck = deck;
        this.cardName = "Remedy";
        this.description = "허약하기 짝이없는 마법사들을 위한 자구책, 상태이상을 제거하거나 상태이상 저항력을 높입니다.";
        this.cardType = ENCHANTMENT;
        this.target = Target.SELECT;
        this.manaCost = -1;
        this.poisonDuration = -1;
        this.stunDuration = -1;
        this.muteDuration = -1;
        this.petrifyDuration = -1;
        this.onHand = 0L;
    }
}


//    public int poisonDuration;
//
//    public int stunDuration;
//
//    public int muteDuration;
//
//    public int petrifyDuration;