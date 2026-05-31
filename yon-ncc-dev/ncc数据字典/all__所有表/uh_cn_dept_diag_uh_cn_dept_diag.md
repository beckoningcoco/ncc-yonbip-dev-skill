# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12458.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deptdiag | pk_deptdiag | pk_deptdiag | char(20) | √ |
| 2 | comm_diagname1 | comm_diagname1 | comm_diagname1 | varchar2(200) |
| 3 | comm_diagname2 | comm_diagname2 | comm_diagname2 | varchar2(200) |
| 4 | comm_diagname3 | comm_diagname3 | comm_diagname3 | varchar2(200) |
| 5 | comm_mnecode1 | comm_mnecode1 | comm_mnecode1 | varchar2(50) |
| 6 | comm_mnecode2 | comm_mnecode2 | comm_mnecode2 | varchar2(50) |
| 7 | comm_mnecode3 | comm_mnecode3 | comm_mnecode3 | varchar2(50) |
| 8 | diagcode | diagcode | diagcode | varchar2(50) |
| 9 | diagname | diagname | diagname | varchar2(200) |
| 10 | pk_dept | pk_dept | pk_dept | varchar2(20) |
| 11 | pk_diag | pk_diag | pk_diag | char(20) |
| 12 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 13 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |