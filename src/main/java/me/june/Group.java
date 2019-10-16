package me.june;

/**
 * Created by IntelliJ IDEA.
 * User: june
 * Date: 16/10/2019
 * Time: 9:16 오후
 **/
public class Group {

    /* 최대 참가자 */
    int maxNumberOfAttendees;

    /* 현재 신청자 */
    int numberOfEnrollment;

    public boolean isFull () {
        if (maxNumberOfAttendees == 0) {
            return false;
        }
        if (numberOfEnrollment < maxNumberOfAttendees) {
            return false;
        }
        return true;
    }
}
