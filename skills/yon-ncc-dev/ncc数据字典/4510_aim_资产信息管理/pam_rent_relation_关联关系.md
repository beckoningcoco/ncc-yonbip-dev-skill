# |<<

**关联关系 (pam_rent_relation / nc.vo.aim.rent.monitor.RentMonitorSheetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4314.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rent_relation | 主键 | pk_rent_relation | varchar(20) | √ | 字符串 (String) |
| 2 | pk_rentmonitor_b | 主控图信息主键 | pk_rentmonitor_b | varchar(20) |  | 字符串 (String) |
| 3 | pk_target | 关联对象主键 | pk_target | varchar(20) |  | 字符串 (String) |
| 4 | room_name | 房间名称 | room_name | varchar(80) |  | 字符串 (String) |
| 5 | lease_status | 租赁状态 | lease_status | int |  | 整数 (Integer) |
| 6 | is_equip | 关联对象 | is_equip | varchar(50) |  | 关联对象 (RelationEnum) |  | 0=资产卡片; |