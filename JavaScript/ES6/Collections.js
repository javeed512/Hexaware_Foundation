

let  list = [2,4,6,8,10];

console.log(list);


let  set  = new Set();

set.add("king");
set.add(100);
set.add(4.55);
set.add(new Date());

console.log(set);

set.forEach( e1 =>{console.log(e1)});



let  map = new Map();


map.set(101,'king');
map.set(102,'ford');
map.set(103,'javeed');
map.set(104,'smith');

console.log(map)

 let  setOfKeys = map.keys();

    console.log(setOfKeys)

         for (const key of setOfKeys) {  // always use  for of loop with iterators
            
            console.log(key +" "+map.get(key))
         }