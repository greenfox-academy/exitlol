export{};
'use strict';

let shopItems: any[] = ['Cupcake', 2, 'Brownie', false];

// Accidentally we added "2" and "false" to the array.
// Your task is to change from "2" to "Croissant" and change from "false" to "Ice cream"
// No, don't just remove the items :)
// Create a function called sweets() which takes the list as a parameter.
// Expected output: "Cupcake", "Croissant", "Brownie", "Ice cream"

// console.log(typeof shopItems[1]);


function sweets (shopItems) {
  for(let i: number = 0; i < shopItems.length; i++) {
    if(typeof shopItems[i] === 'number') {
      shopItems.splice(i, 1, 'Croissant');
    } 
  }
  for (let j: number = 0; j < shopItems.length; j++) {
    if(typeof shopItems[j] === 'boolean') {
      shopItems.splice(j, 1, 'Ice cream')
    }
  }
  return shopItems;
}
console.log(sweets(shopItems));