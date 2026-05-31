# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12010.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | approxmembercount | approxmembercount | approxmembercount | number(38, 0) | √ |
| 3 | leveltype | leveltype | leveltype | varchar2(30) | √ |
| 4 | objcode | objcode | objcode | varchar2(50) | √ |
| 5 | objname | objname | objname | varchar2(100) | √ |
| 6 | objname2 | objname2 | objname2 | varchar2(100) |
| 7 | objname3 | objname3 | objname3 | varchar2(100) |
| 8 | objname4 | objname4 | objname4 | varchar2(100) |
| 9 | objname5 | objname5 | objname5 | varchar2(100) |
| 10 | objname6 | objname6 | objname6 | varchar2(100) |
| 11 | pk_dimdef | pk_dimdef | pk_dimdef | char(20) | √ |
| 12 | treelevel | treelevel | treelevel | char(1) | √ |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |