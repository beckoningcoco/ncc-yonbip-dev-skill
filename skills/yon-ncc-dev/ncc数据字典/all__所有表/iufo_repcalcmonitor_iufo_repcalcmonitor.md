# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repcalcmonitor | pk_repcalcmonitor | pk_repcalcmonitor | char(20) | √ |
| 2 | begintime | begintime | begintime | char(19) |
| 3 | endtime | endtime | endtime | char(19) |
| 4 | errormsg | errormsg | errormsg | varchar2(1000) |
| 5 | keyval | keyval | keyval | varchar2(200) | √ |
| 6 | pk_distributesubtask | pk_distributesubtask | pk_distributesubtask | char(20) | √ |
| 7 | pk_distributetask | pk_distributetask | pk_distributetask | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 9 | pk_key_comb | pk_key_comb | pk_key_comb | char(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | pk_report | pk_report | pk_report | char(20) | √ |
| 13 | repcode | repcode | repcode | varchar2(50) | √ |
| 14 | repname | repname | repname | varchar2(200) | √ |
| 15 | state | state | state | varchar2(50) |
| 16 | taskname | taskname | taskname | varchar2(200) | √ |
| 17 | tasktype | tasktype | tasktype | varchar2(50) |
| 18 | def1 | def1 | def1 | varchar2(100) |
| 19 | def2 | def2 | def2 | varchar2(100) |
| 20 | def3 | def3 | def3 | varchar2(100) |
| 21 | def4 | def4 | def4 | varchar2(100) |
| 22 | def5 | def5 | def5 | varchar2(100) |
| 23 | def6 | def6 | def6 | varchar2(100) |
| 24 | def7 | def7 | def7 | varchar2(100) |
| 25 | def8 | def8 | def8 | varchar2(100) |
| 26 | def9 | def9 | def9 | varchar2(100) |
| 27 | def10 | def10 | def10 | varchar2(100) |
| 28 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 29 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |