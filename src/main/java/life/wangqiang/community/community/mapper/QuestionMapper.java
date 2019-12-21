package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.Question;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @version : V1.0
 * @ClassName: QuestionMapper
 * @Description: TODO
 * @Auther: wangqiang
 * @Date: 2019/12/17 下午8:22
 */
@Mapper
public interface QuestionMapper {


    @Insert("insert into question (title,description,gmt_create,gmt_modified,creator,comment_count,view_count,like_count,tag) " +
            "values (#{title},#{description},#{gmtCreate},#{gmtModified},#{creator},0,0,0,#{tag})")
     void create(Question question);


    @Select("select * from question limit  #{offset},#{size}")
    List<Question> list(@Param(value = "offset") Integer offset, @Param(value = "size")Integer size);

    @Select("select count(1) from question")
    Integer count();
}
