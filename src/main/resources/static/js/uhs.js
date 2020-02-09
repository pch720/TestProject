$('#close').click(function(){
    let res = confirm('회원가입 창을 닫으시면 입력하신 정보가 초기화됩니다.\n정말 닫으시겠습니까?');
    if(res){
        document.getElementById("Regname").value='';
        document.getElementById("Regnn").value='';
        document.getElementById("Regemail").value='';
        document.getElementById("Regpw").value='';
        document.getElementById("Regpwc").value='';
        $('#nb').attr('style','display: none;')
        $('#nnb').attr('style','display: none;')
        $('#eb').attr('style','display: none;')
        $('#ee').attr('style','display: none;')
        $('#pb').attr('style','display: none;')
        $('#pe').attr('style','display: none;')
        $('#pce').attr('style','display: none;')
        $('#regModal').modal("hide");
    }else{
        return false;
    }
});
function ruhs(num){
    let emailRule = /^[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*@[0-9a-zA-Z]([-_\.]?[0-9a-zA-Z])*\.[a-zA-Z]{2,3}$/i;
    let pwRule = /^(?=.*\d)(?=.*[a-zA-Z])[0-9a-zA-Z]{8,20}$/;
    if($('#Regname').val()===''){
        $('#nb').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
    }else{
        $('#nb').attr('style','display: none;')
    }
    if(num>0){
        if($('#Regnn').val()===''){
            $('#nnb').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
        }else{
            $('#nnb').attr('style','display: none;')
        }
    }
    if(num>1){
        if($('#Regemail').val()===''){
            $('#ee').attr('style','display:none;')
            $('#eb').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
        }else if(!emailRule.test($('#Regemail').val())){
            $('#ee').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
            $('#eb').attr('style','display:none;')
        }else{
            $('#ee').attr('style','display:none;')
        }
    }
    if(num>2){
        if($('#Regpw').val()===''){
            $('#pb').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
            $('#pe').attr('style','display:none;')
        }else if(!pwRule.test($('#Regpw').val())){
            $('#pe').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
            $('#pb').attr('style','display:none;')
        }else{
            $('#pe').attr('style','display:none;')
        }
        if($('#Regpwc').val()===$('#Regpw').val() || $('#Regpwc').val()===''){
            $('#pce').attr('style','display:none;')
        }else{
            $('#pce').attr('style','text-align: left; margin-left: 1%; color: #FF0000; margin-bottom: -2%;')
        }
    }
}
function Reg(){

    let res=confirm("입력하신 정보로 가입하시겠습니까?")
    if(!res){
        return false;
    }
}