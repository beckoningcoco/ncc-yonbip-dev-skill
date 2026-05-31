# |<<

**定期利息回单 (fac_perintercpt / nc.vo.fac.perintercpt.PerInteRcptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2104.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_fixintrestrecpt | 主键 | pk_fixintrestrecpt | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 6 | pk_costcenter | 成本中心 | pk_costcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | vbillcode | 单据号 | vbillcode | varchar(20) |  | 字符串 (String) |
| 8 | pk_depositbank | 存款银行 | pk_depositbank | varchar(20) |  | 银行档案 (bankdoc) |
| 9 | pk_depositreceipt | 存单号 | pk_depositreceipt | varchar(20) |  | 银行定期存单 (depositreceipt) |
| 10 | pk_depositacc | 定期账户 | pk_depositacc | varchar(20) |  | 银行账户子户 (bankaccsub) |
| 11 | billstate | 单据状态 | billstate | int |  | 银行存款单据状态 (BankBillStatus) |  | 1=已记账; |