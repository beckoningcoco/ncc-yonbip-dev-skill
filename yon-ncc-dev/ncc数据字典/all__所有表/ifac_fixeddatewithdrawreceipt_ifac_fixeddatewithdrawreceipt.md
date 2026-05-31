# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9202.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receipt | pk_receipt | pk_receipt | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | varchar2(50) |
| 5 | depositdate | depositdate | depositdate | char(19) |
| 6 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 7 | depositorgname | depositorgname | depositorgname | varchar2(200) |
| 8 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 9 | enddate | enddate | enddate | char(19) |
| 10 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 11 | glcrate | glcrate | glcrate | number(28, 8) |
| 12 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 13 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 14 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 15 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 16 | interest | interest | interest | number(28, 8) |
| 17 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 18 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 21 | operatedate | operatedate | operatedate | char(19) |
| 22 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 23 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 24 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |  |  | '~' |
| 25 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 26 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 27 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 28 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 29 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 30 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 31 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 32 | pk_memberdeposit | pk_memberdeposit | pk_memberdeposit | varchar2(50) |  |  | '~' |
| 33 | pk_olccurr | pk_olccurr | pk_olccurr | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 37 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 38 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(20) |  |  | '~' |
| 39 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 40 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 41 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 42 | remark | remark | remark | varchar2(181) |
| 43 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 44 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 45 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 46 | saga_status | saga_status | saga_status | number(38, 0) |
| 47 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 48 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |
| 49 | tallydate | tallydate | tallydate | char(19) |
| 50 | tallyuser | tallyuser | tallyuser | varchar2(20) |  |  | '~' |
| 51 | totalamount | totalamount | totalamount | number(28, 8) |
| 52 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 53 | voucherflag | voucherflag | voucherflag | char(1) |
| 54 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 55 | withdrawdate | withdrawdate | withdrawdate | char(19) |
| 56 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 57 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 58 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 59 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 60 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 61 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 62 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 63 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 64 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 65 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 66 | creationtime | creationtime | creationtime | char(19) |
| 67 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 68 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 69 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 70 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 71 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |