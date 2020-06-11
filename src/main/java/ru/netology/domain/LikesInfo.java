package ru.netology.domain;

public class LikesInfo {
    private int count;
    private int canLikes;
    private int alreadyLike;
    private int canPublish;


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

    public int getAlreadyLike() {
        return alreadyLike;
    }

    public void setAlreadyLike(int alreadyLike) {
        this.alreadyLike = alreadyLike;
    }

    public int getCanPublish() {
        return canPublish;
    }

    public void setCanPublish(int canPublish) {
        this.canPublish = canPublish;
    }
}
