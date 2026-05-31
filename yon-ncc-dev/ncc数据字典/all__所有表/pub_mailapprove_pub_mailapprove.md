# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10930.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk | pk | pk | char(20) | √ |
| 2 | billid | billid | billid | varchar2(20) |
| 3 | billtype | billtype | billtype | varchar2(50) |
| 4 | dsname | dsname | dsname | varchar2(50) |
| 5 | sessid | sessid | sessid | varchar2(100) |
| 6 | tomail | tomail | tomail | varchar2(100) |
| 7 | usercode | usercode | usercode | varchar2(200) |
| 8 | userid | userid | userid | varchar2(20) |
| 9 | username | username | username | varchar2(400) |
| 10 | userpwd | userpwd | userpwd | varchar2(200) |
| 11 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 12 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |