# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8457.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_contrastinit | pk_contrastinit | pk_contrastinit | char(20) | √ |
| 2 | amount | amount | amount | number(28, 8) |  |  | 0 |
| 3 | assid | assid | assid | char(20) |  |  | '~' |
| 4 | direction | direction | direction | varchar2(50) |
| 5 | globalamount | globalamount | globalamount | number(28, 8) |  |  | 0 |
| 6 | groupamount | groupamount | groupamount | number(28, 8) |  |  | 0 |
| 7 | iscontrasted | iscontrasted | iscontrasted | char(1) |
| 8 | istransfered | istransfered | istransfered | char(1) |
| 9 | locamount | locamount | locamount | number(28, 8) |  |  | 0 |
| 10 | pk_accasoa | pk_accasoa | pk_accasoa | varchar2(20) |  |  | '~' |
| 11 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(20) |  |  | '~' |
| 12 | pk_contrastrule | pk_contrastrule | pk_contrastrule | varchar2(20) |  |  | '~' |
| 13 | pk_currtype | pk_currtype | pk_currtype | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | quantity | quantity | quantity | number(28, 8) |  |  | 0 |
| 16 | speriod | speriod | speriod | varchar2(50) |
| 17 | startdate | startdate | startdate | char(19) |  |  | '~' |
| 18 | syear | syear | syear | varchar2(50) |
| 19 | creationtime | creationtime | creationtime | char(19) |
| 20 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 21 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 22 | modifiedtime | modifiedtime | modifiedtime | char(19) |  |  | '~' |
| 23 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |