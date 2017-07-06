function calc_interest()
{
    var amount = prompt("Enter the Amount");
    var interest = prompt("Enter the interest rate");
    var years = prompt("Enter No. of Years");
    var s_interest = (amount * interest *years)/100;
    document.getElementById("b").innerHTML = s_interest;
}