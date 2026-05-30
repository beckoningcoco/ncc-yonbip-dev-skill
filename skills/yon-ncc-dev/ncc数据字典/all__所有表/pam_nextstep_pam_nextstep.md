# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/10416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_nextstep | pk_nextstep | pk_nextstep | char(20) | √ |
| 2 | bill_type | bill_type | bill_type | varchar2(30) |
| 3 | body_metapath | body_metapath | body_metapath | varchar2(30) |
| 4 | ck_bill_name | ck_bill_name | ck_bill_name | varchar2(50) |
| 5 | ck_bill_type | ck_bill_type | ck_bill_type | varchar2(30) |
| 6 | ck_classname | ck_classname | ck_classname | varchar2(80) |
| 7 | isdelete | isdelete | isdelete | char(1) |
| 8 | isupdate | isupdate | isupdate | char(1) |
| 9 | pk_transi | pk_transi | pk_transi | char(20) | √ |
| 10 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 11 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |