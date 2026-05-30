# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9204.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixredepositrcpt | pk_fixredepositrcpt | pk_fixredepositrcpt | char(20) | √ |
| 2 | acceptdate | acceptdate | acceptdate | char(19) |
| 3 | billdate | billdate | billdate | char(19) |
| 4 | billmakedate | billmakedate | billmakedate | char(19) |
| 5 | billmaker | billmaker | billmaker | varchar2(20) |  |  | '~' |
| 6 | billstatus | billstatus | billstatus | varchar2(10) |
| 7 | billtype | billtype | billtype | varchar2(50) |  |  | '~' |
| 8 | businessvariety | businessvariety | businessvariety | varchar2(20) |  |  | '~' |
| 9 | depositcode | depositcode | depositcode | varchar2(20) |  |  | '~' |
| 10 | depositinterval | depositinterval | depositinterval | number(38, 0) |
| 11 | deposityrate | deposityrate | deposityrate | number(28, 8) |
| 12 | depostbalmnt | depostbalmnt | depostbalmnt | number(28, 8) |
| 13 | depostperiod | depostperiod | depostperiod | varchar2(50) |
| 14 | enddate | enddate | enddate | char(19) |
| 15 | glcamount | glcamount | glcamount | number(28, 8) |
| 16 | glcrate | glcrate | glcrate | number(15, 8) |
| 17 | gllcamount | gllcamount | gllcamount | number(28, 8) |
| 18 | gllcrate | gllcrate | gllcrate | number(15, 8) |
| 19 | intervalunit | intervalunit | intervalunit | varchar2(50) |
| 20 | olcamount | olcamount | olcamount | number(28, 8) |
| 21 | olcrate | olcrate | olcrate | number(15, 8) |
| 22 | pk_billtypeid | pk_billtypeid | pk_billtypeid | varchar2(20) |  |  | '~' |
| 23 | pk_costcenter | pk_costcenter | pk_costcenter | varchar2(20) |  |  | '~' |
| 24 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 25 | pk_depositacc | pk_depositacc | pk_depositacc | varchar2(20) |  |  | '~' |
| 26 | pk_depostrate | pk_depostrate | pk_depostrate | varchar2(20) |  |  | '~' |
| 27 | pk_fundorg | pk_fundorg | pk_fundorg | varchar2(20) |  |  | '~' |
| 28 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 29 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 30 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 31 | pk_profitcenter | pk_profitcenter | pk_profitcenter | varchar2(20) |  |  | '~' |
| 32 | pk_settleacc | pk_settleacc | pk_settleacc | varchar2(20) |  |  | '~' |
| 33 | pk_srcbill | pk_srcbill | pk_srcbill | varchar2(50) |
| 34 | pk_srcbilltype | pk_srcbilltype | pk_srcbilltype | varchar2(20) |  |  | '~' |
| 35 | redepositamount | redepositamount | redepositamount | number(28, 8) |
| 36 | redeposittype | redeposittype | redeposittype | varchar2(50) |
| 37 | remark | remark | remark | varchar2(181) |
| 38 | saga_btxid | saga_btxid | saga_btxid | varchar2(64) |
| 39 | saga_frozen | saga_frozen | saga_frozen | number(38, 0) |
| 40 | saga_gtxid | saga_gtxid | saga_gtxid | varchar2(64) |
| 41 | saga_status | saga_status | saga_status | number(38, 0) |
| 42 | tallydate | tallydate | tallydate | char(19) |
| 43 | tallyuser | tallyuser | tallyuser | varchar2(20) |  |  | '~' |
| 44 | vbillcode | vbillcode | vbillcode | varchar2(50) |
| 45 | vdef1 | vdef1 | vdef1 | varchar2(101) |
| 46 | vdef2 | vdef2 | vdef2 | varchar2(101) |
| 47 | vdef3 | vdef3 | vdef3 | varchar2(101) |
| 48 | vdef4 | vdef4 | vdef4 | varchar2(101) |
| 49 | vdef5 | vdef5 | vdef5 | varchar2(101) |
| 50 | vdef6 | vdef6 | vdef6 | varchar2(101) |
| 51 | vdef7 | vdef7 | vdef7 | varchar2(101) |
| 52 | vdef8 | vdef8 | vdef8 | varchar2(101) |
| 53 | vdef9 | vdef9 | vdef9 | varchar2(101) |
| 54 | vdef10 | vdef10 | vdef10 | varchar2(101) |
| 55 | creationtime | creationtime | creationtime | char(19) |
| 56 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 57 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 58 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 59 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 60 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |