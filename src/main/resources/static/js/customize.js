(function () {
    var api = {
        alert: function (title, content, target) {
            $("#myModal2").modal('show');
            $('#myModal2').on('shown.bs.modal', function () {
                $(this).find('.modal-header #myModalLabel2').text(title);
                $(this).find('.modal-body #message').text(content);
            }).on('hidden.bs.modal', function () {
                window.location.href = "/login";
            });
        }
    }
    this.$ = api;
})();
