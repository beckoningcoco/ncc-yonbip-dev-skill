# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12987.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | id | id | id | varchar2(36) | √ |
| 2 | org_tree_id | org_tree_id | org_tree_id | varchar2(36) | √ |
| 3 | rel_code | rel_code | rel_code | varchar2(50) | √ |
| 4 | rel_name | rel_name | rel_name | varchar2(255) |
| 5 | rel_type | rel_type | rel_type | varchar2(20) | √ |
| 6 | storage_value | storage_value | storage_value | varchar2(255) | √ |
| 7 | ts | ts | ts | timestamp(6) |  |  | cast(sysdate as timestamp) |