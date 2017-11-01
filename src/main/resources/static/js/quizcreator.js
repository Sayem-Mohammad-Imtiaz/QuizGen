function getQuiz()
{
    $.ajax({
        url: "/quizgen/rest/quiz/",
        type: 'get',
        data: {questionNo: 2},
        success: function( data ) {
            $("#content").html(data.quizName);
        }
    });
}