# |<<

**说明书 (om_booklet / nc.vo.om.booklet.BookletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3926.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_booklet | 主键 | pk_booklet | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | booklet_type | 类型 | booklet_type | int |  | 说明书类型枚举 (BookletTypeEnum) |  | 0=职务; |