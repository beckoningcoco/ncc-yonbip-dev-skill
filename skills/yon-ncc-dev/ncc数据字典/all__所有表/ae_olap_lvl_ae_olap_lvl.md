# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6453.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_level | pk_level | pk_level | char(20) | √ |
| 2 | captioncolumn | captioncolumn | captioncolumn | varchar2(50) |
| 3 | extfield | extfield | extfield | varchar2(2000) |
| 4 | gradecode | gradecode | gradecode | varchar2(30) |
| 5 | hidecondition | hidecondition | hidecondition | number(38, 0) |
| 6 | isvisible | isvisible | isvisible | number(38, 0) |
| 7 | jointable | jointable | jointable | varchar2(50) |
| 8 | levelid | levelid | levelid | varchar2(100) | √ |
| 9 | levelname | levelname | levelname | varchar2(200) |
| 10 | leveltype | leveltype | leveltype | number(38, 0) |
| 11 | namecolumn | namecolumn | namecolumn | varchar2(50) | √ |
| 12 | ordinalcolumn | ordinalcolumn | ordinalcolumn | varchar2(50) |
| 13 | parentcolumn | parentcolumn | parentcolumn | varchar2(50) |
| 14 | parentvalue4null | parentvalue4null | parentvalue4null | varchar2(50) |
| 15 | pk_hierarchy | pk_hierarchy | pk_hierarchy | char(20) | √ |
| 16 | uniquemember | uniquemember | uniquemember | number(38, 0) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |