# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8071.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 2 | billstate | billstate | billstate | number(38, 0) |
| 3 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 4 | currentinterest | currentinterest | currentinterest | number(28, 8) |
| 5 | depositbankname | depositbankname | depositbankname | varchar2(200) |
| 6 | depositcode | depositcode | depositcode | varchar2(20) |
| 7 | depositdate | depositdate | depositdate | char(19) |
| 8 | depositinterest | depositinterest | depositinterest | number(28, 8) |
| 9 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 10 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 11 | enddate | enddate | enddate | char(19) |
| 12 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(28, 8) |
| 14 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 15 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 16 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 17 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 18 | interest | interest | interest | number(28, 8) |
| 19 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 20 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(28, 8) |
| 22 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 23 | operatedate | operatedate | operatedate | char(19) |
| 24 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 25 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 26 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 27 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 28 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 29 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 30 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 31 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 32 | pk_fixeddatewithdraw | pk_fixeddatewithdraw | pk_fixeddatewithdraw | char(20) | √ |
| 33 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 34 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 35 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 36 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 37 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 38 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |  |  | '~' |
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
| 50 | tallyor | tallyor | tallyor | varchar2(20) |  |  | '~' |
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