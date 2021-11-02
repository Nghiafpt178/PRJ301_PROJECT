function createPaggerNews(div, pageindex, gap, totalpage)
{
    var container = document.getElementById(div);
    //container.innerHTML = pageindex + ' ' + gap + ' '+ totalpage;
    if (pageindex - gap > 1)
        container.innerHTML += '<a href="newsManager?page=1">First</a>';



    for (var i = pageindex - gap; i < pageindex; i++)
    {
        if (i > 0)
            container.innerHTML += '<a style="background: whitesmoke; padding: 10px; margin-bottom: 30px;" href="newsManager?page=' + i + '">' + i + '</a>';
    }
    container.innerHTML += '<span>' + pageindex + '</span>';

    for (var i = pageindex + 1; i <= pageindex + gap; i++)
    {
        if (i <= totalpage)
            container.innerHTML += '<a style="background: whitesmoke; padding: 10px; margin-bottom: 30px;" href="newsManager?page=' + i + '">' + i + '</a>';
    }
    if (pageindex + gap < totalpage)
        container.innerHTML += '<a style="background: whitesmoke; padding: 10px; margin-bottom: 30px;" href="newsManager?page=' + totalpage + '">Last</a>';
}