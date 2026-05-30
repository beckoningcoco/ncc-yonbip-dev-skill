# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10446.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_spare_part | pk_spare_part | pk_spare_part | char(20) | √ |
| 2 | ass_num | ass_num | ass_num | number(28, 8) |
| 3 | ass_unit | ass_unit | ass_unit | varchar2(20) |  |  | '~' |
| 4 | change_rate | change_rate | change_rate | varchar2(50) |
| 5 | memo | memo | memo | varchar2(200) |
| 6 | num | num | num | number(28, 8) |
| 7 | pk_equip | pk_equip | pk_equip | char(20) | √ |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 10 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 11 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 12 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 13 | serial_num | serial_num | serial_num | varchar2(150) |
| 14 | unit | unit | unit | varchar2(20) |  |  | '~' |
| 15 | def1 | def1 | def1 | varchar2(101) |
| 16 | def2 | def2 | def2 | varchar2(101) |
| 17 | def3 | def3 | def3 | varchar2(101) |
| 18 | def4 | def4 | def4 | varchar2(101) |
| 19 | def5 | def5 | def5 | varchar2(101) |
| 20 | def6 | def6 | def6 | varchar2(101) |
| 21 | def7 | def7 | def7 | varchar2(101) |
| 22 | def8 | def8 | def8 | varchar2(101) |
| 23 | def9 | def9 | def9 | varchar2(101) |
| 24 | def10 | def10 | def10 | varchar2(101) |
| 25 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 26 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |