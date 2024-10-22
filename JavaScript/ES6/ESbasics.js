var n1 = 999;  // global

function f1(){

    let n1 = 100;

    const  salary = 9000;

   
   // salary = 20000;  // const variables cannot be reinitialize its just like final Keyword in java

    console.log("n1 inside f1() "+n1);

    console.log("salary "+salary)

    if(true){

        let name = "javeed";
      

    }

    console.log("Name "+name);

    for (let index = 0; index <5; index++) {
       
        console.log(index)
        
    }


}

f1();

console.log("n1 outside "+n1);