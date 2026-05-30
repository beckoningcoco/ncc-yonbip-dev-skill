# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9219.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nwithdrawapply | pk_nwithdrawapply | pk_nwithdrawapply | varchar2(20) | √ |
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
| 12 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 13 | entrusthandledate | entrusthandledate | entrusthandledate | char(19) |
| 14 | entrusthandler | entrusthandler | entrusthandler | varchar2(20) |  |  | '~' |
| 15 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 16 | operatedate | operatedate | operatedate | char(19) |
| 17 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 18 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |  |  | '~' |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_depositreceipt | pk_depositreceipt | pk_depositreceipt | varchar2(20) |  |  | '~' |
| 21 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 22 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 25 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 26 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 27 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 28 | pk_varieties | pk_varieties | pk_varieties | varchar2(20) |  |  | '~' |
| 29 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 30 | remark | remark | remark | varchar2(272) |
| 31 | returnflag | returnflag | returnflag | char(1) |  |  | '~' |
| 32 | returnnote | returnnote | returnnote | varchar2(300) |
| 33 | submitdate | submitdate | submitdate | char(19) |
| 34 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 35 | submittime | submittime | submittime | char(19) |
| 36 | vbillcode | vbillcode | vbillcode | varchar2(20) |
| 37 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 38 | withdrawamount | withdrawamount | withdrawamount | number(28, 8) |
| 39 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 40 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 41 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 42 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 43 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 44 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 45 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 46 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 47 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 48 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 49 | creationtime | creationtime | creationtime | char(19) |
| 50 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 51 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 52 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 53 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 54 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |