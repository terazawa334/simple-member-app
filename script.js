function validateForm(){
    const name = document.getElementById("name").Value.trim();
    const email = document.getElementById("email").Value.trim();
    const age = document.getElementById("age").Value.trim();
}

if (name === "") {
    alert("名前を入力してください。")
    return false;
}

if (email === "" || !email.includes("@")) {
    alert("正しいメールアドレスを入力してください。")
    return false;
}

if (age === "" || isNaN(age) || Number(age) < 0) {
    alert("有効な年齢を入力してください。")
    return false;
}

alert("登録が完了しました。")
return true;