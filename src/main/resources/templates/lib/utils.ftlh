<#macro header>
    <nav class="navbar navbar-expand-lg bg-light">
        <div class="container-fluid">
            <a class="navbar-brand" href="https://josephredmond.com">
                <img src="https://josephredmond.com/wp-content/uploads/2022/09/logo-no-background.png" alt="Joseph Redmond" width="300" height="50" class="d-inline-block align-text-top">
            </a>
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                    <li class="nav-item">
                        <a class="nav-link active" aria-current="page" href="#">Home</a>
                    </li>
                    <li class="nav-item dropdown">
                        <a class="nav-link dropdown-toggle" href="#" role="button" data-bs-toggle="dropdown" aria-expanded="false">
                            External Links
                        </a>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="https://josephredmond.com">My Website</a></li>
                            <li><a class="dropdown-item" href="https://www.youtube.com/channel/UCHaQP7nzYZ8Q-fhXZhqwV5w">My Youtube (WIP)</a></li>
                            <li><a class="dropdown-item" href="https://github.com/joseph-redmond">My Github</a></li>
                            <li><a class="dropdown-item" href="https://linkedin.com/in/joseph-redmond">My Linkedin</a></li>
                        </ul>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
</#macro>
<#macro footer>
    <footer>
        <script src="/js/script.js"/>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-u1OknCvxWvY5kfmNBILK2hRnQC3Pr17a+RTT6rIHI7NnikvbZlHgTPOOmMi466C8" crossorigin="anonymous"></script>
    </footer>
</#macro>

<#macro page>
    <!DOCTYPE html>
    <html lang="en">
        <head>
            <title>${title}</title>
            <meta charset="UTF-8">
            <meta name="description" content="${description}">
            <meta name="keywords" content="${keywords}">
            <meta name="author" content="${author}">
            <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-iYQeCzEYFbKjA/T2uDLTpkwGzCiq6soy8tYaI1GyVh/UjpbCx/TYkiZhlZB6+fzT" crossorigin="anonymous">
            <link href="/css/style.css" rel="stylesheet">
        </head>
        <body>
            <@header/>
            <#nested>
            <@footer/>
        </body>
    </html>
</#macro>