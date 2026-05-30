# |<<

**点检子表 (emm_pointcheck_b / nc.vo.emm.dailypc.DailyPCBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1817.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_pointcheck_b | 子表主键 | pk_pointcheck_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 序号 | rowno | varchar(50) |  | 字符串 (String) |
| 3 | pk_equip | 设备 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 4 | pk_location | 位置 | pk_location | varchar(20) |  | 位置 (location) |
| 5 | pk_pcstd_b | 点检标准 | pk_pcstd_b | varchar(20) |  | 点检标准子表 (emm_pcstd_b) |
| 6 | pc_position | 点检部位 | pc_position | varchar(80) |  | 字符串 (String) |
| 7 | pc_item | 点检项目 | pc_item | varchar(100) |  | 字符串 (String) |
| 8 | pc_content | 点检内容 | pc_content | varchar(200) |  | 字符串 (String) |
| 9 | pc_method | 点检方法 | pc_method | varchar(100) |  | 字符串 (String) |
| 10 | std_need | 标准要求 | std_need | varchar(200) |  | 字符串 (String) |
| 11 | pc_estate | 点检状态 | pc_estate | int |  | 点检状态 (PCstatenum) |  | 1=运行或停运; |