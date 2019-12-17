package life.wangqiang.community.community.dto;

/**
 * @version : V1.0
 * @ClassName: GithubUser
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 上午11:12
 */
public class GithubUser {
    private String name;
    private Long id;
    private String bio;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }
}
