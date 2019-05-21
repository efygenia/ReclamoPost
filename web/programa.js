class Reclamo {

    static envio() {
        console.log("Mensajito para saber que estamos dentrito.");
        let jsonReclamo = {};
        jsonReclamo.nombre = document.querySelector("#nombre").value;
        jsonReclamo.email = document.querySelector("#email").value;
        jsonReclamo.texto = document.querySelector("#reclamoTxt").value;

        console.log(jsonReclamo);

        let jsonReclamoConvertido = JSON.stringify(jsonReclamo);
        console.log(jsonReclamoConvertido);


        fetch("Reclamo",
                {method: "POST", body: jsonReclamoConvertido}
                        

        );
    }

    static main() {
        document.querySelector("#reclamarBtn").setAttribute("onclick", "Reclamo.envio();");
    }
}

Reclamo.main();

