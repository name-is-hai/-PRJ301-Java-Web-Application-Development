<%-- 
    Document   : PopUp
    Created on : Nov 2, 2022, 11:30:36 AM
    Author     : haiqd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.6.1/jquery.min.js"
                integrity="sha512-aVKKRRi/Q/YV+4mjoKBsE4x3H+BkegoM/em46NNlCqNTmUYADjBbeNefNxYV7giUp0VxICtqdrbqU7iVaeZNXA=="
        crossorigin="anonymous" referrerpolicy="no-referrer"></script>
    </head>
    <style>
        * {
            margin: 0;
            padding: 0;
        }

        .mess {
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%, -50%);
            opacity: 0;
            width: 400px;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 200px;
            border-radius: 20px;
            transition: 0.5s;
            background-color: rgba(255, 255, 255, 0.4);
            backdrop-filter: blur(5px);
            box-shadow: 0 25px 45px rgba(0, 0, 0, 0.1);
            border: 1px solid rgba(255, 255, 255, 0.3);
            border-bottom: 1px solid rgba(255, 255, 255, 0.2);
            z-index: 3;
        }
    </style>

    <body>
        <div class="mess">
            ${mess}
        </div>
    </body>
    <script>
        window.addEventListener('DOMContentLoaded', () => {
            setTimeout(() => {
//                document.querySelector('.mess').style.top = '50%';
                document.querySelector('.mess').style.opacity = 1;
            }, 1000)
        });

        window.onload = function () {
            var divToHide = document.querySelector('.mess');
            document.onclick = function (e) {
                if (e.target.class !== '.mess') {
                    //element clicked wasn't the div; hide the div
                    setTimeout(() => {
                        document.querySelector('.mess').style.top = '10%';
                        document.querySelector('.mess').style.opacity = 0;
                        document.body.style.backgroundColor = '';
                        // divToHide.style.display = 'none';
                    }, 300)
                }
            };
        };
    </script>

</html>