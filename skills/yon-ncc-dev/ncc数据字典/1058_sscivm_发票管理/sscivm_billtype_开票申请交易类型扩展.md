# |<<

**开票申请交易类型扩展 (sscivm_billtype / nc.vo.sscivm.ivsale.IVBilltypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5539.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | sscivmbilltypeid | 交易类型扩展ID | sscivmbilltypeid | char(20) | √ | 主键 (UFID) |
| 2 | isatuo_submit | 是否自动提交 | isatuo_submit | char(2) |  | 布尔类型 (UFBoolean) |
| 3 | isatuo_invoice | 是否自动开票 | isatuo_invoice | char(2) |  | 布尔类型 (UFBoolean) |
| 4 | pk_billtype | 交易类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 5 | billtypecode | 交易类型编码 | billtypecode | varchar(20) |  | 字符串 (String) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 字符串 (String) |
| 7 | pk_org | 财务组织 | pk_org | varchar(20) |  | 字符串 (String) |