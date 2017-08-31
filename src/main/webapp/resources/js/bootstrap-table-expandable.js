(function ($) {
    $(function () {
        $('.table-expandable').each(function () {
            var table = $(this);
            table.children('thead').children('tr').append('<th></th>');
            table.children('tbody').children('tr').filter(':odd').hide();
            table.children('tbody').children('tr').filter(':even').find('.show-details').click(function () {
                var element = $(this).parent().parent();
                element.next('tr').toggle('slow');
                element.find(".table-expandable-arrow").toggleClass("up");
            });
            table.children('tbody').children('tr').filter(':even').find('.show-details').each(function () {
                var element = $(this).parent().parent();
                element.append('<td><div class="table-expandable-arrow"></div></td>');
            });
        });
    });
})(jQuery); 