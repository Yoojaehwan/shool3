<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="../global/header.jsp"/>
<div class="container" style="width:1000px; margin:0 auto;">
	<div class="row display-table">
    <div class="col-xs-12 col-sm-4 display-cell" >
	    <ul class="nav nav-pills nav-stacked">
	    	<li class="dropdown active"><a onclick="test.test()">배열출력</a></li>
	    	<li class="dropdown active"><a onclick="opr.score()">어벤저스</a>	</li>
	    	<li class="dropdown active"><a onclick="opr.grade()">성적계산기</a></li>
	    	<li class="dropdown active"><a onclick="opr.gender()">성별 구분하기</a></li>
	    	<li class="dropdown active"><a onclick="opr.bigNum()">최대값 구하기</a></li>
	    </ul>
    </div>
    <div class="col-xs-12 col-sm-8 display-cell" id="result" style="border: 1px solid black;height: 500px">
        text
    </div>
</div>
</div>	
<script>
var test = {
		test : function() {
			alert('테스트 중');
		}
}
var opr = {
	sysout : function() {
		
		var arr = ['사과','배','감','귤'];
		for ( var i in arr) {
			
		}
		console.log(arr[i]+'\t');
	},
	score : function() {
		var result = '';
		var avengers = [];
		avengers.push({name : '아이언',kor : 90,eng : 90,math : 90});
		avengers.push({name : '헐크',kor : 80,eng : 80,math : 80});
		avengers.push({name : '캡아',kor : 70,eng : 70,math : 70});
		for ( var i in avengers) {
			avengers[i].getSum = function() {
				result = this.kor + this.eng + this.math; 
				return result;
			}
			avengers[i].getAvg = function() {
				result = this.getSum()/3;
				return result;
			}
			console.log('이름 :'+avengers[i].name+'합계 :'+avengers[i].getSum()+'평균 : '+avengers[i].getAvg());
		}
		result = '============ 어벤저스 성적표 ============ \n';
		result += '이름\t국어\t영어\t수학\t총점\t평균\n';
		result += '-------------------------------------\n';
		for ( var i in avengers) {
			{
				with(avengers[i]){
					result += name + ':\t'+kor+':\t'+eng+':\t'+math
						+':\t'+getSum()+':\t'+getAvg()+'\n';
				}
			}
		}
		/*
		with 키워드는 배열에 담긴 하나의 객체를 의미한다.
		즉 예를 들어
		var iron = {name : '아이언',kor : 90,eng : 90,math : 90}
		이렇게 선언된 하나의 객체를 avengers.push(iron) 이라고 줄 경우
		출력문에서 with 를 사용하지 않는다면 iron.name 이런 식으로 일일히
		명시해야 하기 때문에 with 를 사용한다
		*/
		console.log('어벤저스 성적표 : '+result);
	},
	grade : function() {
		/*
		평균 90 이상 A
		80 B
		70 C
		60 D
		미만 F
		*/
		var kor = Number(prompt('국어점수')),
			eng = Number(prompt('영어점수')), 
			math = Number(prompt('수학점수'));
		
		var sum = kor+eng+math;
		var avg = sum/3
		var student = '';
		if (avg >= 90) {
			student = 'A';
		}else if(avg >= 80){
			student = 'B';
		}else if(avg >= 70){
			student = 'C';
		}else if(avg >= 60){
			student = 'D';
		}else{
			student = 'F';
	}
		document.getElementById("result").innerHTML = "학점 : "+(student)
	},
		/* 
		gender : function() {
		
		800101-1234567 일 경우 flag 값은 1 이다라고 정의함
		
		var ssn = prompt('800101-1234567로 입력해주세요')
		var result='';
		var flag = ssn.charAt(7); 
		// 라면 성별을 판별하는 로직을 switch - case 로 완성하시오
		// 자바의 switch case 와 동일
		switch (flag) {
		case 1: result='남자' break;
		case 2: result='여자' break;
		case 3: result='남자' break;
		case 4: result='여자' break;
		case 5: result='외국인' break;
		case 6: result='외국인' break;

		default:
			break;
		}
		console.log(result);
	},  */
	bigNum : function() {
		var a = Number(prompt('숫자를입력하세요'));
		var b = Number(prompt('숫자를입력하세요'));
		var c = Number(prompt('숫자를입력하세요'));
		var result;
		if (a> c || a>b) {
			result = a;
		} else if(b>c){
			result = b;
		} else{
			result = c;			
			
		}
		document.getElementById("result").innerHTML = "최대값 : "+(result)
		/* 80, 70, 60 일 경우 if 문으로 최대값 을 구하는 로직을 완성하시오 */
	},
	gugudan : function() {
		var i = Number(prompt('숫자를입력하세요')) ,j=0;
		for (var int = j; int < 10; j++) {
			
			// 7단 구구단을 출력하시오
		}
		document.getElementById("result").innerHTML = "최대값 : "+(i + "*" + j + "=" + i*j+"\t")
	},
	sum1to100 : function() {
		var sum=0,i=0;
		while (condition) {
			/* 1부터 100까지의 합을 출력하시오*/
		}
	},
	oddSum : function() {
		var oddSum=0,evenSum=0;
		for (var int = 0; int < 100; int++) {
			// 1부터 100 까지 수 중에서 홀수의 합 oddSum 과 
			// 짝수들의 합 evenSum 을 구하시오
		}
	}
}
</script>