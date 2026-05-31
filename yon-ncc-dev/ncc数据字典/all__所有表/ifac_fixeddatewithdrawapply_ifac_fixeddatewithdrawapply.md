# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9201.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fwithdrawapply | pk_fwithdrawapply | pk_fwithdrawapply | varchar2(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1536) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | approvetime | approvetime | approvetime | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billstate | billstate | billstate | number(38, 0) |
| 9 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 10 | depositcode | depositcode | depositcode | varchar2(101) |
| 11 | depositdate | depositdate | depositdate | char(19) |
| 12 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 13 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 14 | enddate | enddate | enddate | char(19) |
| 15 | entrusthandledate | entrusthandledate | entrusthandledate | char(19) |
| 16 | entrusthandler | entrusthandler | entrusthandler | varchar2(20) |  |  | '~' |
| 17 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 18 | operatedate | operatedate | operatedate | char(19) |
| 19 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 20 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 23 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 24 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 25 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 30 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 31 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 32 | remark | remark | remark | varchar2(272) |
| 33 | returnflag | returnflag | returnflag | char(1) |
| 34 | returnnote | returnnote | returnnote | varchar2(300) |
| 35 | submitdate | submitdate | submitdate | char(19) |
| 36 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 37 | submittime | submittime | submittime | char(19) |
| 38 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 39 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 40 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
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