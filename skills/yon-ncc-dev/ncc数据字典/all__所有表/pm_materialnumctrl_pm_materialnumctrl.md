# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_matnumctrl | pk_matnumctrl | pk_matnumctrl | char(20) | √ |
| 2 | control_name | control_name | control_name | varchar2(300) |
| 3 | control_name2 | control_name2 | control_name2 | varchar2(300) |
| 4 | control_name3 | control_name3 | control_name3 | varchar2(300) |
| 5 | control_name4 | control_name4 | control_name4 | varchar2(300) |
| 6 | control_name5 | control_name5 | control_name5 | varchar2(300) |
| 7 | control_name6 | control_name6 | control_name6 | varchar2(300) |
| 8 | control_type | control_type | control_type | number(38, 0) |
| 9 | enablestate | enablestate | enablestate | number(38, 0) |  |  | 2 |
| 10 | memo | memo | memo | varchar2(200) |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_material | pk_material | pk_material | varchar2(20) |  |  | '~' |
| 13 | pk_materialtype | pk_materialtype | pk_materialtype | varchar2(20) |  |  | '~' |
| 14 | pk_material_v | pk_material_v | pk_material_v | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | creationtime | creationtime | creationtime | char(19) |
| 17 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 18 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 19 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 20 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 21 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |