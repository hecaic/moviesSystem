$('#Ptime').change(
		function() {
			var ptime = $('#Ptime').find("option:selected").val();
			$.ajax({
				type : 'post',
				url : "listFindStarTime",
				dataType : 'json',
				data : {
					time : ptime
				},
				success : function(res) {
					var data = res.data;
					$('#ttime').html('');
					for (var i = 0; i < data.length; i++) {
						$('#ttime').append(
								'<option value="' + data[i].starTime + '">'
										+ data[i].starTime + '</option>');
					}
				},
				error : function() {
					alert('111')
				}
			});
		});