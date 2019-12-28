package life.wangqiang.community.community.mapper;

import life.wangqiang.community.community.model.Question;
import life.wangqiang.community.community.model.QuestionExample;

import java.util.List;

public interface QuestionExtMapper {

    int incView(Question record);

    int incCommentCount(Question record);

    List<Question> selectRelated(Question question);
}