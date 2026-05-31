# |<<

**工程变更现场更新 (mm_ecohandle / nc.vo.ecn.eco.entity.EcohandleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3682.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ecohandle | 工程变更现场更新表体主键 | pk_ecohandle | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | vbilltype | 单据类型 | vbilltype | varchar(50) |  | 单据类型 (EcoHandleBillTypeEnum) |  | 55A2=流程生产订单; |