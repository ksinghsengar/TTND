function checkPalindrom()
{
    var reverse="";
    var x = document.getElementById("string").value;
    
    for( var i = x.length; i >= 0; i-- )
    {
       var reverse = reverse + x.charAt(i);  
    }
    if(x == reverse)
    {
        alert('The String is palindrome.');
    }
    else{
          alert('The String is not palindrome!');
    }
}
 