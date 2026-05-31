# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8833.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rpt_auth | pk_rpt_auth | pk_rpt_auth | char(20) | √ |
| 2 | auth | auth | auth | number(38, 0) |
| 3 | authtype | authtype | authtype | number(38, 0) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_rpt_def | pk_rpt_def | pk_rpt_def | char(20) |
| 7 | refpk | refpk | refpk | char(20) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | char(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | char(20) |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |