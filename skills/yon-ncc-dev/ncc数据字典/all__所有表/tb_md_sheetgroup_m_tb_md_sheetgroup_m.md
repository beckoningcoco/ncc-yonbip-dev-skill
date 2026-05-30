# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12060.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | objindex | objindex | objindex | number(38, 0) |
| 3 | pk_sheet | pk_sheet | pk_sheet | varchar2(20) | √ |
| 4 | pk_sheetgroup | pk_sheetgroup | pk_sheetgroup | varchar2(20) | √ |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |