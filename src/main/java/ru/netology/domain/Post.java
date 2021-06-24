package ru.netology.domain;

public class Post {
    private int id;
    private int ownerId;
    private int fromId;
    private int timeOfPost;
    private String textOfPost;
    private boolean postAttachments;
    private CommentsInfo commentsInfo;
    private LikesInfo likesInfo;
    private RepostsInfo repostsInfo;
    private ViewsInfo viewsInfo;

    public boolean isPostAttachments() {
        return postAttachments;
    }

    public void setPostAttachments(boolean postAttachments) {
        this.postAttachments = postAttachments;
    }

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

    public int getFromId() {
        return fromId;
    }

    public void setFromId(int fromId) {
        this.fromId = fromId;
    }

    public int getTimeOfPost() {
        return timeOfPost;
    }

    public void setTimeOfPost(int timeOfPost) {
        this.timeOfPost = timeOfPost;
    }

    public String getTextOfPost() {
        return textOfPost;
    }

    public void setTextOfPost(String textOfPost) {
        this.textOfPost = textOfPost;
    }
}
