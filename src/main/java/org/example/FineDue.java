package org.example;

import java.time.LocalDate;
import java.util.HashMap;

public class FineDue {
    private HashMap<Member, Integer> fines; // memberID -> fineAmount
    private HashMap<Integer, LocalDate> dueDates; // memberID -> dueDate

    public FineDue() {
        fines = new HashMap<>();
        dueDates = new HashMap<>();
    }

    public HashMap<Member, Integer> getFines() {
        return fines;
    }

    public HashMap<Integer, LocalDate> getDueDates() {
        return dueDates;
    }


    public void addFine(String name, int memberId, int fineAmount) {
        fines.put(new Member(name,memberId), fines.getOrDefault(memberId, 0) + fineAmount);
    }

    public int getFine(int memberId) {
        return fines.getOrDefault(memberId, 0);
    }

    public void setDueDate(int memberId, LocalDate dueDate) {
        dueDates.put(memberId, dueDate);
    }

    public LocalDate getDueDate(int memberId) {
        return dueDates.get(memberId);
    }
}
