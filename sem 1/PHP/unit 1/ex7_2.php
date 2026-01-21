<?php
    echo "<h2>Using require()</h2>";
    // require the file (if file not found, it will cause a fatal error and stop execution)
    require "ex7.php";

    echo "If the file is missing,This line will not be displayed.<br>";

?>