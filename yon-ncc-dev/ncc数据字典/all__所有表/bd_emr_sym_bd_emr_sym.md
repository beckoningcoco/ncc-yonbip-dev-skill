# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6907.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrsym | pk_emrsym | pk_emrsym | char(20) | √ |
| 2 | eu_symtype | eu_symtype | eu_symtype | number(38, 0) |
| 3 | groupcode | groupcode | groupcode | varchar2(50) |
| 4 | groupname | groupname | groupname | varchar2(50) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 7 | sort | sort | sort | number(38, 0) |
| 8 | sym_font_name | sym_font_name | sym_font_name | varchar2(50) |
| 9 | sym_name | sym_name | sym_name | varchar2(50) |
| 10 | sym_value_bin | sym_value_bin | sym_value_bin | blob |
| 11 | sym_value_hex | sym_value_hex | sym_value_hex | varchar2(50) |
| 12 | creationtime | creationtime | creationtime | char(19) |
| 13 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |