import org.junit.Test;
import static org.junit.Assert.*;

public class HeroTest {
    @Test
    public void Hero_instantiateCorrectly_true() {
        Hero myHero = new Hero("Joker", "34", "Acid", "Batman", "Selfish");
        assertTrue(myHero instanceof Hero);
    }

    @Test
    public void getName_getNameForHeroes_String() {
        Hero myHero = new Hero("Flash", "23", "Speed", "Kryptonite", "Humanity");
        String expected = "Flash";
        assertEquals(expected, myHero.getmName());
    }

    @Test
    public void getAge_getAgeForHeroes_int() {
        Hero myHero = new Hero("Storm", "35", "Lightning", "Fire", "Savior");
        String expected = "35";
        assertEquals(expected, myHero.getmAge());
    }

    @Test
    public void getPower_getPowerForHeroes_String() {
        Hero myHero = new Hero("Batman", "33", "Wealth", "Joker", "Selfless");
        String expected = "Wealth";
        assertEquals(expected, myHero.getmSuperpower());
    }

}