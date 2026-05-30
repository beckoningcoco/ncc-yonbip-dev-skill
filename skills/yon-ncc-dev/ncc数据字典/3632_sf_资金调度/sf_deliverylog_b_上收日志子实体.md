# |<<

**上收日志子实体 (sf_deliverylog_b / nc.vo.sf.deliverylog.DeliveryLogBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5262.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_deliverylog_b | 上收日志子实体标识 | pk_deliverylog_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_financeorg | 缴款单位 | pk_financeorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_financeorg_v | 缴款单位版本 | pk_financeorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_bankacc_p | 单位帐号 | pk_bankacc_p | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 5 | accbalance | 账户余额 | accbalance | decimal(28, 8) |  | 金额 (UFMoney) |
| 6 | bankname_p | 缴款银行 | bankname_p | varchar(20) |  | 银行档案 (bankdoc) |
| 7 | deliverydate | 上收日期 | deliverydate | char(19) |  | 日期 (UFDate) |
| 8 | deliverytime | 上收时间 | deliverytime | char(19) |  | 日期时间 (UFDateTime) |
| 9 | deliverytype | 上收类型 | deliverytype | int |  | 上收规则常量 (deliveryruleenum) |  | 1=保留余额上收; |