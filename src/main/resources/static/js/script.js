"use strict";


const tabs = document.querySelectorAll('.tabheader__item'),
    tabsContent = document.querySelectorAll('.tabcontent'),
    tabsParent = document.querySelector('.tabheader__items');

//функция скрытия табов
function hideTabContent(){
    tabsContent.forEach(item => {
        // item.style.display = 'none'; //скроет весь конт с классами tabcontent(используетinline стили,передел)
        item.classList.add('hide');//добавили в css в конце классы hide,show и fade
        item.classList.remove('show','fade');//fade - отвечает за медленный переход(добавили в css в конце)
    });
    tabs.forEach(item => {
        item.classList.remove('tabheader__item_active'); //улаляем из классов класс активности
    });
}
//функция показа табов
function showTabContent(i = 0){ // i=0 говорит, что если вызовим функцию без аргументов, то подставит 0
    // tabsContent[i].style.display = 'block';//(использует inline стили,переделаем)
    tabsContent[i].classList.add('show','fade');
    tabsContent[i].classList.remove('hide');
    //конец переделки
    //добавляем обратно класс активности
    tabs[i].classList.add('tabheader__item_active');
}

hideTabContent();
showTabContent();

//это обработчик события клика (мы делегировали на него событие при нажатии на одну из кнопок)
tabsParent.addEventListener('click',(even) => {
    const target = event.target;
    if(target && target.classList.contains('tabheader__item')){
        tabs.forEach((item,i) => { //item - это эл-ь перебора, i - это его номер в переборе
            if(target == item){
                hideTabContent();
                showTabContent(i);
            }
        });
    }
});

