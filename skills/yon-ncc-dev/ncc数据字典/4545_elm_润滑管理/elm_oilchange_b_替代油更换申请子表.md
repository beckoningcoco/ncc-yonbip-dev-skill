# |<<

**替代油更换申请子表 (elm_oilchange_b / nc.vo.elm.lubrchange.LubrChangeBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1798.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lubrchange_b | 替代油更换申请子表主键 | pk_lubrchange_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本信息 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_equip | 资产 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 6 | lubr_location | 润滑部位 | lubr_location | varchar(20) |  | 润滑卡片子表 (LubrCardBodyVO) |
| 7 | pk_replace_oil | 替代用油编码 | pk_replace_oil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 8 | pk_applyreplaceoil | 申请替代用油编码 | pk_applyreplaceoil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 9 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 10 | def1 | 自定义项1 | def1 | varchar(101) |  | 自定义项 (Custom) |
| 11 | def2 | 自定义项2 | def2 | varchar(101) |  | 自定义项 (Custom) |
| 12 | def3 | 自定义项3 | def3 | varchar(101) |  | 自定义项 (Custom) |
| 13 | def4 | 自定义项4 | def4 | varchar(101) |  | 自定义项 (Custom) |
| 14 | def5 | 自定义项5 | def5 | varchar(101) |  | 自定义项 (Custom) |
| 15 | def6 | 自定义项6 | def6 | varchar(101) |  | 自定义项 (Custom) |
| 16 | def7 | 自定义项7 | def7 | varchar(101) |  | 自定义项 (Custom) |
| 17 | def8 | 自定义项8 | def8 | varchar(101) |  | 自定义项 (Custom) |
| 18 | def9 | 自定义项9 | def9 | varchar(101) |  | 自定义项 (Custom) |
| 19 | def10 | 自定义项10 | def10 | varchar(101) |  | 自定义项 (Custom) |
| 20 | def11 | 自定义项11 | def11 | varchar(101) |  | 自定义项 (Custom) |
| 21 | def12 | 自定义项12 | def12 | varchar(101) |  | 自定义项 (Custom) |
| 22 | def13 | 自定义项13 | def13 | varchar(101) |  | 自定义项 (Custom) |
| 23 | def14 | 自定义项14 | def14 | varchar(101) |  | 自定义项 (Custom) |
| 24 | def15 | 自定义项15 | def15 | varchar(101) |  | 自定义项 (Custom) |
| 25 | def16 | 自定义项16 | def16 | varchar(101) |  | 自定义项 (Custom) |
| 26 | def17 | 自定义项17 | def17 | varchar(101) |  | 自定义项 (Custom) |
| 27 | def18 | 自定义项18 | def18 | varchar(101) |  | 自定义项 (Custom) |
| 28 | def19 | 自定义项19 | def19 | varchar(101) |  | 自定义项 (Custom) |
| 29 | def20 | 自定义项20 | def20 | varchar(101) |  | 自定义项 (Custom) |