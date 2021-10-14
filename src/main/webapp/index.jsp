<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js" integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4=" crossorigin="anonymous"></script>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel="stylesheet" src="main.css">
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
        <div class="grid"></div>
    </header>
</body>
</html>