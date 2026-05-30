# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10413.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_map_location_type | pk_map_location_type | pk_map_location_type | char(20) | √ |
| 2 | css_style | css_style | css_style | varchar2(200) |
| 3 | innercode | innercode | innercode | varchar2(200) |
| 4 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 5 | shape | shape | shape | number(38, 0) |
| 6 | type_level | type_level | type_level | number(38, 0) |
| 7 | type_name | type_name | type_name | varchar2(50) |
| 8 | url | url | url | varchar2(50) |
| 9 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 10 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |