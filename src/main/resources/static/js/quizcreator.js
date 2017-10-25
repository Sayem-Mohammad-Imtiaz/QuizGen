$.ajax({
  url: "http://fiddle.jshell.net/favicon.png",
  beforeSend: function( xhr ) {
    xhr.overrideMimeType( "text/plain; charset=x-user-defined" );
  }
})
  .done(function( data ) {
    if ( console && console.log ) {
      console.log( "Sample of data:", data.slice( 0, 100 ) );
    }
  });


var quiz = {};

for (var i=0; i<Object.keys(data).length; i++) {
    var question = {};
    var question_text = data[i];
    var answers = {};
    for (var j=0; j<Object.keys(data[i]).length; j++) {
        answers.push()
    }
}
