document.querySelector("#clearButton").addEventListener("click", function() {
    document.querySelectorAll(".converted").forEach(function(element) {
        element.remove()
    });
    document.querySelector("#convertedNumber").classList.add("d-none");
});

document.querySelector("#convertButton").addEventListener("click", function() {
    const data = {};
    data["query"] = document.querySelector("#query").value;
    if(data["query"] === "") {
        alert("Please enter a query");
        return;
    }
    fetch("/convert?query=" + data["query"], {
        method: "POST",
        headers: {
            "Content-Type": "application/x-www-form-urlencoded"
        }
    }).then(async response => {
        document.querySelector("#convertedNumber").classList.add("is-active");
        const newH1 = document.createElement("h1");
        let newContent = await response.text();
        newContent += " - " + data["query"];
        newH1.innerHTML = newContent;
        newH1.classList.add("converted");
        document.querySelector("#ajaxForm").prepend(newH1);
        document.querySelector("#convertedNumber").classList.remove("d-none");
    }).catch(error => function (error) {
      alert("An error occurred while converting the query. Please try again later.");
    })
})