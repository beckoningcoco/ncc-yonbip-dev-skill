# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8557.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_settledrule | pk_settledrule | pk_settledrule | char(20) | √ |
| 2 | applink | applink | applink | varchar2(200) |
| 3 | appname | appname | appname | varchar2(100) |
| 4 | code | code | code | varchar2(50) |
| 5 | enabled | enabled | enabled | char(1) |
| 6 | handler | handler | handler | varchar2(20) |  |  | '~' |
| 7 | name | name | name | varchar2(200) |
| 8 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 9 | precheckitem | precheckitem | precheckitem | varchar2(200) |
| 10 | requiretime | requiretime | requiretime | varchar2(50) |
| 11 | sendmessage | sendmessage | sendmessage | char(1) |
| 12 | systypecode | systypecode | systypecode | varchar2(20) |
| 13 | tasktype | tasktype | tasktype | number(38, 0) |
| 14 | creator | creator | creator | varchar2(20) |  |  | '~' |
| 15 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 16 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |