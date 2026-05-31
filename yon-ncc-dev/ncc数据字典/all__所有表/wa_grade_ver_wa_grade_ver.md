# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12872.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wa_gradever | pk_wa_gradever | pk_wa_gradever | char(20) | √ |
| 2 | effect_flag | effect_flag | effect_flag | char(1) |
| 3 | gradever_name | gradever_name | gradever_name | varchar2(100) |
| 4 | gradever_num | gradever_num | gradever_num | number(31, 8) |
| 5 | pk_wa_grd | pk_wa_grd | pk_wa_grd | varchar2(20) | √ |
| 6 | ver_create_date | ver_create_date | ver_create_date | char(19) |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |