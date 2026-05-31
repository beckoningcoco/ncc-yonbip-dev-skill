# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11578.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_colorkey | pk_colorkey | pk_colorkey | varchar2(30) | √ |
| 2 | colorname | colorname | colorname | varchar2(50) |
| 3 | colororder | colororder | colororder | number(38, 0) |
| 4 | pk_labelcolorkey | pk_labelcolorkey | pk_labelcolorkey | varchar2(40) |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |