# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7535.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accexsign | pk_accexsign | pk_accexsign | char(20) | √ |
| 2 | accounttype | accounttype | accounttype | number(38, 0) |
| 3 | errornum | errornum | errornum | number(38, 0) |
| 4 | islock | islock | islock | char(1) |
| 5 | password | password | password | varchar2(50) |
| 6 | pk_bankaccsub | pk_bankaccsub | pk_bankaccsub | char(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |
| 9 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |
| 10 | userid | userid | userid | char(20) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |