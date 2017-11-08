function getQuiz()
{
    $.ajax({
        url: "/quizgen/rest/quiz/chapter/",
        type: 'get',
        //data: {questionNo: 2},
        success: function( data ) {
            $("#content").html("Chapter "+data[0].chapterID + " has "+ data[0].numQuestions + " questions");
        }
    });
}