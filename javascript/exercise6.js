function verify()
{
    var uname =  document.getElementById("uname").value;
    var uage =  document.getElementById("uage").value;
    var age = parseInt(uage);
    if(uname.length < 1 )
    {
        alert("User Name is Empty!! ");
      
        return;
    }

    else if(age < 18)
    {
       alert("Age is less than 18!!");
       return;
    }

    
   
}