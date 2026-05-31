# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7304.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | defcode | defcode | defcode | varchar2(50) |
| 5 | defname | defname | defname | varchar2(300) |
| 6 | defname2 | defname2 | defname2 | varchar2(300) |
| 7 | defname3 | defname3 | defname3 | varchar2(300) |
| 8 | defname4 | defname4 | defname4 | varchar2(300) |
| 9 | defname5 | defname5 | defname5 | varchar2(300) |
| 10 | defname6 | defname6 | defname6 | varchar2(300) |
| 11 | dirid | dirid | dirid | varchar2(50) |
| 12 | dsname | dsname | dsname | varchar2(50) |
| 13 | model | model | model | blob |
| 14 | note | note | note | varchar2(1536) |
| 15 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 16 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 17 | sysinit | sysinit | sysinit | varchar2(50) |
| 18 | creationtime | creationtime | creationtime | char(19) |
| 19 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 20 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 21 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 22 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 23 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |