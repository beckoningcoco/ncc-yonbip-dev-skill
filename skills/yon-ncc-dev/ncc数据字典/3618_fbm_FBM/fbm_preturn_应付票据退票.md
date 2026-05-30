# |<<

**应付票据退票 (fbm_preturn / nc.vo.fbm.preturn.PReturnVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2144.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_preturn | 主键 | pk_preturn | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | returntype | 退票类型 | returntype | varchar(50) |  | 应付票据退票类型 (PreturntypeEnum) |  | sign=付票退票; |