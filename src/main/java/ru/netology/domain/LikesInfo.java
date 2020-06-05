package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int canLikes;
    private boolean alreadyLike;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCanLikes() {
        return canLikes;
    }

    public void setCanLikes(int canLikes) {
        this.canLikes = canLikes;
    }

    public boolean isAlreadyLike() {
        return alreadyLike;
    }

    public void setAlreadyLike(boolean alreadyLike) {
        this.alreadyLike = alreadyLike;
    }
}
