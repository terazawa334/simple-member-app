function validateForm(){
    const name = document.getElementById("name").value.trim();
    const email = document.getElementById("email").value.trim();
    const age = document.getElementById("age").value.trim();

    if (name === "") {
        alert("名前を入力してください。");
        return false;
    }

    if (email === "" || !email.includes("@")) {
        alert("正しいメールアドレスを入力してください。");
        return false;
    }

    if (age === "" || isNaN(age) || Number(age) < 0) {
        alert("有効な年齢を入力してください。");
        return false;
    }

    alert("登録が完了しました。");
    return true;
}