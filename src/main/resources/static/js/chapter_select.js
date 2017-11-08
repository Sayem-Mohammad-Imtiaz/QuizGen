var chapters = ["Chapter 1","Chapter 2","Chapter 3", "Chapter 4"]

$(document.body).on('mousedown', '#cb1', function(event){
	chapter1_selected(event);
})

function chapter1_selected(event) {
	console.log("log");
    if ($("#ch2").is(':visible')) {
        $("#ch2").css("display", 'none');
    }
    else {
        $("#ch2").show();
    }
}
$(document.body).on('mousedown', '#cb2', function(event){
	chapter2_selected(event);
})

function chapter2_selected(event) {
	console.log("log");
    if ($("#ch3").is(':visible')) {
        $("#ch3").css("display", 'none');
    }
    else {
        $("#ch3").show();
    }
}

function chapter_generate(){

}
