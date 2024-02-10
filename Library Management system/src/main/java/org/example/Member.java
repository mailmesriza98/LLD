package org.example;
import java.util.ArrayList;
import java.util.List;
public class Member {
    private String name;
    private int memberID;
    private boolean isMember;
    private int outStandingBooksToReturn;
    private List<String> booksCurrentlyHeld;


    public Member(String name, int memberID) {
        this.name = name;
        this.memberID = memberID;
        this.isMember = true;
        this.outStandingBooksToReturn = 0;
        this.booksCurrentlyHeld = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public boolean isMember() {
        return isMember;
    }

    public void setMember(boolean member) {
        isMember = member;
    }

    public int getOutStandingBooksToReturn() {
        return outStandingBooksToReturn;
    }

    public void setOutStandingBooksToReturn(int outStandingBooksToReturn) {
        this.outStandingBooksToReturn = outStandingBooksToReturn;
    }

    public List<String> getBooksCurrentlyHeld() {
        return booksCurrentlyHeld;
    }

    public void setBooksCurrentlyHeld(List<String> booksCurrentlyHeld) {
        this.booksCurrentlyHeld = booksCurrentlyHeld;
    }
}
