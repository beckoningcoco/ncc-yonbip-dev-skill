# |<<

**工艺变更单明细 (pd_ecn_b / nc.vo.ecn.eco.routing.entity.EcnItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4355.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cecn_bid | 工程变更单明细 | cecn_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 主键 (UFID) |
| 3 | pk_org | 计划组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cmaterialid | 物料编码 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 6 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | vrtversion | 变更版本 | vrtversion | varchar(20) |  | 工艺路线主表 (pd_rt) |
| 8 | bdefault | 变更为默认 | bdefault | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | fchangetype | 变更版本类型为 | fchangetype | int | √ | 变更版本类型 (FChangeTypeEnum) | 1 | 1=有效版本; |