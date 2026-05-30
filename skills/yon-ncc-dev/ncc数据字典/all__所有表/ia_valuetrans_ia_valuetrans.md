# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8988.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cvaluetransid | cvaluetransid | cvaluetransid | char(20) | √ |
| 2 | cdestorgid | cdestorgid | cdestorgid | varchar2(20) |  |  | '~' |
| 3 | cdestorgvid | cdestorgvid | cdestorgvid | varchar2(20) |  |  | '~' |
| 4 | csrcorgid | csrcorgid | csrcorgid | varchar2(20) |  |  | '~' |
| 5 | csrcorgvid | csrcorgvid | csrcorgvid | varchar2(20) |  |  | '~' |
| 6 | ftransmodeflag | ftransmodeflag | ftransmodeflag | number(38, 0) |
| 7 | pk_book | pk_book | pk_book | varchar2(20) |  |  | '~' |
| 8 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 9 | creationtime | creationtime | creationtime | char(19) |
| 10 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 13 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |