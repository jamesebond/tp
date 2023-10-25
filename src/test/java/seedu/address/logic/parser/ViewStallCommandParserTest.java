package seedu.address.logic.parser;

import static seedu.address.logic.Messages.MESSAGE_INVALID_COMMAND_FORMAT;
import static seedu.address.logic.commands.CommandTestUtil.PREAMBLE_WHITESPACE;
import static seedu.address.logic.parser.CliSyntax.PREFIX_STALL;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseFailure;
import static seedu.address.logic.parser.CommandParserTestUtil.assertParseSuccess;
import static seedu.address.testutil.TypicalIndexes.INDEX_FIRST_STALL;

import org.junit.jupiter.api.Test;

import seedu.address.logic.commands.ViewStallCommand;

public class ViewStallCommandParserTest {

    private ViewStallCommandParser parser = new ViewStallCommandParser();

    @Test
    public void parse_validArgs_returnsViewStallCommand() {
        String userInput = PREAMBLE_WHITESPACE + " " + PREFIX_STALL + "1";
        assertParseSuccess(parser, userInput, new ViewStallCommand(INDEX_FIRST_STALL));
    }

    @Test
    public void parse_invalidArgs_throwsParseException() {
        String userInput = PREAMBLE_WHITESPACE + " " + PREFIX_STALL + "a";
        assertParseFailure(parser, userInput, String.format(MESSAGE_INVALID_COMMAND_FORMAT,
                ViewStallCommand.MESSAGE_USAGE));
    }
}
