

// javascript function 
function sum(x, ...y) {
    let result = x;
    for(let i of y) {
        result = result + i;
    }
    return result;
}
function test(a, b, c, ...d) {
    console.log('a = '+a+', b = '+b+', c = '+c+', d = '+d);
}
export function Demo() {
   
   let emp = { id: 100, name: "Raj", address : {state: "KA", city : "pin"}};

    return (<div>
      <p>Lattitude { emp?.address?.geo?.long} </p>
    </div>)
}