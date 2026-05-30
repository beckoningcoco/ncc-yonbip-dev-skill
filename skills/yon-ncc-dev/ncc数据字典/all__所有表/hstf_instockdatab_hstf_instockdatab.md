# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8857.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 2 | clocationid | clocationid | clocationid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) | √ |  | '~' |
| 4 | costprice | costprice | costprice | varchar2(50) |
| 5 | cproductorid | cproductorid | cproductorid | varchar2(20) |  |  | '~' |
| 6 | crowno | crowno | crowno | varchar2(20) |
| 7 | csnunitid | csnunitid | csnunitid | varchar2(20) |  |  | '~' |
| 8 | cunitid | cunitid | cunitid | varchar2(20) |  |  | '~' |
| 9 | cvendorid | cvendorid | cvendorid | varchar2(20) |  |  | '~' |
| 10 | cvmivenderid | cvmivenderid | cvmivenderid | varchar2(20) |  |  | '~' |
| 11 | dbizdate | dbizdate | dbizdate | varchar2(19) |
| 12 | dproducedate | dproducedate | dproducedate | char(19) |
| 13 | dvalidate | dvalidate | dvalidate | char(19) |
| 14 | mainmeascode | mainmeascode | mainmeascode | varchar2(50) |
| 15 | mainmeasname | mainmeasname | mainmeasname | varchar2(50) |
| 16 | materialspec | materialspec | materialspec | varchar2(50) |
| 17 | materialtype | materialtype | materialtype | varchar2(50) |
| 18 | mcode | mcode | mcode | varchar2(50) |
| 19 | meascode | meascode | meascode | varchar2(50) |
| 20 | measname | measname | measname | varchar2(50) |
| 21 | mname | mname | mname | varchar2(150) |
| 22 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 23 | ncostprice | ncostprice | ncostprice | number(28, 8) |
| 24 | nmny | nmny | nmny | number(28, 8) |
| 25 | nonhandnum | nonhandnum | nonhandnum | number(28, 8) |
| 26 | pk_batchcode | pk_batchcode | pk_batchcode | varchar2(20) |  |  | '~' |
| 27 | pk_instockdata | pk_instockdata | pk_instockdata | char(20) | √ |
| 28 | pk_instockdata_b | pk_instockdata_b | pk_instockdata_b | char(20) | √ |
| 29 | pk_serialcode | pk_serialcode | pk_serialcode | varchar2(20) |  |  | '~' |
| 30 | procode | procode | procode | varchar2(50) |
| 31 | proname | proname | proname | varchar2(150) |
| 32 | rcode | rcode | rcode | varchar2(50) |
| 33 | rname | rname | rname | varchar2(100) |
| 34 | srcbid | srcbid | srcbid | varchar2(50) |
| 35 | srchid | srchid | srchid | varchar2(50) |
| 36 | vbatchcode | vbatchcode | vbatchcode | varchar2(40) |
| 37 | vbillbarcode | vbillbarcode | vbillbarcode | varchar2(128) |
| 38 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 39 | vnotebody | vnotebody | vnotebody | varchar2(181) |
| 40 | vserialcode | vserialcode | vserialcode | varchar2(128) |
| 41 | vbdef1 | vbdef1 | vbdef1 | varchar2(101) |
| 42 | vbdef2 | vbdef2 | vbdef2 | varchar2(101) |
| 43 | vbdef3 | vbdef3 | vbdef3 | varchar2(101) |
| 44 | vbdef4 | vbdef4 | vbdef4 | varchar2(101) |
| 45 | vbdef5 | vbdef5 | vbdef5 | varchar2(101) |
| 46 | vbdef6 | vbdef6 | vbdef6 | varchar2(101) |
| 47 | vbdef7 | vbdef7 | vbdef7 | varchar2(101) |
| 48 | vbdef8 | vbdef8 | vbdef8 | varchar2(101) |
| 49 | vbdef9 | vbdef9 | vbdef9 | varchar2(101) |
| 50 | vbdef10 | vbdef10 | vbdef10 | varchar2(101) |
| 51 | vbdef11 | vbdef11 | vbdef11 | varchar2(101) |
| 52 | vbdef12 | vbdef12 | vbdef12 | varchar2(101) |
| 53 | vbdef13 | vbdef13 | vbdef13 | varchar2(101) |
| 54 | vbdef14 | vbdef14 | vbdef14 | varchar2(101) |
| 55 | vbdef15 | vbdef15 | vbdef15 | varchar2(101) |
| 56 | vbdef16 | vbdef16 | vbdef16 | varchar2(101) |
| 57 | vbdef17 | vbdef17 | vbdef17 | varchar2(101) |
| 58 | vbdef18 | vbdef18 | vbdef18 | varchar2(101) |
| 59 | vbdef19 | vbdef19 | vbdef19 | varchar2(101) |
| 60 | vbdef20 | vbdef20 | vbdef20 | varchar2(101) |
| 61 | vfree1 | vfree1 | vfree1 | varchar2(101) |
| 62 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 63 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |