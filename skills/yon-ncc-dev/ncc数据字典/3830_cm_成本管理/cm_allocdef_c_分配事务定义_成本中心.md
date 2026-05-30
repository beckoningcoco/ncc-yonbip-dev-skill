# |<<

**分配事务定义_成本中心 (cm_allocdef_c / nc.vo.cm.allocdef.entity.CostCenterItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | callocdef_cid | 成本中心子项 | callocdef_cid | char(20) | √ | 主键 (UFID) |
| 2 | callocdefid | 间接费用分配定义 | callocdefid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | ccostcenterid | 接收成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | cctcgroupid | 接收成本中心组 | cctcgroupid | varchar(20) |  | 成本中心组 (costcentergroup) |