<?php
    $a=20;
    $b=20;
    function test()
    {
        echo "hello";
        $a=10;
        global $a,$b;
        $b=$a+$b;
    }
test();
echo "<br>".$b;
?>