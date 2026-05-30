# |<<

**应收票据退票表 (fbm_rreturn / nc.vo.fbm.rreturn.RReturnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2157.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rreturn | 主键 | pk_rreturn | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | returntype | 退票类型 | returntype | varchar(50) |  | 应收票据退票类型 (RreturntypeEnum) |  | gather=收票退票; |