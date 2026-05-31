# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8078.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | acceptdate | acceptdate | acceptdate | char(19) |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(1024) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvestate | approvestate | approvestate | number(38, 0) |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 9 | depositamount | depositamount | depositamount | number(28, 8) |
| 10 | depositcode | depositcode | depositcode | varchar2(50) |
| 11 | depositdate | depositdate | depositdate | char(19) |
| 12 | depositmode | depositmode | depositmode | varchar2(50) |
| 13 | depositorgname | depositorgname | depositorgname | varchar2(50) |
| 14 | deposityrate | deposityrate | deposityrate | number(15, 8) |
| 15 | glcdepositamount | glcdepositamount | glcdepositamount | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(15, 8) |
| 17 | gllcdepositamount | gllcdepositamount | gllcdepositamount | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 19 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 20 | olcdepositamount | olcdepositamount | olcdepositamount | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(15, 8) |
| 22 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 23 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 24 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 25 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 26 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_deposit | pk_deposit | pk_deposit | char(20) | √ |
| 29 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 30 | pk_depositrate | pk_depositrate | pk_depositrate | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 33 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 34 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 35 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 36 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |
| 37 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 38 | pk_srcbilltypecode | pk_srcbilltypecode | pk_srcbilltypecode | varchar2(20) |
| 39 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 40 | remark | remark | remark | varchar2(181) |
| 41 | returnnote | returnnote | returnnote | varchar2(200) |
| 42 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 43 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 44 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 45 | saga_status | saga_status | saga_status | number(38, 0) |
| 46 | srcbillcode | srcbillcode | srcbillcode | varchar2(50) |
| 47 | tallydate | tallydate | tallydate | char(19) |
| 48 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 49 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 50 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 51 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 52 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 53 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 54 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 55 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 56 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 57 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 58 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 59 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 60 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 61 | creationtime | creationtime | creationtime | char(19) |
| 62 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 63 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 64 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 65 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 66 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |