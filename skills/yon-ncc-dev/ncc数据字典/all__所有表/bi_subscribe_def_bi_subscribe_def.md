# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7340.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_def | pk_def | pk_def | char(20) | √ |
| 2 | conditionsetting | conditionsetting | conditionsetting | blob |
| 3 | defcode | defcode | defcode | varchar2(50) |
| 4 | defname | defname | defname | varchar2(300) |
| 5 | defname2 | defname2 | defname2 | varchar2(300) |
| 6 | defname3 | defname3 | defname3 | varchar2(300) |
| 7 | defname4 | defname4 | defname4 | varchar2(300) |
| 8 | defname5 | defname5 | defname5 | varchar2(300) |
| 9 | defname6 | defname6 | defname6 | varchar2(300) |
| 10 | environmentsetting | environmentsetting | environmentsetting | blob |
| 11 | extpushproperty | extpushproperty | extpushproperty | blob |
| 12 | note | note | note | varchar2(1024) |
| 13 | pk_dir | pk_dir | pk_dir | varchar2(20) |  |  | '~' |
| 14 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 15 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 16 | pushsetting | pushsetting | pushsetting | blob |
| 17 | pushtype | pushtype | pushtype | varchar2(20) |
| 18 | receiver | receiver | receiver | varchar2(200) |
| 19 | timesetting | timesetting | timesetting | blob |
| 20 | creationtime | creationtime | creationtime | char(19) |
| 21 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 22 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 23 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 24 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 25 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |