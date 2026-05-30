# |<<

**施工许可证 (pm_construction_permit / nc.vo.phm.constructionpermit.ConstructionPermitHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_construction_permit | 主键 | pk_construction_permit | char(20) | √ | 主键 (UFID) |
| 2 | engineering_name | 工程名称 | engineering_name | varchar(100) |  | 字符串 (String) |
| 3 | construction_address | 建设地址 | construction_address | varchar(100) |  | 字符串 (String) |
| 4 | construction_scale | 建设规模（㎡） | construction_scale | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | design_unit | 设计单位 | design_unit | varchar(100) |  | 字符串 (String) |
| 6 | construction_permit_code | 施工许可证编号 | construction_permit_code | varchar(50) |  | 字符串 (String) |
| 7 | construction_unit | 施工单位 | construction_unit | varchar(100) |  | 字符串 (String) |
| 8 | construction_control_unit | 监理单位 | construction_control_unit | varchar(100) |  | 字符串 (String) |
| 9 | contract_start_date | 合同开工日期 | contract_start_date | char(19) |  | 日期 (UFDate) |
| 10 | contract_end_date | 合同竣工日期 | contract_end_date | char(19) |  | 日期 (UFDate) |
| 11 | pk_org | 项目组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_项目组织 (itemorg) |
| 12 | pk_org_v | 项目组织 | pk_org_v | varchar(20) |  | 组织_业务单元_项目组织版本信息 (itemorg_v) |
| 13 | bill_code | 单据号 | bill_code | varchar(40) |  | 字符串 (String) |
| 14 | bill_status | 单据状态 | bill_status | int |  | 项目管理单据状态 (pmbillstatus) |  | -1=自由态; |