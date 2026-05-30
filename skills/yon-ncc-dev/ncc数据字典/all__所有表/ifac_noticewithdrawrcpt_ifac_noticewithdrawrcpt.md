# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticewithdrawrcpt | pk_noticewithdrawrcpt | pk_noticewithdrawrcpt | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | varchar2(50) |
| 5 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 6 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 7 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 8 | glcinterest | glcinterest | glcinterest | number(28, 8) |
| 9 | glcrate | glcrate | glcrate | number(28, 8) |
| 10 | glcwithdrawmnt | glcwithdrawmnt | glcwithdrawmnt | number(28, 8) |
| 11 | gllcinterest | gllcinterest | gllcinterest | number(28, 8) |
| 12 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 13 | gllcwithdrawmnt | gllcwithdrawmnt | gllcwithdrawmnt | number(28, 8) |
| 14 | interest | interest | interest | number(28, 8) |
| 15 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 16 | olcinterest | olcinterest | olcinterest | number(28, 8) |
| 17 | olcrate | olcrate | olcrate | number(28, 8) |
| 18 | olcwithdrawmnt | olcwithdrawmnt | olcwithdrawmnt | number(28, 8) |
| 19 | operatedate | operatedate | operatedate | char(19) |
| 20 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 21 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 22 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 25 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_memberdeposit | pk_memberdeposit | pk_memberdeposit | varchar2(50) |
| 28 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 32 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 33 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 34 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 35 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 36 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 37 | remark | remark | remark | varchar2(181) |
| 38 | reservedate | reservedate | reservedate | char(19) |
| 39 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 40 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 41 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 42 | saga_status | saga_status | saga_status | number(38, 0) |
| 43 | srcbillcode | srcbillcode | srcbillcode | varchar2(20) |
| 44 | srcbilltypecode | srcbilltypecode | srcbilltypecode | varchar2(50) |
| 45 | tallydate | tallydate | tallydate | char(19) |
| 46 | tallyuser | tallyuser | tallyuser | varchar2(20) |  |  | '~' |
| 47 | totalamount | totalamount | totalamount | number(28, 8) |
| 48 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 49 | voucherflag | voucherflag | voucherflag | char(1) |
| 50 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 51 | withdrawdate | withdrawdate | withdrawdate | char(19) |
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