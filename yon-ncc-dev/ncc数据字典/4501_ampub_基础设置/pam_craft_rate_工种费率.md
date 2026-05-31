# |<<

**工种费率 (pam_craft_rate / nc.vo.am.craftrate.CraftRateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4241.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_craft_rate | 工种费率主键 | pk_craft_rate | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 维修组织 | pk_org | varchar(20) |  | 组织_业务单元_维修组织 (maintainorg) |
| 3 | pk_org_v | 维修组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_维修组织版本信息 (maintainorg_v) |
| 4 | pk_craft | 工种编码 | pk_craft | varchar(20) |  | 工种 (craft) |
| 5 | craft_rate | 工种费率 | craft_rate | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |