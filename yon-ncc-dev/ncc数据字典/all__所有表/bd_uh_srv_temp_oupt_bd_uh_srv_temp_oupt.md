# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvtemp_oupt | pk_srvtemp_oupt | pk_srvtemp_oupt | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | eu_right | eu_right | eu_right | number(38, 0) |
| 4 | mould_type | mould_type | mould_type | number(38, 0) |
| 5 | name | name | name | varchar2(50) |
| 6 | pk_dept | pk_dept | pk_dept | varchar2(50) |
| 7 | pk_diag | pk_diag | pk_diag | varchar2(50) |
| 8 | pk_father | pk_father | pk_father | varchar2(50) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_psn | pk_psn | pk_psn | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 16 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |