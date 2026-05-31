# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9682.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sendreport | pk_sendreport | pk_sendreport | char(20) | √ |
| 2 | errormsg | errormsg | errormsg | varchar2(1000) |
| 3 | keyval | keyval | keyval | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 5 | pk_iufomonitor | pk_iufomonitor | pk_iufomonitor | varchar2(20) | √ |
| 6 | pk_keygroup | pk_keygroup | pk_keygroup | char(20) |
| 7 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 8 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 9 | pk_report | pk_report | pk_report | varchar2(20) | √ |
| 10 | repcode | repcode | repcode | varchar2(50) |
| 11 | repname | repname | repname | varchar2(100) |
| 12 | reports | reports | reports | char(20) | √ |
| 13 | def1 | def1 | def1 | varchar2(100) |
| 14 | def2 | def2 | def2 | varchar2(100) |
| 15 | def3 | def3 | def3 | varchar2(100) |
| 16 | def4 | def4 | def4 | varchar2(100) |
| 17 | def5 | def5 | def5 | varchar2(100) |
| 18 | def6 | def6 | def6 | varchar2(100) |
| 19 | def7 | def7 | def7 | varchar2(100) |
| 20 | def8 | def8 | def8 | varchar2(100) |
| 21 | def9 | def9 | def9 | varchar2(100) |
| 22 | def10 | def10 | def10 | varchar2(100) |
| 23 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 24 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |