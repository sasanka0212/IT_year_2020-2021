const btn = document.getElementById("press");

btn.addEventListener('click', function handleClick() {
    var name =
        document.forms.RegForm.Name.value;
    var dateInput = 
        document.getElementById('date');
    var email =
        document.forms.RegForm.Email.value;
    var phone =
        document.forms.RegForm.Phone.value;
    var hons =
        document.forms.RegForm.Course.value;
    var reg =
        document.forms.RegForm.Reg.value;
    var roll = 
        document.forms.Regform.Roll.value;
    var no =
        document.forms.RegForm.Number.value;
    var regEmail=/^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/g; //Javascript reGex for Email Validation.
    var regPhone=/^\d{10}$/;									 // Javascript reGex for Phone Number validation.
    var regName = /\d+$/g;	
    var regReg = /^\d{6}$/;	
    var regRoll = /^\d{7}$/;
    var regNum = /^\d{7}$/;						 // Javascript reGex for Name validation

    if (name == "" || regName.test(name)) {
        window.alert("Please enter your name properly.");
        name.focus();
        return false;
    }

    if(!dateInput.value){
        alert("DOB is empty.");
    }
    
    if (email == "" || !regEmail.test(email)) {
        window.alert("Please enter a valid e-mail address.");
        email.focus();
        return false;
    }
    
    if (phone == "" || !regPhone.test(phone)) {
        alert("Please enter valid phone number.");
        phone.focus();
        return false;
    }

    if (hons.selectedIndex == -1) {
        alert("Please enter your course.");
        hons.focus();
        return false;
    }

    if (reg == "" || !regReg.test(reg)) {
        alert("Please enter valid registration number.");
        reg.focus();
        return false;
    }
    
    if (roll == "" || !regRoll.test(roll)) {
        alert("Please enter valid roll");
        roll.focus();
        return false;
    }

    if (no == "" || !regNum.test(no)) {
        alert("Please enter valid Number.");
        no.focus();
        return false;
    }
    return true;
});