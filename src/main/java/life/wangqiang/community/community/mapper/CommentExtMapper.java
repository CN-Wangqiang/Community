package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.Comment;
import life.wangqiang.community.community.model.CommentExample;
import life.wangqiang.community.community.model.Question;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface CommentExtMapper {
    int incCommentCount(Comment comment);
}