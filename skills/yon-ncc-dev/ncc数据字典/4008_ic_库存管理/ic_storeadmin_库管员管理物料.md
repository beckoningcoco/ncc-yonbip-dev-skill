# |<<

**库管员管理物料 (ic_storeadmin / nc.vo.ic.mstoreadmin.StoreadminVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2979.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstoreadminid | 库管员管理物料主键 | cstoreadminid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | cwhsmanagerid | 库管员 | cwhsmanagerid | varchar(20) | √ | 人员基本信息 (psndoc) |
| 5 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) | √ | 仓库 (stordoc) |
| 6 | cinventoryclassid | 物料分类 | cinventoryclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | cinventoryid | 物料 | cinventoryid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | cdptid | 部门 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | bincludesub | 是否包含下级部门 | bincludesub | char(1) |  | 布尔类型 (UFBoolean) |