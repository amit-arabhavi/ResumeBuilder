<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <script src="https://code.jquery.com/jquery-1.12.4.min.js" integrity="sha256-ZosEbRLbNQzLpnKIkEdrPv7lOy9C27hHQ+Xp8a4MxAQ=" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/jqueryui/1.12.1/jquery-ui.min.js"></script>
    <link rel="stylesheet" href="https://pro.fontawesome.com/releases/v5.10.0/css/all.css" integrity="sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p" crossorigin="anonymous"/>
    
    <!-- Latest compiled and minified CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
    
    <link rel="stylesheet" href="main.css">
    <script type="text/javascript" src="res\main.js"></script>
    <script type="text/javascript">
        function download() {
            var data = {
                    "name" : "suraj chavan",
                    "email":"test@mail.com",
                    "phoneNumber":"79865425",
                    "addressLine": "AP- batkanangale Tal Gadhinglaj",
                    "zip" : "416503",
                    "city": "kolhapur",
                    "birthDate" : "27-apr-1994",
                    "gender": "Male",
                    "nationality" : "Indian",
                    "maritalStatus": "Single",
                    "title" : "Description / resume goals"}
            $.ajax({
                url: "/ResumeBuilder/getPdf",
                type :"GET",
                cache: false,
                contentType:"application/json",
               
                success: function (data) {
                    console.log(data);
                    //Convert the Byte Data to BLOB object.
                    var blob = new Blob([data], { type: "application/pdf" });
 
                    //Check the Browser type and download the File.
                    var isIE = false || !!document.documentMode;
                    if (isIE) {
                        window.navigator.msSaveBlob(blob, fileName);
                    } else {
                        var url = window.URL || window.webkitURL;
                        link = url.createObjectURL(blob);
                        var a = $("<a />");
                        a.attr("download", "resume.pdf");
                        a.attr("href", link);
                        $("body").append(a);
                        a[0].click();
                        $("body").remove(a);
                    }
                },error:function(error){
                	console.log(error)
                }
            }); 
        }
    </script>
</head>
<body>
    <header class="header">
        <div class="grid">
            <div class="div_logo"></div>
            <div class="div_menu">
                <h1 class="text_center header"> Resume Builder</h1>
            </div>
            <div></div>
        </div>
    </header>
    <section class="grid text_center">
        <h1 class="text_center header"> Resume Templates</h1>
        <p class="text_center">Pick a resume template, fill it out, and format.
            <strong> Create a professional resume in a few clicks.</strong> Just choose one of 2 resume templates below, add ready-made content, download, and get the job.</p>
    </section>
    <section>
    <div class="main_grid">
        
            <div class="grid_row">
                <section class="template_grid">
                    <a href="Filler.html">
                        <div class="tempale_box">
                            <img src="res/casade.png" class="template_img">
                        </div>
                        <h2>Cascade</h2>
                        <p> Sample template to build oyur professional resume in few steps</p>
                    </a>
                </section>
                <section class="template_grid">
                    <a>
                        <div class="tempale_box">
                            <img src="res/casade.png" class="template_img">
                        </div>
                    </a>
                </section>
                <section class="template_grid">
                    <a>
                        <div class="tempale_box">
                            <img src="res/casade.png" class="template_img">
                        </div>
                    </a>
                </section>

            </div>
           
        </div>
    </div>
</section>
</body>
</html>
