# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fte_role | pk_fte_role | pk_fte_role | char(20) | √ |
| 2 | formula | formula | formula | varchar2(4000) |
| 3 | formula_sql | formula_sql | formula_sql | varchar2(4000) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 6 | pk_period | pk_period | pk_period | varchar2(20) |  |  | '~' |
| 7 | role_type | role_type | role_type | number(38, 0) |
| 8 | creationtime | creationtime | creationtime | char(19) |
| 9 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 12 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |