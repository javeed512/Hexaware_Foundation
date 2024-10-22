

function f1(flag){

console.log("f1 is taking callback func as parameter")

}


const  isValid = ()=>{return true};


f1(()=>{return true});
f1(isValid);



let p = new Promise((resolve, reject) => {
    setTimeout(() => {
    resolve(10);
    }, 3 * 100);
});

p.then((result) => {
    console.log(result);
    return result * 2;
    }).then((result) => {
    console.log(result);
    return result * 3;
    })