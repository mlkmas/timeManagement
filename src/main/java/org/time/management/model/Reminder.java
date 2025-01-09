package org.time.management.model;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "reminder")
public class Reminder {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reminder_id", nullable = false)
    private Integer id;

    @Column(name = "reminder_time")
    private Instant reminderTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Instant getReminderTime() {
        return reminderTime;
    }

    public void setReminderTime(Instant reminderTime) {
        this.reminderTime = reminderTime;
    }

}