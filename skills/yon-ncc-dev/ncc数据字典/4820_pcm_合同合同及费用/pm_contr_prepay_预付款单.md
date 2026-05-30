# |<<

**预付款单 (pm_contr_prepay / nc.vo.pcm.contractprepay.ContractPrepayHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_prepay | 合同预付主键 | pk_prepay | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_contr | 合同编码 | pk_contr | varchar(20) |  | 付款合同 (contractheadvo) |
| 4 | supp_transactor | 供应商经办人 | supp_transactor | varchar(40) |  | 字符串 (String) |
| 5 | curr_prepay_mny | 预付金额 | curr_prepay_mny | decimal(28, 8) |  | 金额 (UFMoney) | 0 |
| 6 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |