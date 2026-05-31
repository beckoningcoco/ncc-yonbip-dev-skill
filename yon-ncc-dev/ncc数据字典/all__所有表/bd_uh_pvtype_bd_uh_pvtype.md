# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7208.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pvtype | pk_pvtype | pk_pvtype | char(20) | √ |
| 2 | code | code | code | varchar2(50) |
| 3 | father_pk | father_pk | father_pk | varchar2(20) |  |  | '~' |
| 4 | flag_active | flag_active | flag_active | char(1) |
| 5 | flag_cred | flag_cred | flag_cred | char(1) |
| 6 | flag_sys | flag_sys | flag_sys | char(1) |
| 7 | innercode | innercode | innercode | varchar2(50) |
| 8 | name | name | name | varchar2(200) |
| 9 | pk_group | pk_group | pk_group | varchar2(20) |  |  | '~' |
| 10 | pk_org | pk_org | pk_org | varchar2(20) |  |  | '~' |
| 11 | pk_udcate | pk_udcate | pk_udcate | char(20) |
| 12 | suffix | suffix | suffix | varchar2(50) |
| 13 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 14 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |