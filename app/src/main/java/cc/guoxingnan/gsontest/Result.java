package cc.guoxingnan.gsontest;

/**
 * Created by mixinan on 2016/5/25.
 */
public class Result {
//            "_id": "5742f4236776593b2d517258",
//            "createdAt": "2016-05-23T20:14:27.784Z",
//            "desc": "Android\u4ee3\u7801\u89c4\u8303\u5229\u5668\uff1a Checkstyle",
//            "publishedAt": "2016-05-24T11:56:12.924Z",
//            "source": "chrome",
//            "type": "Android",
//            "url": "http://droidyue.com/blog/2016/05/22/use-checkstyle-for-better-code-style/",
//            "used": true,
//            "who": "\u848b\u670b"

    private String _id;
    private String createdAt;
    private String desc;
    private String publishedAt;
    private String source;
    private String type;
    private String url;
    private boolean used;
    private String who;

    public Result() {
    }

    public Result(String _id, String createdAt, String desc,
                  String publishedAt, String source, String type,
                  String url, boolean used, String who) {
        this._id = _id;
        this.createdAt = createdAt;
        this.desc = desc;
        this.publishedAt = publishedAt;
        this.source = source;
        this.type = type;
        this.url = url;
        this.used = used;
        this.who = who;
    }


    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public boolean getUsed() {
        return used;
    }

    public void setUsed(boolean used) {
        this.used = used;
    }

    public String getWho() {
        return who;
    }

    public void setWho(String who) {
        this.who = who;
    }


    @Override
    public String toString() {
        return "Result{" +
                "_id='" + _id + '\'' +
                ", createdAt='" + createdAt + '\'' +
                ", desc='" + desc + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                ", source='" + source + '\'' +
                ", type='" + type + '\'' +
                ", url='" + url + '\'' +
                ", used='" + used + '\'' +
                ", who='" + who + '\'' +
                '}';
    }
}
