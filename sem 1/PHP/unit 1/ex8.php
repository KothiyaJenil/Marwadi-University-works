//ARRAY FUNCTIONS.....
<pre>
<?php
$info = array('pizza','delicious', 'brownie');
// Listing all the variables
list($a, $b, $c) = $info;
echo "$a is $b and $c makes it special.\n";
echo "<br>";
// Listing some of them
list($a,, $c) = $info;
echo "$a with cold-drinks and $c.\n";
echo "<br>";
// Or let's keep only the third one
list(,, $c) = $info;
echo "I need coffee with $c!\n";
echo "<br>";
$yes = array('this', 'is', 'an array');
echo is_array($yes)? 'Array': 'not an Array';
echo "<br>";
$no = 'this is a string';
echo is_array($no)? 'Array': 'not an Array';
echo "<br>";
$os = array("Mac", "NT", "Irix", "Linux");
if (in_array("Irix", $os))
echo "Got Irix";
else
echo "No Match";
echo "<br>";
if (in_array("mac", $os))
echo "Got mac";
else
echo "No Match";
echo "<br>";
$a = array('1.10', 12.4, 1.13);
if (in_array('12.4', $a, true))
echo "12.4' found with strict check\n";
else
echo "mis-match datatype.";
echo "<br>";
if (in_array(1.13, $a, true))
echo "1.13 found with strict check\n";
else
echo "mis-match datatype.";
echo "<br>";
$transport = array('bike', 'car', 'bus', 'rail');
echo ($mode = current($transport)); // $mode = 'bike';
echo "<br>";
echo ($mode = next($transport)); // $mode = 'car';
echo "<br>";
echo ($mode = next($transport)); // $mode = 'bus';
echo "<br>";
echo ($mode = prev($transport)); // $mode = 'car';
echo "<br>";
echo ($mode = end($transport)); // $mode = 'rail';
echo "<br>";
//break
$array = array('step one', 'step two', 'step three', 'step four');
// by default, the pointer is on the first element
echo current($array). "<br />\n"; // "step one"
// skip two steps
next($array);
next($array);
echo current($array). "<br />\n"; // "step three"
// reset pointer, start again on step one
reset($array);
echo current($array). "<br />\n"; // "step one"
echo "<br>";
echo "<h4> sort() function</h4>";
$fruits = array("lemon", "orange", "banana", "apple");
sort($fruits);
foreach ($fruits as $key => $val)
{
echo "fruits[". $key. "] = " . $val . "\n";
}
echo "<br>";
echo "<h4> rsort() function</h4>";
rsort($fruits);
foreach ($fruits as $key => $val)
{
echo "fruits[". $key. "] = " . $val . "\n";
}
echo "<br>";
echo "<h4> asort() function</h4>";
$fruits = array("d" => "lemon", "a" =>"orange", "b" => "banana","c" => "apple");
asort($fruits);
foreach ($fruits as $key => $val)
{
echo "$key = $val\n";
}
echo "<br>";
echo "<h4> arsort() function</h4>";
arsort($fruits);
foreach ($fruits as $key => $val)
{
echo "$key = $val\n";
}
echo "<br>";
echo "<h4> array_merge() function</h4>";
$array1 = array("color" => "red", 2, 4);
print_r($array1);
$array2 = array("a", "b", "coloR" => "green", "shape" => "square", 4);
print_r($array2);
$result = array_merge($array1, $array2);
print_r($result);
?>
</pre>
