package seedu.address.logic.parser;

<<<<<<< HEAD:src/test/java/seedu/clinicio/logic/parser/LoginCommandParserTest.java
import static seedu.clinicio.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.clinicio.logic.commands.CommandTestUtil.VALID_PASSWORD_ADAM;
import static seedu.clinicio.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.clinicio.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.clinicio.testutil.TypicalPersons.ADAM;
||||||| merged common ancestors
import static seedu.clinicio.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.clinicio.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.clinicio.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.clinicio.testutil.TypicalPersons.ADAM;
=======
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalPersons.ADAM;
>>>>>>> fd0466fa9c4e16f0bbc839aa76ae8488c7686bff:src/test/java/seedu/address/logic/parser/LoginCommandParserTest.java

import org.junit.Test;

<<<<<<< HEAD:src/test/java/seedu/clinicio/logic/parser/LoginCommandParserTest.java
import seedu.clinicio.logic.commands.LoginCommand;

import seedu.clinicio.model.staff.Staff;

import seedu.clinicio.testutil.StaffBuilder;
||||||| merged common ancestors
import seedu.clinicio.logic.commands.LoginCommand;
import seedu.clinicio.model.person.Person;
import seedu.clinicio.testutil.DoctorBuilder;
=======
import seedu.address.logic.commands.LoginCommand;
import seedu.address.model.person.Person;
import seedu.address.testutil.DoctorBuilder;
>>>>>>> fd0466fa9c4e16f0bbc839aa76ae8488c7686bff:src/test/java/seedu/address/logic/parser/LoginCommandParserTest.java

//@@author jjlee050
public class LoginCommandParserTest {

    private LoginCommandParser parser = new LoginCommandParser();

    @Test
    public void parse_emptyArg_throwsParseException() {
        assertParseFailure(parser, "     ", String.format(MESSAGE_INVALID_COMMAND_FORMAT, LoginCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_invalidArg_throwsParseException() {
        assertParseFailure(parser, "a", String.format(MESSAGE_INVALID_COMMAND_FORMAT, LoginCommand.MESSAGE_USAGE));
    }

    @Test
    public void parse_validArgs_returnsLoginCommand() {
        // no leading and trailing whitespaces
        Staff expectedStaff = new StaffBuilder(ADAM).withPassword(VALID_PASSWORD_ADAM, false).build();
        LoginCommand expectedLoginCommand = new LoginCommand(expectedStaff);
        assertParseSuccess(parser, " r/doctor n/" + ADAM.getName()
                + " pass/" + VALID_PASSWORD_ADAM, expectedLoginCommand);

        // multiple whitespaces between keywords
        assertParseSuccess(parser, " \n r/doctor \n \t n/" + ADAM.getName() + " \t pass/"
                + VALID_PASSWORD_ADAM, expectedLoginCommand);

        // TODO: Add receptionist
    }
}
