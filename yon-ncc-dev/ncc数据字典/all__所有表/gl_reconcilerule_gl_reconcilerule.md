# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilerule | pk_reconcilerule | pk_reconcilerule | char(20) | √ |
| 2 | code | code | code | varchar2(40) |
| 3 | createorg | createorg | createorg | varchar2(20) |  |  | '~' |
| 4 | createtime | createtime | createtime | char(19) |
| 5 | crtelimvoucher | crtelimvoucher | crtelimvoucher | char(1) |
| 6 | dealmethod | dealmethod | dealmethod | char(1) |
| 7 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 1 |
| 8 | explanation | explanation | explanation | varchar2(200) |
| 9 | name | name | name | varchar2(100) |
| 10 | pk_contrastrule | pk_contrastrule | pk_contrastrule | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 13 | rowno | rowno | rowno | number(38, 0) |
| 14 | selfassallsame | selfassallsame | selfassallsame | char(1) |
| 15 | sendmethod | sendmethod | sendmethod | char(50) |
| 16 | startdate | startdate | startdate | char(19) |
| 17 | startstatus | startstatus | startstatus | number(38, 0) |  |  | 2 |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |