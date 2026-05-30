# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buzi_info | pk_buzi_info | pk_buzi_info | char(20) | √ |
| 2 | billinfo | billinfo | billinfo | varchar2(500) |
| 3 | billmaker | billmaker | billmaker | varchar2(50) |
| 4 | billmaketime | billmaketime | billmaketime | varchar2(50) |
| 5 | bill_code | bill_code | bill_code | varchar2(300) |
| 6 | bill_type | bill_type | bill_type | varchar2(50) |
| 7 | filenum | filenum | filenum | number(38, 0) |
| 8 | pk_bill | pk_bill | pk_bill | varchar2(50) |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | transi_type | transi_type | transi_type | varchar2(50) |
| 11 | hdef1 | hdef1 | hdef1 | varchar2(101) |
| 12 | hdef2 | hdef2 | hdef2 | varchar2(101) |
| 13 | hdef3 | hdef3 | hdef3 | varchar2(101) |
| 14 | hdef4 | hdef4 | hdef4 | varchar2(101) |
| 15 | hdef5 | hdef5 | hdef5 | varchar2(101) |
| 16 | hdef6 | hdef6 | hdef6 | varchar2(101) |
| 17 | hdef7 | hdef7 | hdef7 | varchar2(101) |
| 18 | hdef8 | hdef8 | hdef8 | varchar2(101) |
| 19 | hdef9 | hdef9 | hdef9 | varchar2(101) |
| 20 | hdef10 | hdef10 | hdef10 | varchar2(101) |
| 21 | hdef11 | hdef11 | hdef11 | varchar2(101) |
| 22 | hdef12 | hdef12 | hdef12 | varchar2(101) |
| 23 | hdef13 | hdef13 | hdef13 | varchar2(101) |
| 24 | hdef14 | hdef14 | hdef14 | varchar2(101) |
| 25 | hdef15 | hdef15 | hdef15 | varchar2(101) |
| 26 | hdef16 | hdef16 | hdef16 | varchar2(101) |
| 27 | hdef17 | hdef17 | hdef17 | varchar2(101) |
| 28 | hdef18 | hdef18 | hdef18 | varchar2(101) |
| 29 | hdef19 | hdef19 | hdef19 | varchar2(101) |
| 30 | hdef20 | hdef20 | hdef20 | varchar2(101) |
| 31 | creationtime | creationtime | creationtime | char(19) |
| 32 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |