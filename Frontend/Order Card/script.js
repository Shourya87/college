const payButton = document.querySelector("#pay-btn");

payButton.addEventListener("click",function pay(){
    payButton.classList.add("clicked");
    payButton.textContent = "Processing...";
    setTimeout(() => {
        payButton.textContent = "Paid";
        payButton.removeEventListener("click",pay);
    }, 1500);
});



const aDefault = document.querySelectorAll("a");

aDefault.forEach((aDefault) => {
    aDefault.addEventListener("click",(e) => {
        e.preventDefault();
        aDefault.classList.add("clicked");
    });
})
