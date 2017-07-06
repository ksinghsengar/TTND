function calc_area()
{
    var r = document.getElementById("radius").value;
    r = parseInt(r);
    var area = 3.14 * r * r;
    alert("Area is: "+ area);
    
}