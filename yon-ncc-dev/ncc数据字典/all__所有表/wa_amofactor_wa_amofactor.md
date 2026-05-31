# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/12851.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amofactor | pk_amofactor | pk_amofactor | char(20) | √ |
| 2 | factor_doc_name | factor_doc_name | factor_doc_name | varchar2(50) |
| 3 | factor_doc_pk | factor_doc_pk | factor_doc_pk | char(20) | √ |
| 4 | factor_value_name | factor_value_name | factor_value_name | varchar2(2048) |
| 5 | factor_value_pk | factor_value_pk | factor_value_pk | varchar2(2048) |
| 6 | pk_amoscheme | pk_amoscheme | pk_amoscheme | char(20) | √ |
| 7 | priority | priority | priority | number(38, 0) |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |