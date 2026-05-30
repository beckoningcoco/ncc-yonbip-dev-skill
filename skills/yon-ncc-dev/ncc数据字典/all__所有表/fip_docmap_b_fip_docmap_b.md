# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8313.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmap_b | pk_docmap_b | pk_docmap_b | char(20) | √ |
| 2 | des_code | des_code | des_code | varchar2(500) |
| 3 | docentity | docentity | docentity | varchar2(36) |  |  | '~' |
| 4 | pk_docmap | pk_docmap | pk_docmap | char(20) | √ |
| 5 | src_code | src_code | src_code | varchar2(500) |
| 6 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 7 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |