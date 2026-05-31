# |<<

**按单正向跟踪处理 (mm_ordertrack / nc.vo.mmdp.ot.entity.OrderTrackVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3717.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ot | 按单正向跟踪处理 | pk_ot | char(100) | √ | 主键 (UFID) |
| 2 | parentid | 父项ID | parentid | varchar(200) |  | 主键 (UFID) |
| 3 | levelcode | 层码 | levelcode | int |  | 整数 (Integer) |
| 4 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 5 | pk_org | 需求/供给组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_org_v | 需求/供给组织版本 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 7 | fbilltype | 单据类型 | fbilltype | int |  | 单据类型 (DTDocTypeEnum) |  | 0=存量; |