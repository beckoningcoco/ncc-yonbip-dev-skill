# |<<

**按单反向跟踪处理 (mm_reverseot / nc.vo.mmdp.reverseot.Entity.ReverseOTVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3767.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reverseot | 按单反向跟踪处理主键 | pk_reverseot | char(32) | √ | 主键 (UFID) |
| 2 | parentid | 父项id | parentid | char(32) |  | 主键 (UFID) |
| 3 | levelcode | 层码 | levelcode | int |  | 整数 (Integer) |
| 4 | stageno | 层级编码 | stageno | int |  | 整数 (Integer) |
| 5 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | type | 类型 | type | int |  | 类型 (RevTypeEnum) |  | 0=需求预留; |