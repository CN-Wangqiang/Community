package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

/**
 * @version : V1.0
 * @ClassName: UserMapper
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 下午4:24
 */
@Mapper
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modified) " +
            "values(#{name},#{accountId},#{token},#{gmtCreate},#{gmtModified})")
    void insert(User user);
}
