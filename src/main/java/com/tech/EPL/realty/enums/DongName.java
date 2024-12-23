package com.tech.EPL.realty.enums;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum DongName {
	종로구청운동("청운동",1111010100),
	종로구신교동("신교동",1111010200),
	종로구궁정동("궁정동",1111010300),
	종로구효자동("효자동",1111010400),
	종로구창성동("창성동",1111010500),
	종로구통의동("통의동",1111010600),
	종로구적선동("적선동",1111010700),
	종로구통인동("통인동",1111010800),
	종로구누상동("누상동",1111010900),
	종로구누하동("누하동",1111011000),
	종로구옥인동("옥인동",1111011100),
	종로구체부동("체부동",1111011200),
	종로구필운동("필운동",1111011300),
	종로구내자동("내자동",1111011400),
	종로구사직동("사직동",1111011500),
	종로구도렴동("도렴동",1111011600),
	종로구당주동("당주동",1111011700),
	종로구내수동("내수동",1111011800),
	종로구세종로("세종로",1111011900),
	종로구신문로1가("신문로1가",1111012000),
	종로구신문로2가("신문로2가",1111012100),
	종로구청진동("청진동",1111012200),
	종로구서린동("서린동",1111012300),
	종로구수송동("수송동",1111012400),
	종로구중학동("중학동",1111012500),
	종로구종로1가("종로1가",1111012600),
	종로구공평동("공평동",1111012700),
	종로구관훈동("관훈동",1111012800),
	종로구견지동("견지동",1111012900),
	종로구와룡동("와룡동",1111013000),
	종로구권농동("권농동",1111013100),
	종로구운니동("운니동",1111013200),
	종로구익선동("익선동",1111013300),
	종로구경운동("경운동",1111013400),
	종로구관철동("관철동",1111013500),
	종로구인사동("인사동",1111013600),
	종로구낙원동("낙원동",1111013700),
	종로구종로2가("종로2가",1111013800),
	종로구팔판동("팔판동",1111013900),
	종로구삼청동("삼청동",1111014000),
	종로구안국동("안국동",1111014100),
	종로구소격동("소격동",1111014200),
	종로구화동("화동",1111014300),
	종로구사간동("사간동",1111014400),
	종로구송현동("송현동",1111014500),
	종로구가회동("가회동",1111014600),
	종로구재동("재동",1111014700),
	종로구계동("계동",1111014800),
	종로구원서동("원서동",1111014900),
	종로구훈정동("훈정동",1111015000),
	종로구묘동("묘동",1111015100),
	종로구봉익동("봉익동",1111015200),
	종로구돈의동("돈의동",1111015300),
	종로구장사동("장사동",1111015400),
	종로구관수동("관수동",1111015500),
	종로구종로3가("종로3가",1111015600),
	종로구인의동("인의동",1111015700),
	종로구예지동("예지동",1111015800),
	종로구원남동("원남동",1111015900),
	종로구연지동("연지동",1111016000),
	종로구종로4가("종로4가",1111016100),
	종로구효제동("효제동",1111016200),
	종로구종로5가("종로5가",1111016300),
	종로구종로6가("종로6가",1111016400),
	종로구이화동("이화동",1111016500),
	종로구연건동("연건동",1111016600),
	종로구충신동("충신동",1111016700),
	종로구동숭동("동숭동",1111016800),
	종로구혜화동("혜화동",1111016900),
	종로구명륜1가("명륜1가",1111017000),
	종로구명륜2가("명륜2가",1111017100),
	종로구명륜4가("명륜4가",1111017200),
	종로구명륜3가("명륜3가",1111017300),
	종로구창신동("창신동",1111017400),
	종로구숭인동("숭인동",1111017500),
	종로구교남동("교남동",1111017600),
	종로구평동("평동",1111017700),
	종로구송월동("송월동",1111017800),
	종로구홍파동("홍파동",1111017900),
	종로구교북동("교북동",1111018000),
	종로구행촌동("행촌동",1111018100),
	종로구구기동("구기동",1111018200),
	종로구평창동("평창동",1111018300),
	종로구부암동("부암동",1111018400),
	종로구홍지동("홍지동",1111018500),
	종로구신영동("신영동",1111018600),
	종로구무악동("무악동",1111018700),
	중구무교동("무교동",1114010100),
	중구다동("다동",1114010200),
	중구태평로1가("태평로1가",1114010300),
	중구을지로1가("을지로1가",1114010400),
	중구을지로2가("을지로2가",1114010500),
	중구남대문로1가("남대문로1가",1114010600),
	중구삼각동("삼각동",1114010700),
	중구수하동("수하동",1114010800),
	중구장교동("장교동",1114010900),
	중구수표동("수표동",1114011000),
	중구소공동("소공동",1114011100),
	중구남창동("남창동",1114011200),
	중구북창동("북창동",1114011300),
	중구태평로2가("태평로2가",1114011400),
	중구남대문로2가("남대문로2가",1114011500),
	중구남대문로3가("남대문로3가",1114011600),
	중구남대문로4가("남대문로4가",1114011700),
	중구남대문로5가("남대문로5가",1114011800),
	중구봉래동1가("봉래동1가",1114011900),
	중구봉래동2가("봉래동2가",1114012000),
	중구회현동1가("회현동1가",1114012100),
	중구회현동2가("회현동2가",1114012200),
	중구회현동3가("회현동3가",1114012300),
	중구충무로1가("충무로1가",1114012400),
	중구충무로2가("충무로2가",1114012500),
	중구명동1가("명동1가",1114012600),
	중구명동2가("명동2가",1114012700),
	중구남산동1가("남산동1가",1114012800),
	중구남산동2가("남산동2가",1114012900),
	중구남산동3가("남산동3가",1114013000),
	중구저동1가("저동1가",1114013100),
	중구충무로4가("충무로4가",1114013200),
	중구충무로5가("충무로5가",1114013300),
	중구인현동2가("인현동2가",1114013400),
	중구예관동("예관동",1114013500),
	중구묵정동("묵정동",1114013600),
	중구필동1가("필동1가",1114013700),
	중구필동2가("필동2가",1114013800),
	중구필동3가("필동3가",1114013900),
	중구남학동("남학동",1114014000),
	중구주자동("주자동",1114014100),
	중구예장동("예장동",1114014200),
	중구장충동1가("장충동1가",1114014300),
	중구장충동2가("장충동2가",1114014400),
	중구광희동1가("광희동1가",1114014500),
	중구광희동2가("광희동2가",1114014600),
	중구쌍림동("쌍림동",1114014700),
	중구을지로6가("을지로6가",1114014800),
	중구을지로7가("을지로7가",1114014900),
	중구을지로4가("을지로4가",1114015000),
	중구을지로5가("을지로5가",1114015100),
	중구주교동("주교동",1114015200),
	중구방산동("방산동",1114015300),
	중구오장동("오장동",1114015400),
	중구을지로3가("을지로3가",1114015500),
	중구입정동("입정동",1114015600),
	중구산림동("산림동",1114015700),
	중구충무로3가("충무로3가",1114015800),
	중구초동("초동",1114015900),
	중구인현동1가("인현동1가",1114016000),
	중구저동2가("저동2가",1114016100),
	중구신당동("신당동",1114016200),
	중구흥인동("흥인동",1114016300),
	중구무학동("무학동",1114016400),
	중구황학동("황학동",1114016500),
	중구서소문동("서소문동",1114016600),
	중구정동("정동",1114016700),
	중구순화동("순화동",1114016800),
	중구의주로1가("의주로1가",1114016900),
	중구충정로1가("충정로1가",1114017000),
	중구중림동("중림동",1114017100),
	중구의주로2가("의주로2가",1114017200),
	중구만리동1가("만리동1가",1114017300),
	중구만리동2가("만리동2가",1114017400),
	용산구후암동("후암동",1117010100),
	용산구용산동2가("용산동2가",1117010200),
	용산구용산동4가("용산동4가",1117010300),
	용산구갈월동("갈월동",1117010400),
	용산구남영동("남영동",1117010500),
	용산구용산동1가("용산동1가",1117010600),
	용산구동자동("동자동",1117010700),
	용산구서계동("서계동",1117010800),
	용산구청파동1가("청파동1가",1117010900),
	용산구청파동2가("청파동2가",1117011000),
	용산구청파동3가("청파동3가",1117011100),
	용산구원효로1가("원효로1가",1117011200),
	용산구원효로2가("원효로2가",1117011300),
	용산구신창동("신창동",1117011400),
	용산구산천동("산천동",1117011500),
	용산구청암동("청암동",1117011600),
	용산구원효로3가("원효로3가",1117011700),
	용산구원효로4가("원효로4가",1117011800),
	용산구효창동("효창동",1117011900),
	용산구도원동("도원동",1117012000),
	용산구용문동("용문동",1117012100),
	용산구문배동("문배동",1117012200),
	용산구신계동("신계동",1117012300),
	용산구한강로1가("한강로1가",1117012400),
	용산구한강로2가("한강로2가",1117012500),
	용산구용산동3가("용산동3가",1117012600),
	용산구용산동5가("용산동5가",1117012700),
	용산구한강로3가("한강로3가",1117012800),
	용산구이촌동("이촌동",1117012900),
	용산구이태원동("이태원동",1117013000),
	용산구한남동("한남동",1117013100),
	용산구동빙고동("동빙고동",1117013200),
	용산구서빙고동("서빙고동",1117013300),
	용산구주성동("주성동",1117013400),
	용산구용산동6가("용산동6가",1117013500),
	용산구보광동("보광동",1117013600),
	성동구상왕십리동("상왕십리동",1120010100),
	성동구하왕십리동("하왕십리동",1120010200),
	성동구홍익동("홍익동",1120010300),
	성동구도선동("도선동",1120010400),
	성동구마장동("마장동",1120010500),
	성동구사근동("사근동",1120010600),
	성동구행당동("행당동",1120010700),
	성동구응봉동("응봉동",1120010800),
	성동구금호동1가("금호동1가",1120010900),
	성동구금호동2가("금호동2가",1120011000),
	성동구금호동3가("금호동3가",1120011100),
	성동구금호동4가("금호동4가",1120011200),
	성동구옥수동("옥수동",1120011300),
	성동구성수동1가("성수동1가",1120011400),
	성동구성수동2가("성수동2가",1120011500),
	성동구송정동("송정동",1120011800),
	성동구용답동("용답동",1120012200),
	광진구중곡동("중곡동",1121510100),
	광진구능동("능동",1121510200),
	광진구구의동("구의동",1121510300),
	광진구광장동("광장동",1121510400),
	광진구자양동("자양동",1121510500),
	광진구화양동("화양동",1121510700),
	광진구군자동("군자동",1121510900),
	동대문구신설동("신설동",1123010100),
	동대문구용두동("용두동",1123010200),
	동대문구제기동("제기동",1123010300),
	동대문구전농동("전농동",1123010400),
	동대문구답십리동("답십리동",1123010500),
	동대문구장안동("장안동",1123010600),
	동대문구청량리동("청량리동",1123010700),
	동대문구회기동("회기동",1123010800),
	동대문구휘경동("휘경동",1123010900),
	동대문구이문동("이문동",1123011000),
	중랑구면목동("면목동",1126010100),
	중랑구상봉동("상봉동",1126010200),
	중랑구중화동("중화동",1126010300),
	중랑구묵동("묵동",1126010400),
	중랑구망우동("망우동",1126010500),
	중랑구신내동("신내동",1126010600),
	성북구성북동("성북동",1129010100),
	성북구성북동1가("성북동1가",1129010200),
	성북구돈암동("돈암동",1129010300),
	성북구동소문동1가("동소문동1가",1129010400),
	성북구동소문동2가("동소문동2가",1129010500),
	성북구동소문동3가("동소문동3가",1129010600),
	성북구동소문동4가("동소문동4가",1129010700),
	성북구동소문동5가("동소문동5가",1129010800),
	성북구동소문동6가("동소문동6가",1129010900),
	성북구동소문동7가("동소문동7가",1129011000),
	성북구삼선동1가("삼선동1가",1129011100),
	성북구삼선동2가("삼선동2가",1129011200),
	성북구삼선동3가("삼선동3가",1129011300),
	성북구삼선동4가("삼선동4가",1129011400),
	성북구삼선동5가("삼선동5가",1129011500),
	성북구동선동1가("동선동1가",1129011600),
	성북구동선동2가("동선동2가",1129011700),
	성북구동선동3가("동선동3가",1129011800),
	성북구동선동4가("동선동4가",1129011900),
	성북구동선동5가("동선동5가",1129012000),
	성북구안암동1가("안암동1가",1129012100),
	성북구안암동2가("안암동2가",1129012200),
	성북구안암동3가("안암동3가",1129012300),
	성북구안암동4가("안암동4가",1129012400),
	성북구안암동5가("안암동5가",1129012500),
	성북구보문동4가("보문동4가",1129012600),
	성북구보문동5가("보문동5가",1129012700),
	성북구보문동6가("보문동6가",1129012800),
	성북구보문동7가("보문동7가",1129012900),
	성북구보문동1가("보문동1가",1129013000),
	성북구보문동2가("보문동2가",1129013100),
	성북구보문동3가("보문동3가",1129013200),
	성북구정릉동("정릉동",1129013300),
	성북구길음동("길음동",1129013400),
	성북구종암동("종암동",1129013500),
	성북구하월곡동("하월곡동",1129013600),
	성북구상월곡동("상월곡동",1129013700),
	성북구장위동("장위동",1129013800),
	성북구석관동("석관동",1129013900),
	강북구미아동("미아동",1130510100),
	강북구번동("번동",1130510200),
	강북구수유동("수유동",1130510300),
	강북구우이동("우이동",1130510400),
	도봉구쌍문동("쌍문동",1132010500),
	도봉구방학동("방학동",1132010600),
	도봉구창동("창동",1132010700),
	도봉구도봉동("도봉동",1132010800),
	노원구월계동("월계동",1135010200),
	노원구공릉동("공릉동",1135010300),
	노원구하계동("하계동",1135010400),
	노원구상계동("상계동",1135010500),
	노원구중계동("중계동",1135010600),
	은평구수색동("수색동",1138010100),
	은평구녹번동("녹번동",1138010200),
	은평구불광동("불광동",1138010300),
	은평구갈현동("갈현동",1138010400),
	은평구구산동("구산동",1138010500),
	은평구대조동("대조동",1138010600),
	은평구응암동("응암동",1138010700),
	은평구역촌동("역촌동",1138010800),
	은평구신사동("신사동",1138010900),
	은평구증산동("증산동",1138011000),
	은평구진관동("진관동",1138011400),
	서대문구충정로2가("충정로2가",1141010100),
	서대문구충정로3가("충정로3가",1141010200),
	서대문구합동("합동",1141010300),
	서대문구미근동("미근동",1141010400),
	서대문구냉천동("냉천동",1141010500),
	서대문구천연동("천연동",1141010600),
	서대문구옥천동("옥천동",1141010700),
	서대문구영천동("영천동",1141010800),
	서대문구현저동("현저동",1141010900),
	서대문구북아현동("북아현동",1141011000),
	서대문구홍제동("홍제동",1141011100),
	서대문구대현동("대현동",1141011200),
	서대문구대신동("대신동",1141011300),
	서대문구신촌동("신촌동",1141011400),
	서대문구봉원동("봉원동",1141011500),
	서대문구창천동("창천동",1141011600),
	서대문구연희동("연희동",1141011700),
	서대문구홍은동("홍은동",1141011800),
	서대문구북가좌동("북가좌동",1141011900),
	서대문구남가좌동("남가좌동",1141012000),
	마포구아현동("아현동",1144010100),
	마포구공덕동("공덕동",1144010200),
	마포구신공덕동("신공덕동",1144010300),
	마포구도화동("도화동",1144010400),
	마포구용강동("용강동",1144010500),
	마포구토정동("토정동",1144010600),
	마포구마포동("마포동",1144010700),
	마포구대흥동("대흥동",1144010800),
	마포구염리동("염리동",1144010900),
	마포구노고산동("노고산동",1144011000),
	마포구신수동("신수동",1144011100),
	마포구현석동("현석동",1144011200),
	마포구구수동("구수동",1144011300),
	마포구창전동("창전동",1144011400),
	마포구상수동("상수동",1144011500),
	마포구하중동("하중동",1144011600),
	마포구신정동("신정동",1144011700),
	마포구당인동("당인동",1144011800),
	마포구서교동("서교동",1144012000),
	마포구동교동("동교동",1144012100),
	마포구합정동("합정동",1144012200),
	마포구망원동("망원동",1144012300),
	마포구연남동("연남동",1144012400),
	마포구성산동("성산동",1144012500),
	마포구중동("중동",1144012600),
	마포구상암동("상암동",1144012700),
	양천구신정동("신정동",1147010100),
	양천구목동("목동",1147010200),
	양천구신월동("신월동",1147010300),
	강서구염창동("염창동",1150010100),
	강서구등촌동("등촌동",1150010200),
	강서구화곡동("화곡동",1150010300),
	강서구가양동("가양동",1150010400),
	강서구마곡동("마곡동",1150010500),
	강서구내발산동("내발산동",1150010600),
	강서구외발산동("외발산동",1150010700),
	강서구공항동("공항동",1150010800),
	강서구방화동("방화동",1150010900),
	강서구개화동("개화동",1150011000),
	강서구과해동("과해동",1150011100),
	강서구오곡동("오곡동",1150011200),
	강서구오쇠동("오쇠동",1150011300),
	구로구신도림동("신도림동",1153010100),
	구로구구로동("구로동",1153010200),
	구로구가리봉동("가리봉동",1153010300),
	구로구고척동("고척동",1153010600),
	구로구개봉동("개봉동",1153010700),
	구로구오류동("오류동",1153010800),
	구로구궁동("궁동",1153010900),
	구로구온수동("온수동",1153011000),
	구로구천왕동("천왕동",1153011100),
	구로구항동("항동",1153011200),
	금천구가산동("가산동",1154510100),
	금천구독산동("독산동",1154510200),
	금천구시흥동("시흥동",1154510300),
	영등포구영등포동("영등포동",1156010100),
	영등포구영등포동1가("영등포동1가",1156010200),
	영등포구영등포동2가("영등포동2가",1156010300),
	영등포구영등포동3가("영등포동3가",1156010400),
	영등포구영등포동4가("영등포동4가",1156010500),
	영등포구영등포동5가("영등포동5가",1156010600),
	영등포구영등포동6가("영등포동6가",1156010700),
	영등포구영등포동7가("영등포동7가",1156010800),
	영등포구영등포동8가("영등포동8가",1156010900),
	영등포구여의도동("여의도동",1156011000),
	영등포구당산동1가("당산동1가",1156011100),
	영등포구당산동2가("당산동2가",1156011200),
	영등포구당산동3가("당산동3가",1156011300),
	영등포구당산동4가("당산동4가",1156011400),
	영등포구당산동5가("당산동5가",1156011500),
	영등포구당산동6가("당산동6가",1156011600),
	영등포구당산동("당산동",1156011700),
	영등포구도림동("도림동",1156011800),
	영등포구문래동1가("문래동1가",1156011900),
	영등포구문래동2가("문래동2가",1156012000),
	영등포구문래동3가("문래동3가",1156012100),
	영등포구문래동4가("문래동4가",1156012200),
	영등포구문래동5가("문래동5가",1156012300),
	영등포구문래동6가("문래동6가",1156012400),
	영등포구양평동1가("양평동1가",1156012500),
	영등포구양평동2가("양평동2가",1156012600),
	영등포구양평동3가("양평동3가",1156012700),
	영등포구양평동4가("양평동4가",1156012800),
	영등포구양평동5가("양평동5가",1156012900),
	영등포구양평동6가("양평동6가",1156013000),
	영등포구양화동("양화동",1156013100),
	영등포구신길동("신길동",1156013200),
	영등포구대림동("대림동",1156013300),
	영등포구양평동("양평동",1156013400),
	동작구노량진동("노량진동",1159010100),
	동작구상도동("상도동",1159010200),
	동작구상도1동("상도1동",1159010300),
	동작구본동("본동",1159010400),
	동작구흑석동("흑석동",1159010500),
	동작구동작동("동작동",1159010600),
	동작구사당동("사당동",1159010700),
	동작구대방동("대방동",1159010800),
	동작구신대방동("신대방동",1159010900),
	관악구봉천동("봉천동",1162010100),
	관악구신림동("신림동",1162010200),
	관악구남현동("남현동",1162010300),
	서초구방배동("방배동",1165010100),
	서초구양재동("양재동",1165010200),
	서초구우면동("우면동",1165010300),
	서초구원지동("원지동",1165010400),
	서초구잠원동("잠원동",1165010600),
	서초구반포동("반포동",1165010700),
	서초구서초동("서초동",1165010800),
	서초구내곡동("내곡동",1165010900),
	서초구염곡동("염곡동",1165011000),
	서초구신원동("신원동",1165011100),
	강남구역삼동("역삼동",1168010100),
	강남구개포동("개포동",1168010300),
	강남구청담동("청담동",1168010400),
	강남구삼성동("삼성동",1168010500),
	강남구대치동("대치동",1168010600),
	강남구신사동("신사동",1168010700),
	강남구논현동("논현동",1168010800),
	강남구압구정동("압구정동",1168011000),
	강남구세곡동("세곡동",1168011100),
	강남구자곡동("자곡동",1168011200),
	강남구율현동("율현동",1168011300),
	강남구일원동("일원동",1168011400),
	강남구수서동("수서동",1168011500),
	강남구도곡동("도곡동",1168011800),
	송파구잠실동("잠실동",1171010100),
	송파구신천동("신천동",1171010200),
	송파구풍납동("풍납동",1171010300),
	송파구송파동("송파동",1171010400),
	송파구석촌동("석촌동",1171010500),
	송파구삼전동("삼전동",1171010600),
	송파구가락동("가락동",1171010700),
	송파구문정동("문정동",1171010800),
	송파구장지동("장지동",1171010900),
	송파구방이동("방이동",1171011100),
	송파구오금동("오금동",1171011200),
	송파구거여동("거여동",1171011300),
	송파구마천동("마천동",1171011400),
	강동구명일동("명일동",1174010100),
	강동구고덕동("고덕동",1174010200),
	강동구상일동("상일동",1174010300),
	강동구길동("길동",1174010500),
	강동구둔촌동("둔촌동",1174010600),
	강동구암사동("암사동",1174010700),
	강동구성내동("성내동",1174010800),
	강동구천호동("천호동",1174010900),
	강동구강일동("강일동",1174011000)
	;
	
	private final String dongName;
    private final int dongCode;

    DongName(String dongName, int dongCode) {
	    this.dongName = dongName;
	    this.dongCode = dongCode;
	}
	
    public String getDongName() {
        return dongName;
    }

    public int getDongCode() {
        return dongCode;
    }

    private static final Map<String, DongName> BY_DONG_NAME =
            Stream.of(values()).collect(Collectors.toMap(DongName::getDongName, Function.identity()));

    private static final Map<Integer, DongName> BY_DONG_CODE =
            Stream.of(values()).collect(Collectors.toMap(DongName::getDongCode, Function.identity()));

    public static DongName valueOfDongName(String dongName) {
        return BY_DONG_NAME.get(dongName);
    }

    public static DongName valueOfGuCode(int dongCode) {
        return BY_DONG_CODE.get(dongCode);
    }
}
