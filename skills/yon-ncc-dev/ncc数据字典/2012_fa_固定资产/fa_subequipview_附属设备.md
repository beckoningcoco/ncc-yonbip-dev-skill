# |<<

**附属设备 (fa_subequipview / nc.vo.fa.asset.SubequipViewVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2066.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_subequip | 主键 | pk_subequip | char(20) | √ | 主键 (UFID) |
| 2 | equip_code | 设备编码 | equip_code | varchar(40) |  | 字符串 (String) |
| 3 | equip_name | 设备名称 | equip_name | varchar(80) |  | 字符串 (String) |
| 4 | spec | 规格型号 | spec | varchar(80) |  | 字符串 (String) |
| 5 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 6 | quantity | 数量 | quantity | int |  | 整数 (Integer) |
| 7 | originvalue | 价值 | originvalue | decimal(28, 8) |  | 金额 (UFMoney) |
| 8 | begin_date | 使用日期 | begin_date | char(19) |  | 日期 (UFDate) |
| 9 | usedstatue | 使用情况 | usedstatue | varchar(200) |  | 字符串 (String) |
| 10 | alter_reason | 变动原因 | alter_reason | varchar(20) |  | 原因 (reason) |
| 11 | alter_date | 变动日期 | alter_date | char(19) |  | 日期 (UFDate) |
| 12 | remark | 备注 | remark | varchar(200) |  | 字符串 (String) |
| 13 | pk_card | 卡片主键 | pk_card | char(20) |  | 主键 (UFID) |