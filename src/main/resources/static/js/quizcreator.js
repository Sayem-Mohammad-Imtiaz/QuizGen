function getChapters()
{
    $.ajax({
        url: "/quizgen/rest/quiz/chapter/",
        type: 'get',
        success: function( data ) {
            for(var i=0;i<data.length;i++)
                $(".chapters").append("<option value='"+data[i].chapterID + "'> Chapter "+data[i].chapterID+"</option>");
        }
    });
}
// Gets the content of the requested quiz
function generateQuiz()
{
    var cs=$("option:selected").map(function(){ return this.value }).get().join(", ");
    var quizParam={
        chapterIds: $("#chapters").val(),
        numQuestions: $('#numq').val()
    };
    $.ajax({
        url: "/quizgen/rest/quiz/",
        type: 'post',
        data: JSON.stringify(quizParam),
        success: function( data ) {
            $("#content").html("Chapter "+data[0].chapterID + " has "+ data[0].numQuestions + " questions");
        }
    });
}
function getFormData($form){
    var unindexed_array = $form.serializeArray();
    var indexed_array = {};

    $.map(unindexed_array, function(n, i){
        indexed_array[n['name']] = n['value'];
    });

    return indexed_array;
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

function validateFirstForm(type)
{

    var $v=$("#form"+type);
    var vv=$v.find("option:selected").val();
    if(vv==undefined || vv==null ||vv=='')
    {
       // $('select').focus();
        UIkit.modal.alert("Please choose chapter(s)!");
        return false;
    }
    vv=$v.find("input.numc").val();
    if(vv==undefined || vv==null ||vv=='')
    {
        //$('input').focus();
        UIkit.modal.alert("Please enter number of questions!");
        return false;
    }
    if(type==1) {
        vv=$v.find("input.numq").val();
        if (vv == undefined || vv == null || vv == '') {
            //$('input').focus();
            UIkit.modal.alert("Please enter quiz number!");
            return false;
        }
    }
}
