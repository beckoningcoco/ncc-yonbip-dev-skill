# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6459.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_def | pk_def | pk_def | char(20) | √ |
| 2 | defcode | defcode | defcode | varchar2(50) |
| 3 | defname | defname | defname | varchar2(100) |
| 4 | note | note | note | varchar2(500) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |
| 6 | pk_org | pk_org | pk_org | varchar2(20) |
| 7 | qualitycheckmodel | qualitycheckmodel | qualitycheckmodel | blob |
| 8 | resdir | resdir | resdir | varchar2(50) |
| 9 | resid | resid | resid | varchar2(50) |
| 10 | creationtime | creationtime | creationtime | char(19) |
| 11 | creator | creator | creator | varchar2(20) |
| 12 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 13 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 14 | modifier | modifier | modifier | varchar2(20) |
| 15 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |