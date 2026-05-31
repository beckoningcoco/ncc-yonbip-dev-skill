# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8175.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherstyle | pk_voucherstyle | pk_voucherstyle | char(20) | √ |
| 2 | pk_accbook | pk_accbook | pk_accbook | varchar2(20) |
| 3 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 4 | voucherstyle_level | voucherstyle_level | voucherstyle_level | number(38, 0) |
| 5 | voucherstyle_name | voucherstyle_name | voucherstyle_name | varchar2(50) |
| 6 | voucherstyle_value | voucherstyle_value | voucherstyle_value | varchar2(50) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |