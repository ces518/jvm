package me.june;


import org.junit.Assert;
import org.junit.Test;

public class GroupTest {

    @Test
    public void isFull () {
        Group group = new Group();
        group.maxNumberOfAttendees = 100;
        group.numberOfEnrollment = 10;

        Assert.assertFalse(group.isFull());
    }
}
