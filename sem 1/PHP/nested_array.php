<?php
    // demo of neested array 
    $mark = array(
        "amar" => array("physics" => 35,"maths" => 30,"chemistry" =>39),
        "akbar" => array("physics" => 30,"maths" => 32,"chemistry" =>29),
        "anthony" => array("physics" => 31,"maths" => 22,"chemistry" =>39)
    );

    echo "Mark for amar in physics :";
    echo $mark['amar']['physics']."<br/>";
    echo "Mark for akbar in physics :";
    echo $mark['akbar']['maths']."<br/>";
    echo "Mark for anthony in physics :";
    echo $mark['anthony']['chemistry']."<br/>";

?>
sdfhlfldlkhslsdknnsgkhhdhdsh