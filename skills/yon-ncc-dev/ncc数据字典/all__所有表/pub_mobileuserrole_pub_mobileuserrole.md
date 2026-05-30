# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10936.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_userrole | pk_userrole | pk_userrole | char(20) | √ |
| 2 | pk_mobileuser | pk_mobileuser | pk_mobileuser | char(20) | √ |
| 3 | pk_responsibility | pk_responsibility | pk_responsibility | varchar2(20) |  |  | '~' |
| 4 | type | type | type | varchar2(50) |
| 5 | value | value | value | varchar2(255) |
| 6 | creationtime | creationtime | creationtime | char(19) |
| 7 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | modifiedtime | modifiedtime | modifiedtime | char(19) |
| 10 | modifier | modifier | modifier | varchar2(20) |  |  | '~' |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |