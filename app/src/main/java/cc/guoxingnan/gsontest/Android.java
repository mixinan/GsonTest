package cc.guoxingnan.gsontest;

import java.util.List;

/**
 * Created by mixinan on 2016/5/25.
 */
public class Android {
    private String error;
    private List<Result> results;

    public Android() {
    }

    public Android(String error, List<Result> results) {
        this.error = error;
        this.results = results;
    }


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Android{" +
                "error='" + error + '\'' +
                ", results=" + results +
                '}';
    }
}
