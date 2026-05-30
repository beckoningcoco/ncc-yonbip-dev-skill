# |<<

**计划来源反查表体 (mm_posrcreverse_b / nc.vo.mmpps.planbusi.sr.entity.PoSrcReverseItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3743.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cppsdemandid | 需求来源明细 | cppsdemandid | varchar(0) | √ | 需求来源明细 (mm_calcdemand) |
| 2 | cpoid | 计划订单 | cpoid | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 计划组织最新版本 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_org_v | 计划组织 | pk_org_v | varchar(20) |  | 组织_版本信息 (org_v) |
| 6 | fdemandtype | 需求来源 | fdemandtype | int |  | 需求类型 (DemandType) |  | 0=销售订单; |