# |<<

**委托收款书主实体 (fts_gathering / nc.vo.fts.commissiongathering.GatheringVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2310.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_gathering | 委托收款书主实体标识 | pk_gathering | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 委托收款书号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型编码 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_org_v | 所属资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | pk_fundgetorg | 收款资金组织 | pk_fundgetorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 9 | pk_fundgetorg_v | 收款资金组织版本 | pk_fundgetorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 10 | pk_transactorg | 办理资金组织 | pk_transactorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 11 | pk_transactorg_v | 办理资金组织版本 | pk_transactorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 12 | sourcebusitype | 流程名称 | sourcebusitype | varchar(50) |  | 字符串 (String) |
| 13 | billstatus | 单据状态 | billstatus | int |  | 委托收款书单据状态 (billstatus) |  | 0=待提交; |