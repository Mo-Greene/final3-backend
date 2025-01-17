package com.example.game.Game.card.magic.attack;

import com.example.game.Game.GameRoom;
import com.example.game.Game.card.Card;
import com.example.game.Game.card.Deck;
import com.example.game.Game.card.Target;

import static com.example.game.Game.card.CardType.ATTACK;

public class MagicMissile extends Card {

    public MagicMissile (Deck deck) {
        this.gameDeck = deck;
        this.cardName = "Magic Missile";
        this.description = "오랜시간 검증된 마법사들의 친구, 마법의 화살입니다. 단일대상에게 보통의 피해를 줍니다";
        this.cardType = ATTACK;
        this.target = Target.SELECT;
        this.healthModifier = -3;
        this.manaCost = -2;
        this.sleepDuration = 0;
        this.onHand = 0L;
    }
}
