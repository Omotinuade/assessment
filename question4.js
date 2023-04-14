word= "Mississippi"
function findCount(word){
    sCount=0
    iCount=0
    for(var i=0; i< word.length; i++){
        if(word[i]== "s") sCount++
        else if(word[i]== "i") iCount++
    }
    console.log(`Count of s is ${sCount} while the count of i is ${iCount}`)
}

findCount(word)