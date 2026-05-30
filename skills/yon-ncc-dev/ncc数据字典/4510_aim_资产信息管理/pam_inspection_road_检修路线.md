# |<<

**检修路线 (pam_inspection_road / nc.vo.aim.inspectionroad.InspectionRoadHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4263.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inspection_road | 检修路线主键 | pk_inspection_road | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 维修组织版本 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 4 | pk_org_v | 维修组织 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 5 | busi_type | 业务类型 | busi_type | varchar(20) |  | 业务流程 (BusitypeVO) |
| 6 | bill_status | 单据状态 | bill_status | int |  | 单据状态 (billstatus) |  | 0=自由态; |