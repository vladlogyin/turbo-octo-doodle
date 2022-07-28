

function showProductById(id)
{
    var results = document.getElementById("results");
    var product;
    var req = new Request("/product/by-id/"+id,"GET");

    fetch(req)
        .then((resp)=>response.json())
        .then((product)=>{
            var titleHeading = document.createElement("h1");
            titleHeading.innerText=product.productName;
            var categoryImage = document.createElement("image");
            categoryImage.src = URL.createObjectURL(product.caregoryID.picture);
            results.appendChild(titleHeading);
            results.appendChild(categoryImage);
        })
        .catch(console.error);
}