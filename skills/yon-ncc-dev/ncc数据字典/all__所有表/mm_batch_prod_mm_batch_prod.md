# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9859.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prod | pk_prod | pk_prod | char(20) | √ |
| 2 | cmaterialid | cmaterialid | cmaterialid | varchar2(20) |  |  | '~' |
| 3 | cmaterialvid | cmaterialvid | cmaterialvid | varchar2(20) |  |  | '~' |
| 4 | csmaterialid | csmaterialid | csmaterialid | varchar2(20) |  |  | '~' |
| 5 | csmaterialvid | csmaterialvid | csmaterialvid | varchar2(20) |  |  | '~' |
| 6 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 7 | vinbatchcode | vinbatchcode | vinbatchcode | varchar2(50) |
| 8 | vinbatchcodeid | vinbatchcodeid | vinbatchcodeid | varchar2(20) |
| 9 | vpbatchcode | vpbatchcode | vpbatchcode | varchar2(50) |
| 10 | vpbatchcodeid | vpbatchcodeid | vpbatchcodeid | varchar2(20) |
| 11 | creationtime | creationtime | creationtime | char(19) |
| 12 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 15 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |