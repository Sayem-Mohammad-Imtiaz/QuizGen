// Get the current stats from the server
function getStats()
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

// Array of the correct answers
var correct_answers = [1];


// These will be related to the data variable eventually
var questions = ["Question Text #1", "Question Text #2", "Question Text #3", "Question Text #4", "Question Text #5"];
var answers = ["Answer Text #1", "Answer Text #2", "Answer Text #3", "Answer Text #4"];


var stats = $("#stats");

for (var i=0; i<questions.length; i++) {
    stats.append("<div id=\"quiz-question" + i + "\" class=\"uk-card uk-card-default uk-card-body\"></div>");
    var quiz_div = $("#quiz-question" + i);
    quiz_div.append("<h3 class=\"uk-card-title\">" + questions[i] + "</h3>");
    quiz_div.append("<table id=\"quiz-para" + i + "\"></p>");
    var quiz_table = $("#quiz-para" + i);
    for (var j=0; j<answers.length; j++){
        quiz_table.append("<tr id=\"quiz" + i + "-row" + j + "\"></tr>")
        quiz_table.append("<td>" + (j+1) + ") " + answers[j] + "</td><br>");
        if (correct_answers[j] == (j+1)) {
            quiz_table.append("<td> 100% <div class=\"stats-bar-green\" style=\"width:100px\"></div></td>");

        } else {
            quiz_table.append("<td> 100% <div class=\"stats-bar-red\" style=\"width:100px\"></div></td>");
        }

    }
    // Adds an Did Not Answer option
    quiz_table.append("<tr id=\"quiz" + i + "-row" + 5 + "\"></tr>")
    quiz_table.append("<td>5) Did Not Answer</td><br>");
    quiz_table.append("<td> 100% <div class=\"stats-bar-grey\" style=\"width:100px\"></div></td>");
}
