<#import "lib/utils.ftlh" as u>

<@u.page>
    <div class="container-fluid">

        <div class="col-md-12 offset-md-3 mt-5">
            <h1>Convert Your Roman Numerals!!</h1>
            <hr>
            <h3>${description}</h3>
            <hr>
            <div class="d-none" id="convertedNumber">
                <h1>Here Are Your Numbers :)</h1>

            </div>

            <div id="ajaxForm">
                <div class="form-group">
                    <label for="query" required="required">Roman Numeral Or Positive Integer</label>
                    <br>
                    <input type="text" name="query" class="form-control" id="query" aria-describedby="roman Numeral Or Integer Input" placeholder="Enter roman numeral or positive integer">
                </div>
                <br>
                <button type="button" id="convertButton" class="btn btn-primary">Convert</button>
                <button type="button" id="clearButton" class="btn btn-danger">Clear</button>
            </div>
        </div>
    </div>
</@u.page>