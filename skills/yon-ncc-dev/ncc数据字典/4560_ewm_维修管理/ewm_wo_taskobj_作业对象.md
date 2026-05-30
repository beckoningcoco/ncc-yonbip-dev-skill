# |<<

**作业对象 (ewm_wo_taskobj / nc.vo.ewm.workorder.WOTaskObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1974.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_taskobj | 主键 | pk_wo_taskobj | char(20) | √ | 主键 (UFID) |
| 2 | sequence_num | 对象序号 | sequence_num | int |  | 整数 (Integer) |
| 3 | pk_equip | 设备编码 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 4 | pk_location | 位置编码 | pk_location | varchar(20) |  | 位置 (location) |
| 5 | allocationstatus | 分摊状态 | allocationstatus | int |  | 分摊状态 (AllocationSatus) | 1 | 1=未分摊; |