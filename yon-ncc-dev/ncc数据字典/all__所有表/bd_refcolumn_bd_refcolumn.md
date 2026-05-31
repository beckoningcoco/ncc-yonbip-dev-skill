# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7049.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_refcolumn | pk_refcolumn | pk_refcolumn | char(20) | √ |
| 2 | columnshowindex | columnshowindex | columnshowindex | number(38, 0) |
| 3 | datatype | datatype | datatype | number(38, 0) |  |  | 0 |
| 4 | fieldname | fieldname | fieldname | varchar2(200) | √ |
| 5 | fieldshowname | fieldshowname | fieldshowname | varchar2(900) |
| 6 | isblurfield | isblurfield | isblurfield | char(1) |
| 7 | iscolumnshow | iscolumnshow | iscolumnshow | char(1) |
| 8 | ishiddenfield | ishiddenfield | ishiddenfield | char(1) |
| 9 | islocateshow | islocateshow | islocateshow | char(1) |
| 10 | ismnecode | ismnecode | ismnecode | char(1) |
| 11 | ispkfield | ispkfield | ispkfield | char(1) |
| 12 | locateshowindex | locateshowindex | locateshowindex | number(38, 0) |
| 13 | pk_reftable | pk_reftable | pk_reftable | char(20) | √ |
| 14 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |