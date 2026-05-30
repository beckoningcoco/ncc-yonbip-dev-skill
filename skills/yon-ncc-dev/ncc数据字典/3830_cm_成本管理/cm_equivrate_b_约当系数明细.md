# |<<

**约当系数明细 (cm_equivrate_b / nc.vo.cm.equivrate.entity.EquivrateItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1471.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cequivrate_bid | 约当系数明细 | cequivrate_bid | char(20) | √ | 主键 (UFID) |
| 2 | cequivrateid | 主约当系数 | cequivrateid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | nequivrate | 约当系数 | nequivrate | decimal(20, 8) |  | 数值 (UFDouble) |