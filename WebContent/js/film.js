$('#test1').click(function() {
	var film = {};
	var tmp = window.document;

	film.filmImg =  $('#filmImg').val();
	film.filmName = $('#filmName').val();
	film.filmLong = $("#filmLong").val();
	film.director = $("#director").val();
	film.actor = $("#actor").val();

	$.post({
		url : "/HSSM/Filmadd",
//		method: post,
//		data: JSON.stringify(film),
		success : function(result) {
//			$("#div1").html(result);
			alert(result)
		}
	});
});