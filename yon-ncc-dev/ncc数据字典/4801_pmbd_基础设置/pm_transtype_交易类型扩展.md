# |<<

**交易类型扩展 (pm_transtype / nc.vo.pm.transtype.TransTypeExtendVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4547.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transtype | 交易类型扩展主键 | pk_transtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | transtype_code | 交易类型编码 | transtype_code | varchar(20) |  | 字符串 (String) |
| 4 | pay_mode | 支付模式 | pay_mode | int |  | 支付模式 (paymodeenum) |  | 1=协议付款; |