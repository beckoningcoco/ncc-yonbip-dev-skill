# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8492.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmaptemplet | pk_docmaptemplet | pk_docmaptemplet | char(20) | √ |
| 2 | pk_desorgbook | pk_desorgbook | pk_desorgbook | varchar2(20) |
| 3 | pk_srcorgbook | pk_srcorgbook | pk_srcorgbook | varchar2(20) |
| 4 | templetcode | templetcode | templetcode | varchar2(40) |
| 5 | templetname | templetname | templetname | varchar2(200) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |