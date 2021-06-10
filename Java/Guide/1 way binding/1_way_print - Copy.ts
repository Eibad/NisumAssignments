/*add in module
	
	import {FormsModule}   from '@angular/forms';
	imports: [
	    FormsModule
		  ],
*/

  //-----interpolution , 1 way binding-------------


    global = "eibad";
    obj1 = {name : "eibad", age : 11};
    array1 = [1,2,3];

  //-----interpolution , 1 way binding-------------

 value ;


addi(){

  this.value ++;
 }

 subti(){
  if(this.value !=0){
  this.value --;
  }
  else{
    alert("Invalid")
  }
 }
