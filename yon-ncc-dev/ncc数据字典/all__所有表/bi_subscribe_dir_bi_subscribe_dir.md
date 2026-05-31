# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7341.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_dir | pk_dir | pk_dir | char(20) | √ |
| 2 | dirname | dirname | dirname | varchar2(300) |
| 3 | dirname2 | dirname2 | dirname2 | varchar2(300) |
| 4 | dirname3 | dirname3 | dirname3 | varchar2(300) |
| 5 | dirname4 | dirname4 | dirname4 | varchar2(300) |
| 6 | dirname5 | dirname5 | dirname5 | varchar2(300) |
| 7 | dirname6 | dirname6 | dirname6 | varchar2(300) |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 10 | pk_parent | pk_parent | pk_parent | varchar2(20) |  |  | '~' |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |