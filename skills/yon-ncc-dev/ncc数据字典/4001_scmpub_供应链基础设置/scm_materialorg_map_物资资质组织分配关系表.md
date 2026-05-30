# |<<

**物资资质组织分配关系表 (scm_materialorg_map / nc.vo.scmpub.materialqualiorg_map.MaterialorgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5223.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_materialorg | 主键 | pk_materialorg | char(50) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | pk_invqualifi | 物资资质档案 | pk_invqualifi | varchar(20) |  | 物资资质 (InvqualifiHVO) |
| 6 | enablestatus | 启用状态 | enablestatus | int |  | 启用状态 (enablestate) |  | 1=未启用; |