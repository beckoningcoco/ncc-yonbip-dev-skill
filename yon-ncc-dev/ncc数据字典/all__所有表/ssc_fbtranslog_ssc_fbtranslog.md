# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11949.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_translog | pk_translog | pk_translog | char(20) | √ |
| 2 | pur_billid | pur_billid | pur_billid | char(20) |
| 3 | pur_billtypecd | pur_billtypecd | pur_billtypecd | varchar2(50) |
| 4 | src_billid | src_billid | src_billid | char(20) |
| 5 | src_billtypecd | src_billtypecd | src_billtypecd | varchar2(50) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |