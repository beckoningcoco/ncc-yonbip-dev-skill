# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9212.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticedepositapply | pk_noticedepositapply | pk_noticedepositapply | char(20) | √ |
| 2 | applydate | applydate | applydate | char(19) |
| 3 | approvedate | approvedate | approvedate | char(19) |
| 4 | approvenote | approvenote | approvenote | varchar2(1024) |
| 5 | approver | approver | approver | varchar2(20) |  |  | '~' |
| 6 | billmakedate | billmakedate | billmakedate | char(19) |
| 7 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 8 | billstate | billstate | billstate | number(38, 0) |
| 9 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 10 | consigndate | consigndate | consigndate | char(19) |
| 11 | consigner | consigner | consigner | varchar2(20) |  |  | '~' |
| 12 | depositamount | depositamount | depositamount | number(28, 8) |
| 13 | noticeaccname | noticeaccname | noticeaccname | varchar2(300) |
| 14 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 15 | noticeyrate | noticeyrate | noticeyrate | number(28, 8) |
| 16 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 17 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 18 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 19 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 20 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 21 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 22 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 23 | pk_noticerate | pk_noticerate | pk_noticerate | varchar2(20) |  |  | '~' |
| 24 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 25 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 26 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 27 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 28 | remark | remark | remark | varchar2(50) |
| 29 | returnflag | returnflag | returnflag | char(1) |
| 30 | returnnote | returnnote | returnnote | varchar2(300) |
| 31 | settleaccname | settleaccname | settleaccname | varchar2(300) |
| 32 | submitdate | submitdate | submitdate | char(19) |
| 33 | submiter | submiter | submiter | varchar2(20) |  |  | '~' |
| 34 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 35 | vbillstate | vbillstate | vbillstate | number(38, 0) |
| 36 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 37 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 38 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 39 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 40 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 41 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 42 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 43 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 44 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 45 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 46 | creationtime | creationtime | creationtime | char(19) |
| 47 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 48 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 49 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 50 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 51 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |