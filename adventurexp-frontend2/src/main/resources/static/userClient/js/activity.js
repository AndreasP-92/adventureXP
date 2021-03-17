const thisForm = document.getElementById('activityForm');
const activity_name = document.getElementById('activity_name');
const activity_pic = document.getElementById('activity_pic');

console.log(activity_name.value)

// alert("test")
thisForm.addEventListener('submit', async function (e) {
    e.preventDefault();
    const formData = new FormData(thisForm).entries()

    fetch('http://localhost:5002/insert/activity', {
        method: 'POST',
        body: JSON.stringify({
                'activity_name': activity_name.value
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
        console.log(data);
    }).catch(function (error) {
        console.warn('Something went wrong.', error);
    });
    console.log($(input[type=file]).val())
    $.ajax({
        url: "http://localhost:5002/file-upload",
        type: "POST",
        data: activity_pic.value,
        enctype: 'multipart/form-data',
        processData: false,
        contentType: false,
        cache: false,
        success: function (res) {
            console.log(res);
        },
        error: function (err) {
            console.error(err);
        }
    });
});

