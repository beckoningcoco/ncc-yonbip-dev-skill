# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/7005.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_commondata | pk_commondata | pk_commondata | char(20) | √ |
| 2 | operationcode | operationcode | operationcode | varchar2(50) |
| 3 | pk_doc | pk_doc | pk_doc | char(20) | √ |
| 4 | pk_group | pk_group | pk_group | char(20) |
| 5 | pk_org | pk_org | pk_org | char(20) | √ |
| 6 | pk_user | pk_user | pk_user | char(20) | √ |
| 7 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 8 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |