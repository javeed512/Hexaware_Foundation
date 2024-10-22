

function add(a, b = 1){


    return a+b;

}

var result = add(4);

console.log("Result "+result)


// spread operator or rest parameter  // in java its known var arguments

function   sum(name,city , ...a){     // a[]

        console.log("Length of a "+a.length);


}

sum("king","hyderabad",40,70,90);

function  literals(){

    let  str1 = "javeed";
    let  str2 = new String("javeed");

    let num1 = 100;
    let num2 = new Number(100);


}

function  func_arr(){

     const   arr = [2,5,7,3,4,8,9,1];

     console.log("Normal For Loop")
    for (let index = 0; index < arr.length; index++) {
        
            console.log(arr[index])
        
    }

    console.log("For Each Loop");


        arr.forEach(n => {
            console.log(n);
        });


        console.log("For of");

            for (const e1 of arr) {
                console.log(e1)
            }


}

func_arr();



const fun =   (x,y) => {

        console.log("HI am arrow func")

  }

//    fun =  (a,b)=>{

//         console.log("I hacked your func")
//    }


  fun(4,5);