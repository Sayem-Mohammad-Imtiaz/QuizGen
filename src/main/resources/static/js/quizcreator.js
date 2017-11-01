function getQuiz()
{
    $.ajax({
        url: "/quizgen/rest/quiz/",
        type: 'get',
        success: function( data ) {
            $("#content").html(data.quizName);
        }
    });
}