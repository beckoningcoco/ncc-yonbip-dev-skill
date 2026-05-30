# |<<

**费用清单 (fbm_expenselist / nc.vo.pfbm.expenselist.ExpenselistVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2131.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expenselist | 主键 | pk_expenselist | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 4 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 5 | billdetailnum | 清单编号 | billdetailnum | varchar(20) |  | 字符串 (String) |
| 6 | pk_chargorg | 计费单位 | pk_chargorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 7 | pk_chargorg_v | 计费单位版本 | pk_chargorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 8 | pk_billtype | 单据类型 | pk_billtype | varchar(20) |  | 字符串 (String) |
| 9 | pk_billtypecode | 单据类型编码 | pk_billtypecode | varchar(50) |  | 字符串 (String) |
| 10 | detalisttype | 清单类型 | detalisttype | varchar(50) |  | 清单类型 (DetalistTypeEnum) |  | occupancy=占用费; |