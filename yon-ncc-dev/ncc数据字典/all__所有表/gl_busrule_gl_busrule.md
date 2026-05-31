# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_busrule | pk_busrule | pk_busrule | char(20) | √ |
| 2 | busrulecode | busrulecode | busrulecode | char(20) |
| 3 | busrulename | busrulename | busrulename | char(40) |
| 4 | memo | memo | memo | char(20) |
| 5 | pk_accountingbook | pk_accountingbook | pk_accountingbook | varchar2(50) |
| 6 | pk_group | pk_group | pk_group | varchar2(50) |
| 7 | pk_org | pk_org | pk_org | varchar2(50) |
| 8 | pk_setofbook | pk_setofbook | pk_setofbook | varchar2(20) |  |  | '~' |
| 9 | pk_unit | pk_unit | pk_unit | char(20) |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |