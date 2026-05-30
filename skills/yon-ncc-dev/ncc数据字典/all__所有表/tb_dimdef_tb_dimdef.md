# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12007.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_obj | pk_obj | pk_obj | char(20) | √ |
| 2 | createdtime | createdtime | createdtime | char(20) |
| 3 | description | description | description | varchar2(255) |
| 4 | dimtype | dimtype | dimtype | varchar2(30) | √ |
| 5 | modifiedby | modifiedby | modifiedby | varchar2(20) |
| 6 | objcode | objcode | objcode | varchar2(50) | √ |
| 7 | objname | objname | objname | varchar2(100) | √ |
| 8 | objname2 | objname2 | objname2 | varchar2(100) |
| 9 | objname3 | objname3 | objname3 | varchar2(100) |
| 10 | objname4 | objname4 | objname4 | varchar2(100) |
| 11 | objname5 | objname5 | objname5 | varchar2(100) |
| 12 | objname6 | objname6 | objname6 | varchar2(100) |
| 13 | pk_mapdimdef | pk_mapdimdef | pk_mapdimdef | varchar2(20) |
| 14 | creator | creator | creator | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(20) |
| 17 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |