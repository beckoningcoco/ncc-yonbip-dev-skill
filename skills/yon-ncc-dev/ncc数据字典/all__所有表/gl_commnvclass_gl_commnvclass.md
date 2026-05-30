# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8450.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commnvclass | pk_commnvclass | pk_commnvclass | char(20) | √ |
| 2 | name | name | name | varchar2(40) | √ |
| 3 | pk_accountingbook | pk_accountingbook | pk_accountingbook | char(20) | √ |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | varchar2(50) |
| 6 | property | property | property | varchar2(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |