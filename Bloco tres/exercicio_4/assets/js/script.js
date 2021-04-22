/*var varialvel global, let a(varial) apenas no escopo e cont (contante) global*/

let nome = window.document.getElementById('nome')
let email = document.querySelector('#email')/*so coloca # utilizando query*/
let assunto = document.querySelector('#assunto')
let nomeOk = false
let emailOk = false
let assuntoOk = false

let mapa = document.querySelector('#mapaGoole')


/*coletando elento nome por tag
getElementBytagName()
por nome getElementsByName()
por classe getElementsByClassName()
*/

//elemento como tamanho de 100% da divi

nome.style.width = '90%'
email.style.width = '90%'
assunto.style.width = '90%'

function validaNome() {
    let txt = document.querySelector('#txtNome')
    if (nome.value.length <= 2) {


        txt.innerHTML = 'X'
        txt.style.color = 'red'
    } else {
        txt.innerHTML = '✓'
        txt.style.color = 'green'
        nomeOk = true

    }
}

function validaEmail() {
    let txtEmail = document.querySelector('#txtEmail')
    if (email.value.indexOf('@') == -1 || email.value.indexOf('.') == -1) {
        txtEmail.innerHTML = 'X'
        txtEmail.style.color = 'red'

    } else {
        txtEmail.innerHTML = '✓'
        txtEmail.style.color = 'green'
        emailOk = true
    }
}

function validaAssunto() {
    let txtAssunto = document.querySelector('#txtAssunto')
    if (assunto.value.length >= 100) {
        txtAssunto.innerHTML = 'Maximo 100 caracteres'
        txtAssunto.style.color = 'red'
        txtAssunto.style.display = 'block'
    } else {
        txtAssunto.style.display = 'none'
        assuntoOk = true
    }

}

function enviar() {
    if (nomeOk == true && emailOk == true && assuntoOk==true) {
        alert('Formulario enviado com sucesso')
    } else {
        alert('!Preencha o formulario corretamente')
    }
}

function zoom(){

    mapa.style.width = '600px'
    mapa.style.height = '450px'
    window.scrollTo(0,400)
}

function mapaNormal(){
    
    mapa.style.width = '400px'
    mapa.style.height = '250px'
    window.scrollTo(0,100)
}