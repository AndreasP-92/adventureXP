


//======== GET ALL ACTIVITIES ========

const mail = "javascript version af at hente en parameter"

const myUrl = `http://localhost:5002/select/activities/${mail}`;

const requestOptions = {
    'content-type': 'application/json',
    method: 'GET',
    redirect: 'follow'
};


fetch(myUrl, requestOptions)
    .then(response => response.json())
    .then(data => {
        gotActivityData(data)
    })

function gotActivityData(data){
    console.log('activities====',data)
    const activitiesMap = data.map(dd => dd.profile_email);
    document.getElementById('mail').value = mail;
    console.log('activitiesMap====',activitiesMap)
    // activitiesMap.forEach(fillDropDown)

}

// function fillDropDown(item, index){
//     const activitySelector = document.querySelector('.activiySelector')
//
//     let el = document.createElement("option");
//     el.textContent = item;
//     console.log("ITEM=====",item)
//     el.value = item;
//     activitySelector.appendChild(el);
// }