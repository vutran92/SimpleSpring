package vutran.springinaction.knights;

import static org.mockito.Mockito.*;

import org.junit.Test;

import vutran.springinaction.knights.BraveKnight;
import vutran.springinaction.knights.Quest;

public class BraveKnightTest {

    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }

}
