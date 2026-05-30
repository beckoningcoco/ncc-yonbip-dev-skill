# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11069.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_qpstandard_b | pk_qpstandard_b | pk_qpstandard_b | varchar2(50) | √ |
| 2 | bincludelower | bincludelower | bincludelower | char(1) |  |  | 'Y' |
| 3 | bincludeupper | bincludeupper | bincludeupper | char(1) |  |  | 'N' |
| 4 | dadjustvalue | dadjustvalue | dadjustvalue | number(28, 8) |
| 5 | dbasevalue | dbasevalue | dbasevalue | number(28, 8) |
| 6 | fadjusttype | fadjusttype | fadjusttype | number(38, 0) |
| 7 | qpstandardbody | qpstandardbody | qpstandardbody | char(20) | √ |
| 8 | vaccumfrmlcode | vaccumfrmlcode | vaccumfrmlcode | varchar2(996) |
| 9 | vaccumfrmlname | vaccumfrmlname | vaccumfrmlname | varchar2(996) |
| 10 | vbmemo | vbmemo | vbmemo | varchar2(181) |
| 11 | vlower | vlower | vlower | varchar2(50) |
| 12 | vstandfrmlcode | vstandfrmlcode | vstandfrmlcode | varchar2(996) |
| 13 | vstandfrmlname | vstandfrmlname | vstandfrmlname | varchar2(996) |
| 14 | vupper | vupper | vupper | varchar2(50) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |