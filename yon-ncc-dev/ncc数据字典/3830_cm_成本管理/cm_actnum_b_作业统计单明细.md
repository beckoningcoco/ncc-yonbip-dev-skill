# |<<

**作业统计单明细 (cm_actnum_b / nc.vo.cm.activitynum.entity.ActivityNumItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1437.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cactnum_bid | 作业统计单明细 | cactnum_bid | char(20) | √ | 主键 (UFID) |
| 2 | cactnumid | 作业统计单 | cactnumid | char(20) |  | 主键 (UFID) |
| 3 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 4 | nnum | 作业量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | istatus | 状态 | istatus | int |  | 分配状态 (CMAllocStatusEnum) | 0 | 0=未分配; |