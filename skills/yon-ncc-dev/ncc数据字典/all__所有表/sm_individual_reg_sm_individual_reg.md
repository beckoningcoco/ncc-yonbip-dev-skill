# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11561.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_individualreg | pk_individualreg | pk_individualreg | varchar2(20) | √ |
| 2 | code | code | code | varchar2(50) | √ |
| 3 | name | name | name | varchar2(100) | √ |
| 4 | page_part_url | page_part_url | page_part_url | varchar2(200) |
| 5 | parent_id | parent_id | parent_id | varchar2(50) |
| 6 | resourceid | resourceid | resourceid | varchar2(50) |
| 7 | resourcepath | resourcepath | resourcepath | varchar2(200) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |