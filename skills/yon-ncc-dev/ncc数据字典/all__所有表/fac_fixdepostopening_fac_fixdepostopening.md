# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8070.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixdepostopening | pk_fixdepostopening | pk_fixdepostopening | char(20) | √ |
| 2 | billmakedate | billmakedate | billmakedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 6 | confirmdate | confirmdate | confirmdate | char(19) |
| 7 | depositaccname | depositaccname | depositaccname | varchar2(50) |
| 8 | depositcode | depositcode | depositcode | varchar2(50) |
| 9 | depositdate | depositdate | depositdate | char(19) |
| 10 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 11 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 12 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 13 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 14 | enddate | enddate | enddate | char(19) |
| 15 | glcdepositbalance | glcdepositbalance | glcdepositbalance | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(28, 8) |
| 17 | gllcdepositbalance | gllcdepositbalance | gllcdepositbalance | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 19 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 20 | isinitial | isinitial | isinitial | char(1) |
| 21 | olcdepositbalance | olcdepositbalance | olcdepositbalance | number(28, 8) |
| 22 | olcrate | olcrate | olcrate | number(28, 8) |
| 23 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 24 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 25 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 26 | pk_confirm | pk_confirm | pk_confirm | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 29 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 30 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 35 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 36 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 37 | remark | remark | remark | varchar2(181) |
| 38 | settleaccname | settleaccname | settleaccname | varchar2(50) |
| 39 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 40 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 41 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 42 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 43 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 44 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 45 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 46 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 47 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 48 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 49 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |