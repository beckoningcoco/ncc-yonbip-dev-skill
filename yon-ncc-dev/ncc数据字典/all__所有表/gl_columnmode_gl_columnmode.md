# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8448.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_columnmode | pk_columnmode | pk_columnmode | char(20) | √ |
| 2 | alignment | alignment | alignment | number(38, 0) | √ |
| 3 | columnclass | columnclass | columnclass | varchar2(200) |
| 4 | columneditable | columneditable | columneditable | char(1) | √ |
| 5 | columnindex | columnindex | columnindex | number(38, 0) | √ |
| 6 | columnkey | columnkey | columnkey | number(38, 0) | √ |
| 7 | columnname | columnname | columnname | varchar2(40) | √ |
| 8 | columnstringkey | columnstringkey | columnstringkey | char(20) |
| 9 | columnvisiable | columnvisiable | columnvisiable | char(1) | √ |
| 10 | columnwidth | columnwidth | columnwidth | number(38, 0) |
| 11 | datatype | datatype | datatype | number(38, 0) |
| 12 | isfrozen | isfrozen | isfrozen | char(1) | √ |
| 13 | islinewrap | islinewrap | islinewrap | char(1) | √ |
| 14 | pk_fathercolumn | pk_fathercolumn | pk_fathercolumn | char(20) |
| 15 | pk_vouchermode | pk_vouchermode | pk_vouchermode | char(20) | √ |
| 16 | reftable | reftable | reftable | varchar2(100) |
| 17 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |