let cart = JSON.parse(
    localStorage.getItem("cart")
) || [];

let items = document.getElementById("cartItems");
let total = 0;

cart.forEach(function(item) {

    let p = document.createElement("p");

    p.innerText =
        item.name + " - ₹" + item.price;

    items.appendChild(p);

    total += item.price;
});

document.getElementById("total").innerText = total;

function placeOrder() {

    if (cart.length === 0) {
        alert("Your cart is empty!");
        return;
    }

    alert("Order placed successfully!");

    localStorage.removeItem("cart");
    window.location.reload();
}