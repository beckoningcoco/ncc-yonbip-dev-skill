# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9196.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixdepositapply | pk_fixdepositapply | pk_fixdepositapply | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1536) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billstate | billstate | billstate | number(38, 0) |
| 9 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 10 | consigndate | consigndate | consigndate | char(19) |
| 11 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 12 | depositaccname | depositaccname | depositaccname | varchar2(450) |
| 13 | depositamount | depositamount | depositamount | number(28, 8) |
| 14 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 15 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 16 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 17 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 18 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |
| 20 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 21 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 22 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 23 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 24 | pk_fundorg_v | pk_fundorg_v | pk_fundorg_v | varchar2(20) |  |  | '~' |
| 25 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 29 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 30 | remark | remark | remark | varchar2(272) |
| 31 | returnflag | returnflag | returnflag | char(1) |
| 32 | returnnote | returnnote | returnnote | varchar2(300) |
| 33 | settleaccname | settleaccname | settleaccname | varchar2(450) |
| 34 | submitdate | submitdate | submitdate | char(19) |
| 35 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 36 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 37 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 38 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 39 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 40 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 41 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 42 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 43 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 44 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 45 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 46 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 47 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 48 | creationtime | creationtime | creationtime | char(19) |
| 49 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 50 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 51 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 52 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 53 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |