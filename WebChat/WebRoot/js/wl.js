 window.onload = function(){   
                var arrIcon = ['image/wyh.PNG','image/lxw.PNG'];   
                var num = 0;     //控制头像改变   
                var iNow = -1;    //用来累加改变左右浮动   
                var icon = document.getElementById('user_face_icon').getElementsByTagName('img');   
                var btn = document.getElementById('btn');   
                var text = document.getElementById('text');   
                var content = document.getElementsByTagName('ul')[0];   
                var img = content.getElementsByTagName('img');   
                var span = content.getElementsByTagName('span');   
      
                icon[0].onclick = function(){   
                    if(num==0){   
                        this.src = arrIcon[1];   
                        num = 1;   
                    }else if(num==1){   
                        this.src = arrIcon[0];   
                        num = 0;   
                    }                   
                }   
                btn.onclick = function(){   
                    if(text.value ==''){   
                        alert('不能发送空消息');   
                    }else {   
                        content.innerHTML += '<li><img src="'+arrIcon[num]+'"><span>'+text.value+'</span></li>';   
                        iNow++;   
                        if(num==0){   
                            img[iNow].className += 'imgright';   
                            span[iNow].className += 'spanright';   
                        }else {   
                            img[iNow].className += 'imgleft';   
                            span[iNow].className += 'spanleft';   
                        }   
                        text.value = '';   
         // 内容过多时,将滚动条放置到最底端   
         contentcontent.scrollTop=content.scrollHeight;     
                    }   
                }   
            }   