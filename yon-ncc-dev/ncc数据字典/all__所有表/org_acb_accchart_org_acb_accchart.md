# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_relaccchart | pk_relaccchart | pk_relaccchart | char(20) | √ |
| 2 | beginperiod | beginperiod | beginperiod | varchar2(50) |
| 3 | endperiod | endperiod | endperiod | varchar2(50) |
| 4 | pk_accchart | pk_accchart | pk_accchart | varchar2(20) | √ |
| 5 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 6 | pk_beginperiod | pk_beginperiod | pk_beginperiod | varchar2(20) | √ |
| 7 | pk_endperiod | pk_endperiod | pk_endperiod | varchar2(20) |  |  | '~' |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |