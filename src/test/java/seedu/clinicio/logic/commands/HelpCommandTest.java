package seedu.clinicio.logic.commands;

import static org.junit.Assert.assertTrue;
import static seedu.clinicio.logic.commands.CommandTestUtil.assertCommandSuccess;
import static seedu.clinicio.logic.commands.HelpCommand.SHOWING_HELP_MESSAGE;

import org.junit.Rule;
import org.junit.Test;

import seedu.clinicio.commons.events.ui.ShowHelpRequestEvent;
import seedu.clinicio.logic.CommandHistory;
import seedu.clinicio.model.Model;
import seedu.clinicio.model.ModelManager;
import seedu.clinicio.model.analytics.Analytics;
import seedu.clinicio.ui.testutil.EventsCollectorRule;

public class HelpCommandTest {
    @Rule
    public final EventsCollectorRule eventsCollectorRule = new EventsCollectorRule();

    private Model model = new ModelManager();
    private Model expectedModel = new ModelManager();
    private CommandHistory commandHistory = new CommandHistory();
    private Analytics analytics = new Analytics();

    @Test
    public void execute_help_success() {
        assertCommandSuccess(new HelpCommand(), model, commandHistory, SHOWING_HELP_MESSAGE, expectedModel, analytics);
        assertTrue(eventsCollectorRule.eventsCollector.getMostRecent() instanceof ShowHelpRequestEvent);
        assertTrue(eventsCollectorRule.eventsCollector.getSize() == 1);
    }
}
