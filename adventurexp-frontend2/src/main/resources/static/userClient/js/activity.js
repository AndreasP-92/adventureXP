const thisForm = document.getElementById('activityForm');
const activity_name = document.getElementById('activity_name');
const activity_pic = document.getElementById('activity_pic');

thisForm.addEventListener('submit', async function (e) {
    e.preventDefault();
    const formData = new FormData(thisForm).entries()
    const filename = activity_pic.files[0].name;
    console.log(filename)

    fetch('http://localhost:5002/insert/activity', {
        method: 'POST',
        body: JSON.stringify({
                'activity_name': activity_name.value,
                'activity_pic': filename
        }),
        headers: {
            'Content-type': 'application/json; charset=UTF-8'
        }
    }).then(function (response) {
        if (response.ok) {
            return response.json();
        }
        return Promise.reject(response);
    }).then(function (data) {
        thisForm.submit();
        console.log(data);
    }).catch(function (error) {
        console.warn('Something went wrong.', error);


    });
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

