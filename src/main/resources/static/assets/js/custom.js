



// function loadMaterial(){
//     $.ajax({
//         url: "menu/loadMaterial",
//         method: 'GET',
//         beforeSend: function () {
//             $pageContent.display(loading);
//         },
//         success: function (data) {
//             $pageContent.display(data);
//         },
//         error: function () {
//             $pageContent.display(connectionError);
//             msgError('Oh No!', 'Error.');
//         }
//     });
    // msgSuccess("Hello", "Hii");
    // try{
    //     $.ajax({
    //         url: "menu/loadMaterial",
    //         method: 'GET',
    //         beforeSend: function () {
    //             msgSuccess("initiating", "");
    //             $pageContent.display(loading);
    //         },
    //         success: function (data) {
    //             msgSuccess("done", "");
    //             $pageContent.display(data);
    //         },
    //         error: function () {
    //             msgError('Oh No!', 'Error!');
    //             $pageContent.display(connectionError);
    //         }
    //     });
    // }
    // catch (e) {
    //     alert(e);
    // }
// }

// var $pageContent = $(".page-content");
// var $largeModal = $("#my-large-modal");
// var $simpleModal = $("#simpleModal");
//
// var loading = "<section class=\"wrapper site-min-height\"> " +
//     "<div class=\"row mt\"> " +
//     "<div class=\"col-sm-12 col-sm-12\"> " +
//     "<img class='center-block' src='/assets/images/loading.gif'/>" +
//     "</div>" +
//     "</div>" +
//     "</section>";
//
// var connectionError = "<section class=\"wrapper site-min-height\"> " +
//     "<div class=\"row mt\"> " +
//     "<div class=\"col-sm-12 col-sm-12\"> " +
//     "<img class='center-block' src='/assets/images/ErrorConnection.gif'/>" +
//     "</div>" +
//     "</div>" +
//     "</section>";
//
// function msgSuccess(title, text) {
//     PNotify.success({
//         title: title,
//         text: text
//     });
// }
//
// function msgInfo(title, text) {
//     PNotify.info({
//         title: title,
//         text: text
//     });
// }
//
// function msgError(title, text) {
//     PNotify.error({
//         title: title,
//         text: text
//     });
// }