/*
You are implementing a program to use as your calendar. We can add a new event if adding the event will not cause a double booking.
A double booking happens when two events have some non-empty intersection (i.e., some moment is common to both events.).
The event can be represented as a pair of integers start and end that represents a booking on the half-open interval [start, end), the range of real numbers x such that start <= x < end.
Implement the MyCalendar class:
MyCalendar() Initializes the calendar object.
boolean book(int start, int end) Returns true if the event can be added to the calendar successfully without causing a double booking. Otherwise, return false and do not add the event to the calendar.
*/

class MyCalendar {

    List<int[]> l;
    public MyCalendar() {
        l = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for(int[] sched: l)
        {
            if(sched[0]<end && start<sched[1])
                return false;
        }
        l.add(new int[]{start,end});
        return true;
    }
}