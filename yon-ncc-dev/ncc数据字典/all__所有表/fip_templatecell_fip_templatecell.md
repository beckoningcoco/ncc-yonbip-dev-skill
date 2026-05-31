# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8332.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_templatecell | pk_templatecell | pk_templatecell | char(20) | √ |
| 2 | attrcode | attrcode | attrcode | varchar2(50) |
| 3 | attrname | attrname | attrname | varchar2(50) |
| 4 | cellvalue | cellvalue | cellvalue | varchar2(2000) |
| 5 | columnindex | columnindex | columnindex | number(38, 0) |
| 6 | datatype | datatype | datatype | number(38, 0) |
| 7 | pk_templaterow | pk_templaterow | pk_templaterow | char(20) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |