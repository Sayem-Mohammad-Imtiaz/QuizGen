var chapters = ["None","Chapter 1","Chapter 2","Chapter 3", "Chapter 4"];
var num_cp_sel = 1;
var options_text;

$(document.body).on('mousedown', '#cb'+ num_cp_sel, function(event){
    var y = "cb" + num_cp_sel;
    var x = document.getElementById(y).checked;
    if(!x){
	   chapter_selected(event);
    }
})


function chapter_selected(event) {
	console.log("log");
    var selected_chapter = $("#select" + num_cp_sel).val();
    var index = chapters.indexOf(selected_chapter);
    if (index > -1){chapters.splice(index, 1);}
    chapter_generate();

}

 
function chapter_generate(){
    console.log("log");
    options_text = '';
    for (var i = 0; i < chapters.length ; i++) {
        options_text = options_text +'<option value="' + chapters[i] + '">' + chapters[i] + '</option>';
    }
    $("#cpsl").append(
        '<form class="uk-grid-margin" uk-grid>' +
        '<legend class="uk-legend">Select a chapter.</legend>' +
        '<select id="select'+ ++num_cp_sel +'" class="uk-select uk-width-1-3">' +
        '<option value="none">No Chapter Selected</option>'+
        options_text + '</select>' + '<div class="uk-width-2-3"></div>' +
        '<input class="uk-input uk-width-1-3" type="number" placeholder="Questions from chapter.">' +
        '<div class="uk-width-2-3"></div>' +
        '<p class="uk-text-muted"><input id="cb'+ num_cp_sel +'" class="uk-checkbox" type="checkbox">Add Chapter</p>' +
        '</form>'
        );

}
