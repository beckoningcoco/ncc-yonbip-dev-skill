# |<<

**贷款利息调整 (cdmc_loaninterestadjust / nc.vo.cdmc.cdm.loaninterestadjust.LoanInterestadjustVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1390.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_loaninterestadjust | 主键 | pk_loaninterestadjust | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | busistatus | 单据状态 | busistatus | int |  | 贷款利息调整单据类型 (LoanInterestadjustBillStatusEnum) |  | 1=待提交; |