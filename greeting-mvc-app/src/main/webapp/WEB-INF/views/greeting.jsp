
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Welcome Page</title>
</head>
<body>

<h1 id="greeting">Welcome!</h1>

<script>
    const greetingElement = document.getElementById('greeting');
    const hour = new Date().getHours();

    if (hour < 12) {
        greetingElement.textContent = 'Good Morning! Welcome to our website.';
    } else if (hour < 18) {
        greetingElement.textContent = 'Good Afternoon! Welcome to our website.';
    } else {
        greetingElement.textContent = 'Good Evening! Welcome to our website.';
    }
</script>

</body>
</html>
