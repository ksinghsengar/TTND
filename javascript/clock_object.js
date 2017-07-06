clock = {}
clock.getTime = function ()
{
    var d = new Date();
    var dd = d.getDate();
    var month = d.getMonth();
    var year = d.getFullYear();
    var hours = d.getHours();
    var minutes = d.getMinutes();
    var sec = d.getSeconds();
    document.getElementById("timeDisp").innerHTML =  dd + ' ' + month + ', ' + year +' ' + hours + ':' +minutes + ':' + sec;
}
typeof(clock.getTime);
clock.getTime();
