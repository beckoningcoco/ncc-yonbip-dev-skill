# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9928.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cposourceid | cposourceid | cposourceid | char(20) | √ |
| 2 | cassmeasureid | cassmeasureid | cassmeasureid | varchar2(20) |  |  | '~' |
| 3 | cfirstbillid | cfirstbillid | cfirstbillid | char(20) |
| 4 | cfirstbillrowid | cfirstbillrowid | cfirstbillrowid | char(20) |
| 5 | cmeasureid | cmeasureid | cmeasureid | varchar2(20) |  |  | '~' |
| 6 | cpoid | cpoid | cpoid | char(20) |
| 7 | csourcebillid | csourcebillid | csourcebillid | char(20) |
| 8 | csourcebillrowid | csourcebillrowid | csourcebillrowid | char(20) |
| 9 | fsourcemode | fsourcemode | fsourcemode | number(38, 0) |
| 10 | nastnum | nastnum | nastnum | number(20, 8) |
| 11 | nnumber | nnumber | nnumber | number(20, 8) |
| 12 | pk_group | pk_group | pk_group | char(20) |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 15 | vnote | vnote | vnote | varchar2(200) |
| 16 | vsourcebillcode | vsourcebillcode | vsourcebillcode | varchar2(40) |
| 17 | vsourcebilltype | vsourcebilltype | vsourcebilltype | varchar2(4) |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |