const thisForm = document.getElementById('activityForm');
const activity_name = document.getElementById('activity_name');
const activity_pic = document.getElementById('activity_pic');
const activity_avail_start = document.getElementById('activity_avail_start');
const activity_avail_end = document.getElementById('activity_avail_end');
const activity_min_age = document.getElementById('activity_min_age');
const activity_group_size = document.getElementById('activity_group_size');
const activity_desc = document.getElementById('activity_desc');
alert("test")


thisForm.addEventListener('submit', async function (e) {
    e.preventDefault();
    const filename = activity_pic.files;

    console.log(filename)

    // fetch('http://localhost:5002/insert/activity', {
    //     method: 'POST',
    //     body: JSON.stringify({
    //         'activity_name': activity_name.value,
    //         'activity_avail_start': activity_avail_start.value,
    //         'activity_avail_end': activity_avail_end.value,
    //         'activity_min_age': activity_min_age.value,
    //         'activity_group_size': activity_group_size.value,
    //         'activity_desc': activity_desc.value,
    //         'activity_pic': filename
    //     }),
    //     headers: {
    //         'Content-type': 'application/json; charset=UTF-8'
    //     }
    // }).then(function (response) {
    //     if (response.ok) {
    //         return response.json();
    //     }
    //     return Promise.reject(response);
    // }).then(function (data) {
    //     thisForm.submit();
    // }).catch(function (error) {
    //     console.warn('Something went wrong.', error);
    //
    //
    // });
});



// function previewFile() {
//     var preview = document.querySelector('img');
//     var file    = document.querySelector('input[type=file]').files[0];
//     var reader  = new FileReader();
//
//     reader.onloadend = function () {
//         preview.src = reader.result;
//     }
//
//     if (file) {
//         reader.readAsDataURL(file);
//     } else {
//         preview.src = "";
//     }
// }

