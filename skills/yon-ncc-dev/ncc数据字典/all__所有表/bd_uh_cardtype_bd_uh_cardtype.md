# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7130.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardtype | pk_cardtype | pk_cardtype | char(20) | √ |
| 2 | cardformat | cardformat | cardformat | varchar2(30) |
| 3 | code | code | code | varchar2(30) | √ |
| 4 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 5 | flag_active | flag_active | flag_active | char(1) | √ |
| 6 | flag_sys | flag_sys | flag_sys | char(1) |
| 7 | genetype | genetype | genetype | varchar2(50) |
| 8 | innercode | innercode | innercode | varchar2(50) |
| 9 | name | name | name | varchar2(50) | √ |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_idrule | pk_idrule | pk_idrule | varchar2(50) |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |