# |<<

**内部转账单主实体 (fts_innertransfer_h / nc.vo.fts.innertransfer.InnerTransferVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2315.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertransfer_h | 内转单主实体ID | pk_innertransfer_h | char(20) | √ | 主键 (UFID) |
| 2 | vbillno | 内转单号 | vbillno | varchar(50) |  | 字符串 (String) |
| 3 | pk_billtype | 单据类型编码 | pk_billtype | varchar(21) |  | 字符串 (String) |
| 4 | pk_billtypeid | 单据类型标识 | pk_billtypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_org_v | 所属资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | pk_transactorg | 办理资金组织 | pk_transactorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 9 | pk_transactorg_v | 办理资金组织版本 | pk_transactorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 10 | pk_transact_group | 办理组织所属集团 | pk_transact_group | varchar(20) |  | 组织_集团 (group) |
| 11 | pk_fundorg_p | 付款资金组织 | pk_fundorg_p | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 12 | pk_fundorg_p_v | 付款资金组织版本 | pk_fundorg_p_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 13 | pk_fundorg_r | 收款资金组织 | pk_fundorg_r | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 14 | pk_fundorg_r_v | 收款资金组织版本 | pk_fundorg_r_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 15 | pk_original | 起始内部转账单标识 | pk_original | varchar(20) |  | 字符串 (String) |
| 16 | transfertype | 转账类型 | transfertype | varchar(30) |  | 转账类型 (transfertype) |  | SCenterReceiveNSUnit=同中心收方发起转账; |