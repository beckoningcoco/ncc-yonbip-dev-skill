# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6834.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_scope | pk_scope | pk_scope | char(20) | √ |
| 2 | entitytype | entitytype | entitytype | number(38, 0) | √ |
| 3 | obj_name | obj_name | obj_name | varchar2(50) |
| 4 | pk_entity | pk_entity | pk_entity | varchar2(36) |
| 5 | pk_rule | pk_rule | pk_rule | varchar2(20) |  |  | '~' |
| 6 | tag_group | tag_group | tag_group | varchar2(50) |
| 7 | tag_org | tag_org | tag_org | varchar2(50) |
| 8 | def1 | def1 | def1 | varchar2(50) |
| 9 | def2 | def2 | def2 | varchar2(50) |
| 10 | def3 | def3 | def3 | varchar2(50) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |