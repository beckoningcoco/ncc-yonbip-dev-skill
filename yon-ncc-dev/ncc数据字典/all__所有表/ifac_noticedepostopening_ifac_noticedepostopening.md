# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9215.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticedepostopening | pk_noticedepostopening | pk_noticedepostopening | char(20) | √ |
| 2 | billmakedate | billmakedate | billmakedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | businessno | businessno | businessno | varchar2(50) |
| 6 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 7 | confirmdate | confirmdate | confirmdate | char(19) |
| 8 | depositcode | depositcode | depositcode | varchar2(50) |
| 9 | depositdate | depositdate | depositdate | char(19) |
| 10 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 11 | glcdepositbalance | glcdepositbalance | glcdepositbalance | number(28, 8) |
| 12 | glcrate | glcrate | glcrate | number(28, 8) |
| 13 | gllcdepositbalance | gllcdepositbalance | gllcdepositbalance | number(28, 8) |
| 14 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 15 | isinitial | isinitial | isinitial | char(1) |
| 16 | noticeaccname | noticeaccname | noticeaccname | varchar2(50) |
| 17 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 18 | noticeyrate | noticeyrate | noticeyrate | number(28, 8) |
| 19 | olcdepositbalance | olcdepositbalance | olcdepositbalance | number(28, 8) |
| 20 | olcrate | olcrate | olcrate | number(28, 8) |
| 21 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 22 | pk_billtype | pk_billtype | pk_billtype | varchar2(20) |
| 23 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(20) |
| 24 | pk_confirm | pk_confirm | pk_confirm | varchar2(20) |  |  | '~' |
| 25 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 26 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 29 | pk_noticerate | pk_noticerate | pk_noticerate | varchar2(20) |  |  | '~' |
| 30 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 31 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 32 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 33 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 34 | remark | remark | remark | varchar2(272) |
| 35 | settleaccname | settleaccname | settleaccname | varchar2(50) |
| 36 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 37 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 38 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 39 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 40 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 41 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 42 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 43 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 44 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 45 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 46 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 47 | creationtime | creationtime | creationtime | char(19) |
| 48 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 49 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 50 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 51 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 52 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |