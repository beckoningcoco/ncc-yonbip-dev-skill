# |<<

**库存计划明细 (invp_plan_b / nc.vo.invp.plan.entity.PlanBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3143.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plan_b | 主键 | pk_plan_b | varchar(40) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | dtfreqdate | 时格需求日期 | dtfreqdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 4 | ninitpabnum | 期初预计可用存量 | ninitpabnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | nreqnum | 实际需求量 | nreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nallocnum | 已分配量 | nallocnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nforecastnum | 预测 | nforecastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ngrossreqnum | 毛需求 | ngrossreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nscheduledrecnum | 计划接收量 | nscheduledrecnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | nnetreqnum | 净需求 | nnetreqnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | nplanreleasenum | 计划投入量 | nplanreleasenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | nplanrecnum | 计划产出量 | nplanrecnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nendpab | 期末预计可用存量 | nendpab | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | itimebucket | 时格顺序 | itimebucket | int |  | 整数 (Integer) |
| 15 | icycleth | 所属周期数 | icycleth | int |  | 整数 (Integer) |
| 16 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 17 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 18 | bshowred | 是否着重显示 | bshowred | char(1) |  | 布尔类型 (UFBoolean) |