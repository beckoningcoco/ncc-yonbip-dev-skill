# |<<

**资产盘点表体 (pam_inventory_b / nc.vo.aum.inventory.InventoryBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4269.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_inventory_b | 表体主键 | pk_inventory_b | char(20) | √ | 主键 (UFID) |
| 2 | rowno | 行号 | rowno | varchar(30) |  | 字符串 (String) |
| 3 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 4 | equip_name | 设备名称 | equip_name | varchar(600) |  | 多语文本 (MultiLangText) |
| 5 | pk_equip | 设备主键 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 6 | bar_code | 条形码 | bar_code | varchar(40) |  | 字符串 (String) |
| 7 | spec | 规格 | spec | varchar(400) |  | 字符串 (String) |
| 8 | model | 型号 | model | varchar(400) |  | 字符串 (String) |
| 9 | issettled | 是否已处理 | issettled | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | ischecked | 是否盘到 | ischecked | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | check_result | 盘点结果 | check_result | int |  | 盘点结果 (EInvResult) |  | 0=相符; |