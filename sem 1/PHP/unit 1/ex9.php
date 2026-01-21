<pre>
    <?php
    //Numeric array for days of the week (Monday to Saturday)
    $daysofWeek = array("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday");
    //Associative array for months and their total days
    $months = array(
      "January" => 31,
      "Febraury" => 28,
      "March" => 31,
      "April" => 30,
      "May" => 31,
      "June" => 30,
      "July" => 31,
      "August" => 31,
      "September" => 30,
      "Octomber" => 31,
      "November" => 30,
      "December" => 31
    );

    //Multidimensional array for laptops
    $laptops = array(
      array("company" => "Apple", "model" => "MacBook Pro", "price" => "$1,299"),
      array("company" => "Dell", "model" => "XPS 13", "price" => "$999")
    );

    //Printing the arrays
    echo "Days of the Week:\n";
    print_r($daysofWeek);

    echo "\nMonths and Their Total Days:\n";
    print_r($months);

    echo "\nLaptops:\n";
    print_r($laptops);
    ?>
    </pre>