# smart-planner
A program to generate a daily plan based off of a list of the users tasks.

IMPLEMENTED:

- Task object
    - Store relevant data
    - access relevant data

TODO:

- Task object
    - recurrance and frequency
- need some script that updates the timer on each recurring task daily

- Store and access user timetable
    - Time free on each day in the week
    - Could work dynamically based on when the user begins their day/accesses the list
        - I.E. if the user wakes up late, or only begins the list after work, a shorter list is generated, with only priority tasks

- User options to manage tasks on the system and update user timetable

- List generator script
    - fits tasks by time needed into the current days time availible
    - some script to prioritize urgent tasks about to expire

- Task check-off
    - clears tasks from days list once completed
    - updates the timer on recurring tasks
    - could add option to enter how long a task took, for future reference

- Task veto
    - certain amount allowed per day
    - automatically adds tasks to the start of next list (tags them as priority?)
    - Not allowed on urgent tasks


FURTHER DOWN THE LINE:
- integration with existing calendars / built in calendar display system
- AI companion integration, dynamic conversation to add/complete/veto tasks
    - potential wake-up mode, reads list out to user in the morning