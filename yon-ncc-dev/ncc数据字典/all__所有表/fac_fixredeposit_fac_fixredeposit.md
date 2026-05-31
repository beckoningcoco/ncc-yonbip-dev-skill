# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8072.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | billdate | billdate | billdate | char(19) |
| 2 | billmakedate | billmakedate | billmakedate | char(19) |
| 3 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 4 | billstate | billstate | billstate | number(38, 0) |
| 5 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 6 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 7 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 8 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 9 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 10 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 11 | enddate | enddate | enddate | char(19) |
| 12 | glcamount | glcamount | glcamount | number(28, 8) |
| 13 | glcrate | glcrate | glcrate | number(15, 8) |
| 14 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 15 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 16 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 17 | olcamount | olcamount | olcamount | number(28, 8) |
| 18 | olcrate | olcrate | olcrate | number(15, 8) |
| 19 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 20 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 21 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 22 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 23 | pk_depositbank | pk_depositbank | pk_depositbank | varchar2(20) |  |  | '~' |
| 24 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 25 | pk_fixredeposit | pk_fixredeposit | pk_fixredeposit | char(20) | √ |
| 26 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 27 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 28 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 29 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 30 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 31 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 32 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 33 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 34 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 35 | remark | remark | remark | varchar2(181) |
| 36 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 37 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 38 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 39 | saga_status | saga_status | saga_status | number(38, 0) |
| 40 | tallydate | tallydate | tallydate | char(19) |
| 41 | tallyperson | tallyperson | tallyperson | varchar2(20) |  |  | '~' |
| 42 | vbillcode | vbillcode | vbillcode | varchar2(50) |
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