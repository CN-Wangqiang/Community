/**
 * 通用回复方法
 * @param parentId
 * @param type
 * @param content
 */

function commtent2(parentId,type,content) {
    if (!content){
        alert("不能回复空内容");
        return;
    }
    $.ajax({
        type: "POST",
        url: "/comment",
        contentType:"application/json",
        data: JSON.stringify({
            "parentId":parentId,
            "content":content,
            "type":type
        }),
        success: function (response) {
            if (response.code == 200){
                window.location.reload();
            }else {
                if (response.code == 2003){
                    var isAccepted = confirm(response.message);
                    if (isAccepted){
                        window.open("https://github.com/login/oauth/authorize?client_id=faca48a9dbfefc7c20ac&redirect_uri=http://localhost:8887/callback&scope=user&state=1");
                        window.localStorage("closeable",true);
                    }
                }


                alert(response.message);
            }

        },
        dataType: "json"
    });
}
/**
 * 提交问题回复
 */
function post() {
    var questionId = $("#question_id").val();
    var content = $("#comment_content").val();
    commtent2(questionId,1,content)
}


/**
 * 提交评论回复
 * @param commentId
 */
function comment(e) {
    var commentId = e.getAttribute("data-id");
    var content = $("#input-" + commentId).val();
    commtent2(commentId,2,content);
}



function collapseComments(e) {
    var id = e.getAttribute("data-id");
    var comments = $("#comment-" + id);

    // 获取二级评论状态
    var collapse = e.getAttribute("data-collapse");
    if (collapse){
        comments.removeClass("in");
        e.removeAttribute("data-collapse");
        e.classList.remove("active");
    }else{
        var subCommentContainter = $("#comment-" + id);
        if (subCommentContainter.children().length != 1){
            comments.addClass("in");
            // 标记二级评论状态
            e.setAttribute("data-collapse","in");

            e.classList.add("active");
        }else{
            $.getJSON("/comment/" + id,function (data) {
                $.each(data.data.reverse(),function (index,comment) {

                    var mediaLeftElement = $("<div/>",{
                            "class" : "media-left",
                        }).append($("<img/>", {
                        "class": "media-object img-rounded",
                        "src": comment.user.avatarUrl
                    }));


                    var mediaBodyElement = $("<div/>",{
                        "class" : "media-body",
                    }).append($("<h5/>", {
                        "class": "media-heading",
                        "html": comment.user.name
                    })).append($("<div/>", {
                        "html": comment.content
                    })).append($("<div/>", {
                        "class" : "menu",
                    }).append($("<span/>", {
                        "class":"pull-right",
                        "html": moment(comment.gmtCreate).format('YYYY-MM-DD  HH:mm')
                    })));

                    var mediaElement = $("<div/>",{
                        "class" : "media",
                    }).append(mediaLeftElement).append(mediaBodyElement);

                    var commentElement = $("<div/>",{
                        "class" : "col-lg-12 col-md-12 col-sm-12 col-xs-12 comments",
                    }).append(mediaElement);

                    subCommentContainter.prepend(commentElement);
                });
                // 展开二级评论
                comments.addClass("in");
                // 标记二级评论状态
                e.setAttribute("data-collapse","in");

                e.classList.add("active");
            });
        }
    }
}