import org.junit.jupiter.api.Test;
import org.league.util.ApplicationContext;

public class LeagueTest {
    @Test
    void listTest() {
        ApplicationContext.getClubService().getClubLeague();
    }
}
