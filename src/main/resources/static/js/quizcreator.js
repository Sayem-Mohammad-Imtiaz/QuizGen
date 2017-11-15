// Gets the content of the requested quiz
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

// Sends the stats from the graded quiz
function sendResults()
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


// These will be related to the data variable eventually
var questions = ["Question Text #1", "Question Text #2", "Question Text #3", "Question Text #4", "Question Text #5"]
var answers = ["Answer Text #1", "Answer Text #2", "Answer Text #3", "Answer Text #4"];
var correct_answers;


var quiz = $("#quiz");

for (var i=0; i<questions.length; i++) {
    quiz.append("<div id=\"quiz-question" + i + "\" class=\"uk-card uk-card-default uk-card-body\"></div>");
    var quiz_div = $("#quiz-question" + i);
    quiz_div.append("<h3 class=\"uk-card-title\">" + questions[i] + "</h3>");
    quiz_div.append("<p id=\"quiz-para" + i + "\"></p>");
    var quiz_para = $("#quiz-para" + i);
    for (var j=0; j<answers.length; j++){
        quiz_para.append("<label><input class=\"uk-radio\" type=\"radio\" name=\"radio" + i + "\">  " + (j+1) + ") " + answers[j] + "</label><br>");
    }
}
