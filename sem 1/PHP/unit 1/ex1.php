<?php 
    define("SUBJECT_1","Mathematic : ");
    define("SUBJECT_2","Physics : ");
    define("SUBJECT_3","Chemistry : ");

    $mark_subject_1 = 85;
    $mark_subject_2 = 75;
    $mark_subject_3 = 80;

    $total_mark = $mark_subject_1 + $mark_subject_2 + $mark_subject_3;

    $percentage = ($total_mark / 300)*100;

    echo "Semester Result";
    echo "<br>";
    echo "<br>";
    echo SUBJECT_1 . $mark_subject_1;
    echo "<br>";
    echo SUBJECT_2 . $mark_subject_2;
    echo "<br>";
    echo SUBJECT_3 . $mark_subject_3;
    echo "<br>";
    echo "Total Mark:" . $total_mark;
    echo "<br>";
    echo "Percentage is :" . number_format($percentage,2) . "%";
?>
