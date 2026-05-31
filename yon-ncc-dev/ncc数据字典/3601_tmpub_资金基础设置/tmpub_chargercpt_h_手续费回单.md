# |<<

**手续费回单 (tmpub_chargercpt_h / nc.vo.tmpub.chargercpt.ChargeRcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5758.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_chargercpt_h | 手续费回单主表主键 | pk_chargercpt_h | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 手续费回单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_org_v | 所属组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | paydate | 付款日期 | paydate | char(19) |  | 日期 (UFDate) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | pk_bankacc | 支付账户 | pk_bankacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | busitype | 业务类型 | busitype | varchar(50) |  | 手续费回单业务类型 (手续费回单业务类型) |  | open=开证; |