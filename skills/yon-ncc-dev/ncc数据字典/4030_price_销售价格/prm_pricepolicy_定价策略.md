# |<<

**定价策略 (prm_pricepolicy / nc.vo.price.pricepolicy.entity.PricePolicyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4665.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pricepolicy | 定价策略 | pk_pricepolicy | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) | √ | 组织_业务单元_销售组织 (salesorg) |
| 4 | vcode | 定价策略编码 | vcode | varchar(30) |  | 字符串 (String) |
| 5 | vname | 定价策略名称 | vname | varchar(76) |  | 多语文本 (MultiLangText) |
| 6 | pk_priceprocess | 定价过程 | pk_priceprocess | varchar(20) |  | 定价过程主实体 (priceprocess) |
| 7 | pk_tariffdef | 价目表定义 | pk_tariffdef | varchar(20) |  | 价目表定义 (TariffDefHVO) |
| 8 | fbasediscountflag | 基准折扣表所属销售组织 | fbasediscountflag | int |  | 显示方式 (showpattern) | 1 | 1=本销售组织; |