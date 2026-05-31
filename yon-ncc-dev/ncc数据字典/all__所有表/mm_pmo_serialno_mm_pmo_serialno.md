# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/9935.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mo_serialno | pk_mo_serialno | pk_mo_serialno | char(20) | √ |
| 2 | breport | breport | breport | char(1) |
| 3 | cmoid | cmoid | cmoid | char(20) | √ |
| 4 | cserialnoid | cserialnoid | cserialnoid | varchar2(50) |  |  | '~' |
| 5 | csnastunitid | csnastunitid | csnastunitid | varchar2(20) |  |  | '~' |
| 6 | csnunitid | csnunitid | csnunitid | varchar2(20) |  |  | '~' |
| 7 | nsnastnum | nsnastnum | nsnastnum | number(28, 8) |
| 8 | nsnnum | nsnnum | nsnnum | number(28, 8) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_org_v | pk_org_v | pk_org_v | varchar2(20) |  |  | '~' |
| 12 | vsncode | vsncode | vsncode | varchar2(128) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |