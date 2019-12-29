package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.Comment;


public interface CommentExtMapper {
    int incCommentCount(Comment record);
}