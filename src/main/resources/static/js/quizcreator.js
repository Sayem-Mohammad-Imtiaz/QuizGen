function getQuiz()
{
    $.ajax({
        url: "/quizgen/rest/quiz/",
        type: 'get',
        data: {chapterNo: 4, qNo: 10}
        done: function( data ) {
            $("#content").html(data.quizName);
        }
    });
}