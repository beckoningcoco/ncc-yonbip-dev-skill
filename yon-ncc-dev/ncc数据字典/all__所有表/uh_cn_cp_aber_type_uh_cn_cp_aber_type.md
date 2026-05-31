# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12428.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_abertype | pk_abertype | pk_abertype | char(20) | √ |
| 2 | code_type | code_type | code_type | varchar2(20) |
| 3 | name_type | name_type | name_type | varchar2(255) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) | √ |
| 5 | pk_org | pk_org | pk_org | char(20) | √ |
| 6 | right_aber | right_aber | right_aber | number(38, 0) |  |  | 0 |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |