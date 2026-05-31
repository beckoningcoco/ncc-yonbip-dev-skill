# |<<

**费用预提单 (er_accrued / nc.vo.erm.accruedexpense.AccruedVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1870.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_accrued_bill | 主键 | pk_accrued_bill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_billtype | 单据类型 | pk_billtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_tradetype | 交易类型编号 | pk_tradetype | varchar(50) |  | 字符串 (String) |
| 6 | pk_tradetypeid | 交易类型 | pk_tradetypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | billno | 单据编号 | billno | varchar(50) |  | 字符串 (String) |
| 8 | billdate | 单据日期 | billdate | char(19) |  | 日期 (UFDate) |
| 9 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 10 | billstatus | 单据状态 | billstatus | int |  | 单据状态 (accruedbillstatus) |  | 0=暂存; |