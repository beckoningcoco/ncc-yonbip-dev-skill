# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10971.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_property_setting | pk_property_setting | pk_property_setting | char(20) | √ |
| 2 | islock | islock | islock | char(1) |
| 3 | position | position | position | number(38, 0) | √ |
| 4 | property_id | property_id | property_id | varchar2(20) | √ |
| 5 | user_template_id | user_template_id | user_template_id | varchar2(20) | √ |
| 6 | visible | visible | visible | char(1) | √ |
| 7 | width | width | width | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |