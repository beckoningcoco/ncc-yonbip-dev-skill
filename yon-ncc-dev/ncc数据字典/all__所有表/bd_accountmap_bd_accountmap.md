# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6725.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accmap | pk_accmap | pk_accmap | char(20) | √ |
| 2 | mapstatus | mapstatus | mapstatus | number(38, 0) | √ |  | 1 |
| 3 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) |  |  | '~' |
| 4 | pk_newaccount | pk_newaccount | pk_newaccount | varchar2(20) |
| 5 | pk_oldaccount | pk_oldaccount | pk_oldaccount | varchar2(20) |  |  | '~' |
| 6 | pk_oldaccounthis | pk_oldaccounthis | pk_oldaccounthis | varchar2(40) |  |  | '~' |
| 7 | pk_oldchart | pk_oldchart | pk_oldchart | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |