# |<<

**供应商资质组织分配关系 (scm_supquaorg_map / nc.vo.scmpub.supquaorg.SupquaorgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5231.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supquaorg_map | 主键 | pk_supquaorg_map | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 分配组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_supplierquali | 供应商资质 | pk_supplierquali | varchar(20) |  | 供应商资质 (SupplierQualiHVO) |
| 6 | enablestate | 启用状态 | enablestate | varchar(50) |  | 启用状态 (enablestate) |  | 1=未启用; |