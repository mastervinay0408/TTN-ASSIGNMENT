(function(){
	var obj1 = {Name:"vinay", Age: 21, Company: "TTN"};

	var obj2 = obj1;

	for(var prop in obj2){
		console.log(prop + ":"+obj2[prop]);
	}
}() );
