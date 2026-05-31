# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6726.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_account_dist | pk_account_dist | pk_account_dist | char(20) | √ |
| 2 | isdeleted | isdeleted | isdeleted | char(1) |
| 3 | iseditflag | iseditflag | iseditflag | char(1) | √ |
| 4 | pk_accchart | pk_accchart | pk_accchart | char(20) | √ |
| 5 | pk_accsystem | pk_accsystem | pk_accsystem | char(20) |
| 6 | pk_group | pk_group | pk_group | char(20) |
| 7 | syscatalogcode | syscatalogcode | syscatalogcode | varchar2(512) | √ |
| 8 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 9 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |