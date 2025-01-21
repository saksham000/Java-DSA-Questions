function cal(arr) {
  arr.map((i) => {
    if(i >=75){
        console.log(`${i} - pass`)
    }else{
        console.log(`${i} - fail`)
    }
  });

  const rest = arr.reduce((inital,iter) =>{
    return inital+iter
 },0)
  return rest
}


arr = [61, 82, 33, 94, 75];

const ans = cal(arr)
console.log(ans)

