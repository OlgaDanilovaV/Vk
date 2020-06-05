package ru.netology.domain;

public class Post {
    private int id; //id поста
    private int ownerId; //id владельца
    private int originalPostId; //первоначальный источник
    private int originalOwnerId; //исходный владелец
    private int canPin; //возможность закрепить запись
    private int pinInfo; //инф о закрепленной записи
    private String text;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private CommentsInfo commentsInfo;
    private Geolocation geolocation;
    private int canEdit;
    private int canDelete;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(int ownerId) {
        this.ownerId = ownerId;
    }

    public int getOriginalPostId() {
        return originalPostId;
    }

    public void setOriginalPostId(int originalPostId) {
        this.originalPostId = originalPostId;
    }

    public int getOriginalOwnerId() {
        return originalOwnerId;
    }

    public void setOriginalOwnerId(int originalOwnerId) {
        this.originalOwnerId = originalOwnerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getPinInfo() {
        return pinInfo;
    }

    public void setPinInfo(int pinInfo) {
        this.pinInfo = pinInfo;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLinksInfo(LikesInfo linksInfo) {
        this.likesInfo = likesInfo;
    }

    public RepostsInfo getRepostsInfo() {
        return repostsInfo;
    }

    public void setRepostsInfo(RepostsInfo postInfo) {
        this.repostsInfo = postInfo;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }

    public Geolocation getGeolocation() {
        return geolocation;
    }

    public void setGeolocation(Geolocation geolocation) {
        this.geolocation = geolocation;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }
}
