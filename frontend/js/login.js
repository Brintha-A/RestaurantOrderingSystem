function loginUser(event) {

    event.preventDefault();

    let email =
        document.getElementById("email").value;

    let password =
        document.getElementById("password").value;

    let message =
        document.getElementById("message");

    if (email === "admin@gmail.com" &&
        password === "1234") {

        message.innerText =
            "Login successful!";

        message.style.color = "green";

    } else {

        message.innerText =
            "Invalid email or password!";

        message.style.color = "red";
    }
}