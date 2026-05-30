# |<<

**子设备 (pam_equip / nc.vo.aim.equip.SubEquipVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4248.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_equip | 设备编码 | pk_equip | char(20) | √ | 设备卡片 (EquipHeadVO) |
| 2 | fk_parent | 父设备 | fk_parent | varchar(20) |  | 设备卡片 (EquipHeadVO) |