# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/11537.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ctperm_detail | pk_ctperm_detail | pk_ctperm_detail | char(20) | √ |
| 2 | configtype | configtype | configtype | number(38, 0) | √ |
| 3 | ownerconfig | ownerconfig | ownerconfig | varchar2(20) |  |  | '~' |
| 4 | pk_operation | pk_operation | pk_operation | varchar2(20) |  |  | '~' |
| 5 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 6 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |