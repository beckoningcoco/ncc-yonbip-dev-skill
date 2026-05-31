# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11638.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_super_user | pk_super_user | pk_super_user | char(20) | √ |
| 2 | admcode | admcode | admcode | varchar2(50) | √ |
| 3 | admname | admname | admname | varchar2(50) | √ |
| 4 | identify | identify | identify | varchar2(20) |
| 5 | islocked | islocked | islocked | nchar(5) |  |  | 'false' |
| 6 | oldpwd1 | oldpwd1 | oldpwd1 | varchar2(50) |
| 7 | oldpwd2 | oldpwd2 | oldpwd2 | varchar2(50) |
| 8 | oldpwd3 | oldpwd3 | oldpwd3 | varchar2(50) |
| 9 | password | password | password | varchar2(50) | √ |
| 10 | pwdinuse | pwdinuse | pwdinuse | char(19) |
| 11 | pwdlvl | pwdlvl | pwdlvl | varchar2(20) |
| 12 | dr | dr | dr | char(1) |  |  | '0' |
| 13 | ts | ts | ts | char(19) |  |  | TO_CHAR(SYSDATE,'yyyy-mm-dd hh24:mi:ss') |