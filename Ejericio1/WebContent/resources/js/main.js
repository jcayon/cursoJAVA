$(document).ready(function(){

	$(".input-group .remove").on("click", function(event){
		
		$(this).parents(".input-group").find("input").val("");
		
	});
	
});