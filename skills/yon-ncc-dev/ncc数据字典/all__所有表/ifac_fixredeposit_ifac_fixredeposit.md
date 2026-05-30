# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9203.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixredeposit | pk_fixredeposit | pk_fixredeposit | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billmakedate | billmakedate | billmakedate | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 7 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 8 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 9 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 10 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 11 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 12 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 13 | enddate | enddate | enddate | char(19) |
| 14 | glcamount | glcamount | glcamount | number(28, 8) |
| 15 | glcrate | glcrate | glcrate | number(15, 8) |
| 16 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 17 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 18 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 19 | olcamount | olcamount | olcamount | number(28, 8) |
| 20 | olcrate | olcrate | olcrate | number(15, 8) |
| 21 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 22 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 23 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 24 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 25 | pk_depositorg | pk_depositorg | pk_depositorg | varchar2(20) |  |  | '~' |
| 26 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 29 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 30 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 31 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 32 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 33 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 34 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 35 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 36 | remark | remark | remark | varchar2(181) |
| 37 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 38 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 39 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 40 | saga_status | saga_status | saga_status | number(38, 0) |
| 41 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 42 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 43 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 44 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 45 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 46 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 47 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 48 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 49 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 50 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 51 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 52 | creationtime | creationtime | creationtime | char(19) |
| 53 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 54 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 55 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 56 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 57 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |