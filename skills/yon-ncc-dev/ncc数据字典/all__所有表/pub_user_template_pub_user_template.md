# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11001.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_user_template | pk_user_template | pk_user_template | char(20) | √ |
| 2 | area_id | area_id | area_id | varchar2(100) |
| 3 | area_type | area_type | area_type | number(38, 0) |
| 4 | template_id | template_id | template_id | varchar2(20) |
| 5 | user_id | user_id | user_id | varchar2(20) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |