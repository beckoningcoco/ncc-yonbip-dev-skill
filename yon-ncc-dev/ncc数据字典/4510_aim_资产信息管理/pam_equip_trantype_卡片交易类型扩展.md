# |<<

**卡片交易类型扩展 (pam_equip_trantype / nc.vo.aim.equipex.EquipTypeExVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4251.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transitypeex | 交易类型扩展主键 | pk_transitypeex | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_category | 设备类别 | pk_category | varchar(20) |  | 设备类别 (CategoryVO) |
| 4 | transtypecode | 交易类型编码 | transtypecode | varchar(30) |  | 字符串 (String) |