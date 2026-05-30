# |<<

**分配成本组件结构 (bd_CostCompStrucDistri / nc.vo.bd.costcompstruc.entity.CostCompStrucDistriVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/410.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_distribute | 分配成本组件结构 | pk_distribute | char(20) | √ | 主键 (UFID) |
| 2 | pk_costcompstruc | 成本组件结构 | pk_costcompstruc | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_book | 核算账簿 | pk_book | varchar(20) |  | 账簿_核算账簿 (accbook) |
| 5 | distriorg | 业务单元 | distriorg | varchar(20) |  | 组织 (org) |
| 6 | distriorg_v | 业务单元多版本 | distriorg_v | varchar(20) |  | 组织_版本信息 (org_v) |