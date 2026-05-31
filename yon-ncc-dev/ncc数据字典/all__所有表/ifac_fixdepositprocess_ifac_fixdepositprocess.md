# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9197.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deposit | pk_deposit | pk_deposit | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvestate | approvestate | approvestate | number(38, 0) |
| 7 | billmakedate | billmakedate | billmakedate | char(19) |
| 8 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 9 | businessno | businessno | businessno | varchar2(50) |
| 10 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 11 | depositamount | depositamount | depositamount | number(28, 8) |
| 12 | depositcode | depositcode | depositcode | varchar2(50) |
| 13 | depositdate | depositdate | depositdate | char(19) |
| 14 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 15 | depositorgname | depositorgname | depositorgname | varchar2(200) |
| 16 | depositperiod | depositperiod | depositperiod | varchar2(50) |
| 17 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 18 | enddate | enddate | enddate | char(19) |
| 19 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 20 | glcrate | glcrate | glcrate | number(28, 8) |
| 21 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 22 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 23 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 24 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 25 | olcrate | olcrate | olcrate | number(28, 8) |
| 26 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 27 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 28 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 29 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 30 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 31 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 32 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_interestacc | pk_interestacc | pk_interestacc | varchar2(20) |  |  | '~' |
| 35 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 36 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 37 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 38 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 39 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 40 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(20) |
| 41 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 42 | remark | remark | remark | varchar2(181) |
| 43 | returnnote | returnnote | returnnote | varchar2(200) |
| 44 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 45 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 46 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 47 | saga_status | saga_status | saga_status | number(38, 0) |
| 48 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 49 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 50 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 51 | voucherflag | voucherflag | voucherflag | char(1) |
| 52 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 53 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 54 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 55 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 56 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 57 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 58 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 59 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 60 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 61 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 62 | creationtime | creationtime | creationtime | char(19) |
| 63 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 64 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 65 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 66 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 67 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |