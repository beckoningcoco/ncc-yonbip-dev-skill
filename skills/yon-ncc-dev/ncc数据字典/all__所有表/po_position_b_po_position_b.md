# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10782.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_position_b | pk_position_b | pk_position_b | char(20) | √ |
| 2 | fflag | fflag | fflag | number(38, 0) |  |  | 1 |
| 3 | marbasclass_code | marbasclass_code | marbasclass_code | varchar2(50) |
| 4 | marpuclass_code | marpuclass_code | marpuclass_code | varchar2(50) |
| 5 | material_code | material_code | material_code | varchar2(50) |
| 6 | pk_marbasclass | pk_marbasclass | pk_marbasclass | varchar2(20) |  |  | '~' |
| 7 | pk_marpuclass | pk_marpuclass | pk_marpuclass | varchar2(20) |  |  | '~' |
| 8 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_position | pk_position | pk_position | char(20) | √ |
| 11 | pk_srcmaterial | pk_srcmaterial | pk_srcmaterial | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |