$(document).ready(function(){

	/*Sin bootstrap*/
    $(".showpassword").each(function(index,input) {
        var $input = $(input);
        $("<p class='opt'/>").append(
            $("<input type='checkbox' class='showpasswordcheckbox' id='showPassword' />").click(function() {
                var change = $(this).is(":checked") ? "text" : "password";
                var rep = $("<input placeholder='Password' type='" + change + "' />")
                    .attr("id", $input.attr("id"))
                    .attr("name", $input.attr("name"))
                    .attr('class', $input.attr('class'))
                    .val($input.val())
                    .insertBefore($input);
                $input.remove();
                $input = rep;
             })
        ).append($("<label for='showPassword'/>").text("Show password")).insertAfter($input.parent());
    });
	
	$('#showPassword').click(function(){
	    if($("#showPassword").is(":checked")) {
	        $('.icon-lock').addClass('icon-unlock');
	        $('.icon-unlock').removeClass('icon-lock');    
	    } else {
	        $('.icon-unlock').addClass('icon-lock');
	        $('.icon-lock').removeClass('icon-unlock');
	    }
	});

	/*Con bootstrap*/
	$(".showPass").each(function(index,checkbox) {
		$(checkbox).on("click", function(event){
			var $target=$($(event.target).attr("data-target"));
            var change=$(event.target).is(":checked") ? "text" : "password"; 
            var rep = $("<input placeholder='Password' type='" + change + "' />")
                .attr("id", $target.attr("id"))
                .attr("name", $target.attr("name"))
                .attr('class', $target.attr('class'))
                .val($target.val())
                .insertBefore($target);
            $target.remove();
		})
	});
	
	
	/* Funcionalidades de login. solo bootstrap */
	$(".loginBootstrap #formButtons input[type=submit]").on("click", function(event){
		var url = $(this).attr("data-url");
		var usuario = $(".loginBootstrap #formInputs input[name=login]").val();
		var password = $(".loginBootstrap #formInputs input[name=password]").val();
		
		if(url!="" && password!=""){	

			$.ajax({
				type : "GET",
				url : url,
			    contentType: "application/x-javascript",
			    dataType : 'jsonp',
			    jsonCallback: "callback",
			    jsonp: true,
				data : {
					usuario : usuario,
					password : password,
					callback: "callback",
				},
				success:callback
			}).error(function(jqXHR, textStatus, errorThrown){
	        });
			
		} else{
			
		}
		event.preventDefault();
		return false;		

	});
});
function callback(msg){
	var respuesta = msg;
	
	if(respuesta.estado){

		var usuario = $(".loginBootstrap #formInputs input[name=login]").val();
		createCookie("user", usuario, 30);
		window.location.replace("http://localhost:8080/Ejericio1/Ejercicio5Servlet");
		
	} else {
		$.each($(".alert"), function( index, value ) {
			  value.remove();
			});
		$("body").append(creaError(msg.error));
	}
};


function creaError(mensaje){

	var alert = $.parseHTML('<div class="alert alert-danger" role="alert">'+
								'<button type="button" class="close" data-dismiss="alert" aria-label="Close">'+
									'<span aria-hidden="true">×</span>'+
								'</button>'+
								'<h4>Error:</h4>'+
								'<p class="bodyAlert">'+mensaje+'</p>'+
							'</div>'	
						);
	
	return alert;
}

function createCookie(name, value, days) {
    var expires;

    if (days) {
        var date = new Date();
        date.setTime(date.getTime() + (days * 24 * 60 * 60 * 1000));
        expires = "; expires=" + date.toGMTString();
    } else {
        expires = "";
    }
    document.cookie = encodeURIComponent(name) + "=" + encodeURIComponent(value) + expires + "; path=/";
}

function readCookie(name) {
    var nameEQ = encodeURIComponent(name) + "=";
    var ca = document.cookie.split(';');
    for (var i = 0; i < ca.length; i++) {
        var c = ca[i];
        while (c.charAt(0) === ' ') c = c.substring(1, c.length);
        if (c.indexOf(nameEQ) === 0) return decodeURIComponent(c.substring(nameEQ.length, c.length));
    }
    return null;
}

function eraseCookie(name) {
    createCookie(name, "", -1);
}