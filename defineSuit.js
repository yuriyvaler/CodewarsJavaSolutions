//https://www.codewars.com/kata/5a360620f28b82a711000047
function defineSuit(card) {
    if(card.includes('♣')) return 'clubs';
    if(card.includes('♦')) return 'diamonds';
    if(card.includes('♥')) return 'hearts';
    if(card.includes('♠')) return 'spades';
}