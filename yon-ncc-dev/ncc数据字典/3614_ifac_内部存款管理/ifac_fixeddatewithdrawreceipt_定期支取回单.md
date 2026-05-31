# |<<

**定期支取回单 (ifac_fixeddatewithdrawreceipt / nc.vo.ifac.fixeddatewithdrawreceipt.FixedDateWithdrawReceiptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3087.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_receipt | 主键 | pk_receipt | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vbillcode | 回单编号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 8 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 9 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | pk_depositorg | 资金组织 | pk_depositorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 11 | depositorgname | 存款单位名称 | depositorgname | varchar(200) |  | 字符串 (String) |
| 12 | pk_depositacc | 定期账户 | pk_depositacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 13 | pk_depositreceipt | 存单号 | pk_depositreceipt | varchar(20) |  | 定期存单 (DepositReceipt) |
| 14 | billstate | 单据状态 | billstate | varchar(50) |  | 定期支取回单单据状态 (FixedDataWithDrawReceiptStateEnum) |  | N=未记账; |