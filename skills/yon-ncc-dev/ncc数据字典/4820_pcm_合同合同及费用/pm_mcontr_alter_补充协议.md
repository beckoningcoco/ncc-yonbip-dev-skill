# |<<

**补充协议 (pm_mcontr_alter / nc.vo.pcm.martcontalter.MContr_AlterHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4486.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mcontr_alter | 补充协议主键 | pk_mcontr_alter | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 3 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | bill_type | 单据类型 | bill_type | varchar(50) |  | 字符串 (String) |
| 6 | pk_transitype | 交易类型 | pk_transitype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 7 | transi_type | 交易类型编码 | transi_type | varchar(50) |  | 字符串 (String) |
| 8 | busi_type | 业务流程 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 9 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |