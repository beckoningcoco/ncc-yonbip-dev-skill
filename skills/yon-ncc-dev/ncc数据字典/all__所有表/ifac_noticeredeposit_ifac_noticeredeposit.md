# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9216.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_noticeredeposit | pk_noticeredeposit | pk_noticeredeposit | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billmakedate | billmakedate | billmakedate | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billtype | billtype | billtype | varchar2(50) |  |  | '~' |
| 7 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 8 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 9 | depositmode | depositmode | depositmode | varchar2(50) |
| 10 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 11 | glcamount | glcamount | glcamount | number(28, 8) |
| 12 | glcrate | glcrate | glcrate | number(15, 8) |
| 13 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 14 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 15 | noticeperiod | noticeperiod | noticeperiod | number(38, 0) |
| 16 | noticeyrate | noticeyrate | noticeyrate | number(28, 8) |
| 17 | olcamount | olcamount | olcamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 23 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 24 | pk_noticeacc | pk_noticeacc | pk_noticeacc | varchar2(20) |  |  | '~' |
| 25 | pk_noticerate | pk_noticerate | pk_noticerate | varchar2(20) |  |  | '~' |
| 26 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 27 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 28 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 29 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 30 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 31 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 32 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 33 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 34 | remark | remark | remark | varchar2(181) |
| 35 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 36 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 37 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 38 | saga_status | saga_status | saga_status | number(38, 0) |
| 39 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 40 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 41 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 42 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 43 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 44 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 45 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 46 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 47 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 48 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 49 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 50 | creationtime | creationtime | creationtime | char(19) |
| 51 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 52 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 53 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 54 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 55 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |