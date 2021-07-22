package codepuzzlers;

import org.junit.jupiter.api.Test;

import static codepuzzlers.CalendarInvite.checkMeetingAvailability;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class CalendarInviteTest {

    private final int[][] meetings = {
            {1230, 1300},
            { 845,  900},
            {1300, 1500},
    };

    @Test
    void checkMeetingAvailability_915_to_1215() {
        assertTrue(checkMeetingAvailability(meetings, 915, 1215));
    }

    @Test
    void checkMeetingAvailability_900_to_1230() {
        assertTrue(checkMeetingAvailability(meetings, 900, 1230));
    }

    @Test
    void checkMeetingAvailability_850_to_1240() {
        assertFalse(checkMeetingAvailability(meetings, 850, 1240));
    }

    @Test
    void checkMeetingAvailability_1200_to_1300() {
        assertFalse(checkMeetingAvailability(meetings, 1200, 1300));
    }

    @Test
    void checkMeetingAvailability_700_to_1600() {
        assertFalse(checkMeetingAvailability(meetings, 700, 1600));
    }

    @Test
    void checkMeetingAvailability_800_to_845() {
        assertTrue(checkMeetingAvailability(meetings, 800, 845));
    }

    @Test
    void checkMeetingAvailability_1500_to_1800() {
        assertTrue(checkMeetingAvailability(meetings, 1500, 1800));
    }

    @Test
    void checkMeetingAvailability_845_to_859() {
        assertFalse(checkMeetingAvailability(meetings, 845, 859));
    }

    @Test
    void checkMeetingAvailability_846_to_900() {
        assertFalse(checkMeetingAvailability(meetings, 846, 900));
    }

    @Test
    void checkMeetingAvailability_846_to_859() {
        assertFalse(checkMeetingAvailability(meetings, 846, 859));
    }

    @Test
    void checkMeetingAvailability_845_to_900() {
        assertFalse(checkMeetingAvailability(meetings, 845, 900));
    }

    @Test
    void checkMeetingAvailability_2359_to_2400() {
        assertTrue(checkMeetingAvailability(meetings, 2359, 2400));
    }

    @Test
    void checkMeetingAvailability_930_to_1600() {
        assertFalse(checkMeetingAvailability(meetings, 930, 1600));
    }

    @Test
    void checkMeetingAvailability_800_to_850() {
        assertFalse(checkMeetingAvailability(meetings, 800, 850));
    }

    @Test
    void checkMeetingAvailability_1400_to_1600() {
        assertFalse(checkMeetingAvailability(meetings, 1400, 1600));
    }

    @Test
    void checkMeetingAvailability_1300_to_1501() {
        assertFalse(checkMeetingAvailability(meetings, 1300, 1501));
    }

}