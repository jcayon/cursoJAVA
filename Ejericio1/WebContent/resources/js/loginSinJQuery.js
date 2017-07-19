//var p = document.getElementsByTagName("label");
//for(var i in p){
//	  if (p.hasOwnProperty(i)) {
//			p[i].style.color = "red";
//	  }
//}

	var p = document.getElementsByTagName("label");
	for(var i in p){
		  if (p.hasOwnProperty(i)) {
				p[i].onmouseover = function(event){
					event.target.style.color = "red";
				};
		  }
	}

	
	for(var i in p){
		  if (p.hasOwnProperty(i)) {
				p[i].onmouseout = function(event){
					event.target.style.color = "black";
				};
		  }
	}