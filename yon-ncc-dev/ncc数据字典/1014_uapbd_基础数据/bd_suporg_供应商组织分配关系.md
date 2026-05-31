# |<<

**供应商组织分配关系 (bd_suporg / nc.vo.bd.supplier.suporg.SupOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/977.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_suporg | 主键 | pk_suporg | char(20) | √ | 主键 (UFID) |
| 2 | pk_supplier | 供应商 | pk_supplier | varchar(20) | √ | 供应商基本信息 (supplier) |
| 3 | pk_org | 已分配组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | enablestate | 启用状态 | enablestate | int | √ | 启用状态 (enablestate) |  | 1=未启用; |