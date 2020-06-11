package ru.netology.domain;

public class CommentsInfo {
    private int count;
    private int groupsCanPost;
    private boolean canOpen;
    private boolean canClose;
    private int canComment;


    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public int getCanComment() {
        return canComment;
    }

    public void setCanComment(int canComment) {
        this.canComment = canComment;
    }
}
