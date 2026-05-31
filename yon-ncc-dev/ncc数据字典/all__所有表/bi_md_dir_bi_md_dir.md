# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | guid | guid | guid | char(20) | √ |
| 2 | assetindustry | assetindustry | assetindustry | varchar2(20) |  |  | '~' |
| 3 | assetlayer | assetlayer | assetlayer | varchar2(10) |  |  | '4' |
| 4 | dirname | dirname | dirname | varchar2(300) |
| 5 | dirname2 | dirname2 | dirname2 | varchar2(300) |
| 6 | dirname3 | dirname3 | dirname3 | varchar2(300) |
| 7 | dirname4 | dirname4 | dirname4 | varchar2(300) |
| 8 | dirname5 | dirname5 | dirname5 | varchar2(300) |
| 9 | dirname6 | dirname6 | dirname6 | varchar2(300) |
| 10 | pguid | pguid | pguid | varchar2(20) |  |  | '~' |
| 11 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 12 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 13 | creationtime | creationtime | creationtime | char(19) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 17 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 18 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |