

class  Employee{

    id;
    name;

  constructor(id,name){
    this.id = id;
    this.name = name;


  }


    setName(name){

        this.name = name;
    }

    getName(){

        return this.name;

    }

    static createAnonymous(gender) {
        let name = gender == "male" ? "John" : "Janny";
        return new Employee(102,name);
     }



}

let  emp = new Employee();
console.log(emp)

let emp2 = new Employee(101,'king');

console.log(emp2)
console.log(emp2.getName())


let  emp3 = Employee.createAnonymous("male");
console.log(emp3);