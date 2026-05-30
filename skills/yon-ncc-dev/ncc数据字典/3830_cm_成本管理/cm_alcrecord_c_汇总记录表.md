# |<<

**汇总记录表 (cm_alcrecord_c / nc.vo.cm.allocate.entity.record.AllocateRecordCollectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1440.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | calcrecord_cid | 分配事务记录 | calcrecord_cid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 工厂最新版本 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_org_v | 工厂 | pk_org_v | char(20) |  | 主键 (UFID) |
| 5 | calcrecordid | 分配事务 | calcrecordid | char(20) |  | 主键 (UFID) |
| 6 | isourcetype | 来源类型 | isourcetype | int |  | 来源类型(成本) (CMSourceTypeEnum) |  | 1=自制; |