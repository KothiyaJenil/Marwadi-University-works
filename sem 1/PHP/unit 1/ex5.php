<?php
    echo "Using for loop :<br>";
    for($i =5;$i<=10;$i++)
    {
        echo $i ." ";
    }
    
    echo "<br>Using foreach loop:<br>";
    $numbers = range(5,10);
    foreach($numbers as $number)
    {
        echo $number . " ";
    }
?>