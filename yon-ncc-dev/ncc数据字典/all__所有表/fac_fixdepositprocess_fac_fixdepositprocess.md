# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | billmakedate | billmakedate | billmakedate | char(19) |
| 2 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 3 | billstate | billstate | billstate | number(38, 0) |
| 4 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 5 | depositamount | depositamount | depositamount | number(28, 8) |
| 6 | depositbankname | depositbankname | depositbankname | varchar2(200) |
| 7 | depositcode | depositcode | depositcode | varchar2(50) |
| 8 | depositdate | depositdate | depositdate | char(19) |
| 9 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 10 | depositperiod | depositperiod | depositperiod | varchar2(50) |
| 11 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 12 | enddate | enddate | enddate | char(19) |
| 13 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 14 | glcrate | glcrate | glcrate | number(28, 8) |
| 15 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 18 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 21 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 22 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(50) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_deposit | pk_deposit | pk_deposit | char(20) | √ |
| 25 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 26 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 27 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 33 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 34 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(50) |  |  | '~' |
| 35 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(20) |
| 36 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 37 | remark | remark | remark | varchar2(181) |
| 38 | returnnote | returnnote | returnnote | varchar2(200) |
| 39 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 40 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 41 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 42 | saga_status | saga_status | saga_status | number(38, 0) |
| 43 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 44 | tallydate | tallydate | tallydate | char(19) |
| 45 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
| 46 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 47 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 48 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 49 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 50 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 51 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 52 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 53 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 54 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 55 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 56 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 57 | creationtime | creationtime | creationtime | char(19) |
| 58 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 59 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 60 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 61 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 62 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |