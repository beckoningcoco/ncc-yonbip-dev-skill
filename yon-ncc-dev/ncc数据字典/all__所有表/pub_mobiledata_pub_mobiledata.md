# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10933.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mobiledata | pk_mobiledata | pk_mobiledata | char(20) | √ |
| 2 | billid | billid | billid | varchar2(20) |  |  | '~' |
| 3 | billtype | billtype | billtype | varchar2(20) |  |  | '~' |
| 4 | bizcentercode | bizcentercode | bizcentercode | varchar2(50) |
| 5 | bizdatetime | bizdatetime | bizdatetime | char(19) |
| 6 | cmd | cmd | cmd | varchar2(4) |
| 7 | groupid | groupid | groupid | varchar2(20) |
| 8 | groupnumber | groupnumber | groupnumber | varchar2(50) |
| 9 | hycode | hycode | hycode | varchar2(20) |
| 10 | langcode | langcode | langcode | varchar2(20) |
| 11 | mobile | mobile | mobile | varchar2(20) |
| 12 | pk_sid | pk_sid | pk_sid | varchar2(10) |
| 13 | userdatasource | userdatasource | userdatasource | varchar2(50) |
| 14 | userid | userid | userid | varchar2(20) |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |