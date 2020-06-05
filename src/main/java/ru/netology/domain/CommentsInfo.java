package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int canOpen;
    private int canDelete;
    private int canComment;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanOpen() {
        return canOpen;
    }

    public void setCanOpen(int canOpen) {
        this.canOpen = canOpen;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }
}
