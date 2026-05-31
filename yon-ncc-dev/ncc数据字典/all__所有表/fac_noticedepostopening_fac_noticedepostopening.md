# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8079.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticedepostopening | pk_noticedepostopening | pk_noticedepostopening | char(20) | √ |
| 2 | billmakedate | billmakedate | billmakedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 6 | confirmdate | confirmdate | confirmdate | char(19) |
| 7 | depositcode | depositcode | depositcode | varchar2(50) |
| 8 | depositdate | depositdate | depositdate | char(19) |
| 9 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 10 | glcdepositbalance | glcdepositbalance | glcdepositbalance | number(28, 8) |
| 11 | glcrate | glcrate | glcrate | number(28, 8) |
| 12 | gllcdepositbalance | gllcdepositbalance | gllcdepositbalance | number(28, 8) |
| 13 | gllcrate | gllcrate | gllcrate | number(28, 8) |
| 14 | isinitial | isinitial | isinitial | char(1) |
| 15 | noticeaccname | noticeaccname | noticeaccname | varchar2(50) |
| 16 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 17 | noticeyrate | noticeyrate | noticeyrate | number(28, 8) |
| 18 | olcdepositbalance | olcdepositbalance | olcdepositbalance | number(28, 8) |
| 19 | olcrate | olcrate | olcrate | number(28, 8) |
| 20 | pk_aiacrate | pk_aiacrate | pk_aiacrate | varchar2(20) |  |  | '~' |
| 21 | pk_billtypecode | pk_billtypecode | pk_billtypecode | varchar2(50) |
| 22 | pk_billtypeid | pk_billtypeid | pk_billtypeid | char(20) |
| 23 | pk_confirm | pk_confirm | pk_confirm | varchar2(20) |  |  | '~' |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 28 | pk_noticerate | pk_noticerate | pk_noticerate | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 32 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 33 | remark | remark | remark | varchar2(50) |
| 34 | settleaccname | settleaccname | settleaccname | varchar2(50) |
| 35 | vbillcode | vbillcode | vbillcode | varchar2(50) |
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