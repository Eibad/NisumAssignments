/*add in module
	
	import {FormsModule}   from '@angular/forms';
	imports: [
	    FormsModule
		  ],
*/
 first;
 second;
 result;

 add(){
    this.result = parseInt(this.first) + parseInt( this.second);

 }
 mul(){
  this.result = parseInt(this.first) * parseInt( this.second);

}
sub(){
  this.result = parseInt(this.first) - parseInt( this.second);

}
divide(){
  this.result = parseInt(this.first) / parseInt( this.second);

}
