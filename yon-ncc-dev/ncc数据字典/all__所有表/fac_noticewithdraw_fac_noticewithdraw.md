# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8081.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | acceptdate | acceptdate | acceptdate | char(19) |
| 2 | approvedate | approvedate | approvedate | char(19) |
| 3 | approvenote | approvenote | approvenote | varchar2(50) |
| 4 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 5 | approvetime | approvetime | approvetime | char(19) |
| 6 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 7 | billstate | billstate | billstate | number(38, 0) |
| 8 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 9 | currentinterest | currentinterest | currentinterest | number(28, 8) |
| 10 | depositcode | depositcode | depositcode | varchar2(20) |
| 11 | depositdate | depositdate | depositdate | char(19) |
| 12 | depositorgname | depositorgname | depositorgname | varchar2(50) |
| 13 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 14 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(28, 8) |
| 16 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 17 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 19 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 20 | interest | interest | interest | number(28, 8) |
| 21 | noticeinterest | noticeinterest | noticeinterest | number(28, 8) |
| 22 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 23 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 24 | olcrate | olcrate | olcrate | number(28, 8) |
| 25 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 26 | operatedate | operatedate | operatedate | char(19) |
| 27 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 28 | pk_bank | pk_bank | pk_bank | varchar2(20) |  |  | '~' |
| 29 | pk_banktype | pk_banktype | pk_banktype | varchar2(20) |  |  | '~' |
| 30 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 31 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 32 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 33 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 34 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 35 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 36 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 37 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 38 | pk_noticewithdraw | pk_noticewithdraw | pk_noticewithdraw | char(20) | √ |
| 39 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 40 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 41 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 42 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 43 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 44 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 45 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 46 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 47 | remark | remark | remark | varchar2(181) |
| 48 | reservedate | reservedate | reservedate | char(19) |
| 49 | returndate | returndate | returndate | char(19) |
| 50 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 51 | returntime | returntime | returntime | char(19) |
| 52 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 53 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 54 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 55 | saga_status | saga_status | saga_status | number(38, 0) |
| 56 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 57 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |
| 58 | submitdate | submitdate | submitdate | char(19) |
| 59 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 60 | submittime | submittime | submittime | char(19) |
| 61 | tallydate | tallydate | tallydate | char(19) |
| 62 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 63 | totalamount | totalamount | totalamount | number(28, 8) |
| 64 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 65 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 66 | voucherflag | voucherflag | voucherflag | char(1) |
| 67 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 68 | withdrawdate | withdrawdate | withdrawdate | char(19) |
| 69 | withdrawtype | withdrawtype | withdrawtype | number(38, 0) |
| 70 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 71 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 72 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 73 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 74 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 75 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 76 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 77 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 78 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 79 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 80 | creationtime | creationtime | creationtime | char(19) |
| 81 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 82 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 83 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 84 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 85 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |