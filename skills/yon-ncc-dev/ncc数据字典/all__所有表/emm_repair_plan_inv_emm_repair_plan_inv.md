# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7884.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_repair_plan_inv | pk_repair_plan_inv | pk_repair_plan_inv | char(20) | √ |
| 2 | applynum | applynum | applynum | number(28, 8) |
| 3 | buynum | buynum | buynum | number(28, 8) |
| 4 | castunitid | castunitid | castunitid | varchar2(20) |  |  | '~' |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | money_org | money_org | money_org | number(28, 8) |
| 7 | nassistnum | nassistnum | nassistnum | number(28, 8) |
| 8 | nnum | nnum | nnum | number(28, 8) |
| 9 | outer_flag | outer_flag | outer_flag | char(1) |
| 10 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 11 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 12 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 13 | pk_measdoc | pk_measdoc | pk_measdoc | varchar2(20) |  |  | '~' |
| 14 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 15 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 16 | pk_repair_plan_b | pk_repair_plan_b | pk_repair_plan_b | char(20) | √ |
| 17 | pk_stockorg | pk_stockorg | pk_stockorg | varchar2(20) |  |  | '~' |
| 18 | pk_stockorg_v | pk_stockorg_v | pk_stockorg_v | varchar2(20) |  |  | '~' |
| 19 | pk_stordoc | pk_stordoc | pk_stordoc | varchar2(20) |  |  | '~' |
| 20 | price_org | price_org | price_org | number(28, 8) |
| 21 | required_date | required_date | required_date | char(19) |
| 22 | rowno | rowno | rowno | varchar2(30) |
| 23 | sequence_num | sequence_num | sequence_num | number(38, 0) |
| 24 | vchangerate | vchangerate | vchangerate | varchar2(60) |
| 25 | def1 | def1 | def1 | varchar2(101) |
| 26 | def2 | def2 | def2 | varchar2(101) |
| 27 | def3 | def3 | def3 | varchar2(101) |
| 28 | def4 | def4 | def4 | varchar2(101) |
| 29 | def5 | def5 | def5 | varchar2(101) |
| 30 | def6 | def6 | def6 | varchar2(101) |
| 31 | def7 | def7 | def7 | varchar2(101) |
| 32 | def8 | def8 | def8 | varchar2(101) |
| 33 | def9 | def9 | def9 | varchar2(101) |
| 34 | def10 | def10 | def10 | varchar2(101) |
| 35 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 36 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |