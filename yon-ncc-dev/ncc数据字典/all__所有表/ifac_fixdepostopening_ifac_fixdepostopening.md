# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9199.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixdepostopening | pk_fixdepostopening | pk_fixdepostopening | char(20) | √ |
| 2 | billmakedate | billmakedate | billmakedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | businessno | businessno | businessno | varchar2(50) |
| 6 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 7 | confirmdate | confirmdate | confirmdate | char(19) |
| 8 | depositaccname | depositaccname | depositaccname | varchar2(50) |
| 9 | depositcode | depositcode | depositcode | varchar2(50) |
| 10 | depositdate | depositdate | depositdate | char(19) |
| 11 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 12 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 13 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 14 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 15 | enddate | enddate | enddate | char(19) |
| 16 | glcdepositbalance | glcdepositbalance | glcdepositbalance | number(28, 8) |
| 17 | glcrate | glcrate | glcrate | number(28, 8) |
| 18 | gllcdepositbalance | gllcdepositbalance | gllcdepositbalance | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 20 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 21 | isinitial | isinitial | isinitial | char(1) |
| 22 | olcdepositbalance | olcdepositbalance | olcdepositbalance | number(28, 8) |
| 23 | olcrate | olcrate | olcrate | number(28, 8) |
| 24 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 25 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 26 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 27 | pk_confirm | pk_confirm | pk_confirm | varchar2(20) |  |  | '~' |
| 28 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 29 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 30 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 31 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 32 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 33 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 37 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 38 | remark | remark | remark | varchar2(272) |
| 39 | settleaccname | settleaccname | settleaccname | varchar2(50) |
| 40 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 41 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 42 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 43 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 44 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 45 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 46 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 47 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 48 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 49 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 50 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 51 | creationtime | creationtime | creationtime | char(19) |
| 52 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 53 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 54 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 55 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 56 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |