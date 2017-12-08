$(document).ready(function () {
    calcularIframe();
});
$(window).resize(function() {
    calcularIframe();
});

function calcularIframe(){
    var width=$(window).width()-10;
    var height=$(window).height()-$('.content-header').height()-$('.content-footer').height()-25;
    $('#iframeContenido').width(width);
    $('#iframeContenido').height(height);
}

function accionMenu(url){
    $('#iframeContenido').attr('src',url);
}
