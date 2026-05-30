# |<<

**实际独立需求 (mm_aid / nc.vo.mmdp.aid.entity.AIDVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_aid | 实际独立需求ID | pk_aid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 5 | cdemandorgid | 需求组织最新版本 | cdemandorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | cdemandorgvid | 需求组织 | cdemandorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | fdemandbilltype | 需求单据类型 | fdemandbilltype | int |  | 需求单据类型 (DemandBillTypeEnum) |  | 1=销售订单; |