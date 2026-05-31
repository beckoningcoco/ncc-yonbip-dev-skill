# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7538.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bconfer | pk_bconfer | pk_bconfer | char(20) | √ |
| 2 | afterclass | afterclass | afterclass | varchar2(100) |
| 3 | busitype | busitype | busitype | char(20) |  |  | '~' |
| 4 | docontrol | docontrol | docontrol | number(38, 0) |
| 5 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 6 | receivers | receivers | receivers | varchar2(101) |
| 7 | scomment | scomment | scomment | varchar2(150) |
| 8 | sourcebill | sourcebill | sourcebill | varchar2(20) |  |  | '~' |
| 9 | sourceorg | sourceorg | sourceorg | varchar2(20) |  |  | '~' |
| 10 | sourceorg_v | sourceorg_v | sourceorg_v | char(20) |  |  | '~' |
| 11 | targetbill | targetbill | targetbill | varchar2(20) |  |  | '~' |
| 12 | targetorg | targetorg | targetorg | varchar2(20) |  |  | '~' |
| 13 | targetorg_v | targetorg_v | targetorg_v | char(20) |  |  | '~' |
| 14 | creationtime | creationtime | creationtime | char(19) |
| 15 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 16 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 17 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 18 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 19 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |