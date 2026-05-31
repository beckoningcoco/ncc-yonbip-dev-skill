# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6965.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_knowbase | pk_knowbase | pk_knowbase | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | eu_knowtype | eu_knowtype | eu_knowtype | varchar2(20) |
| 4 | inner_ver | inner_ver | inner_ver | number(38, 0) |
| 5 | name | name | name | varchar2(50) |
| 6 | pk_create_dept | pk_create_dept | pk_create_dept | varchar2(20) |
| 7 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 8 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 9 | ver | ver | ver | varchar2(50) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |