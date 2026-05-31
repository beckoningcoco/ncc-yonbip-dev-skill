# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9218.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticewithdraw | pk_noticewithdraw | pk_noticewithdraw | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvetime | approvetime | approvetime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billstate | billstate | billstate | number(38, 0) |
| 9 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 10 | businessno | businessno | businessno | varchar2(50) |
| 11 | depositcode | depositcode | depositcode | varchar2(101) |
| 12 | depositdate | depositdate | depositdate | char(19) |
| 13 | depositorgname | depositorgname | depositorgname | varchar2(200) |
| 14 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 15 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(28, 8) |
| 17 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 18 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 19 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 20 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 21 | interest | interest | interest | number(28, 8) |
| 22 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 23 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 24 | olcrate | olcrate | olcrate | number(28, 8) |
| 25 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 26 | operatedate | operatedate | operatedate | char(19) |
| 27 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 28 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 29 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 30 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 31 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 32 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 33 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 34 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 35 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 36 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 37 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 38 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 39 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 40 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 41 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 42 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 43 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 44 | remark | remark | remark | varchar2(181) |
| 45 | reservedate | reservedate | reservedate | char(19) |
| 46 | returndate | returndate | returndate | char(19) |
| 47 | returner | returner | returner | varchar2(20) |  |  | '~' |
| 48 | returntime | returntime | returntime | char(19) |
| 49 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 50 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 51 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 52 | saga_status | saga_status | saga_status | number(38, 0) |
| 53 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 54 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |
| 55 | submitdate | submitdate | submitdate | char(19) |
| 56 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 57 | submittime | submittime | submittime | char(19) |
| 58 | totalamount | totalamount | totalamount | number(28, 8) |
| 59 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 60 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 61 | voucherflag | voucherflag | voucherflag | char(1) |
| 62 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 63 | withdrawdate | withdrawdate | withdrawdate | char(19) |
| 64 | withdrawtype | withdrawtype | withdrawtype | number(38, 0) |
| 65 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 66 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 67 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 68 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 69 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 70 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 71 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 72 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 73 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 74 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 75 | creationtime | creationtime | creationtime | char(19) |
| 76 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 77 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 78 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 79 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 80 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |