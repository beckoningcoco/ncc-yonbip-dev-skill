# |<<

**应付票据贴现 (fbm_buyerdiscount / nc.vo.fbm.buyerdiscount.BuyerDiscountVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2117.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_buyerdiscount | 主键 | pk_buyerdiscount | char(20) | √ | 主键 (UFID) |
| 2 | pk_billtypecode | 单据类型 | pk_billtypecode | varchar(20) |  | 字符串 (String) |
| 3 | pk_billtypeid | 单据类型主属性 | pk_billtypeid | varchar(20) |  | 字符串 (String) |
| 4 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 5 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 7 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 8 | doperatedate | 制单日期 | doperatedate | char(19) |  | 日期 (UFDate) |
| 9 | approver | 审批人 | approver | varchar(20) |  | 用户 (user) |
| 10 | dapprovedate | 审批日期 | dapprovedate | char(19) |  | 日期 (UFDate) |
| 11 | vbillstatus | 单据状态 | vbillstatus | int |  | 单据状态 (BillstatusEnum) |  | 0=审批未通过; |