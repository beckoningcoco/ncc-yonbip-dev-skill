# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6950.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_id | pk_id | pk_id | char(20) | √ |
| 2 | billtypecode | billtypecode | billtypecode | varchar2(50) |
| 3 | code | code | code | varchar2(50) |
| 4 | name | name | name | varchar2(50) |
| 5 | orgrefclass | orgrefclass | orgrefclass | varchar2(500) |
| 6 | pk_billtypecode | pk_billtypecode | pk_billtypecode | char(20) |
| 7 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |