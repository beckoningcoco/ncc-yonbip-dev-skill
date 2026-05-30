# |<<

**加油记录子表 (elm_aorecord_b / nc.vo.elm.addoilrecord.AddOilRecordBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_addoilrecord_b | 加油记录表体主键 | pk_addoilrecord_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | pk_equip | 资产卡片 | pk_equip | varchar(20) |  | 设备卡片 (EquipHeadVO) |
| 6 | pk_lubrcard | 润滑卡片 | pk_lubrcard | varchar(20) |  | 润滑卡片 (LubrCardHeadVO) |
| 7 | lubr_location | 润滑部位 | lubr_location | varchar(50) |  | 字符串 (String) |
| 8 | lubr_count | 润滑点数 | lubr_count | int |  | 整数 (Integer) |
| 9 | pk_stated_oil | 规定用油 | pk_stated_oil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 10 | pk_replace_oil | 替代用油 | pk_replace_oil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 11 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 12 | addoil_period | 加油周期 | addoil_period | int |  | 整数 (Integer) |
| 13 | addoil_period_unit | 加油周期单位 | addoil_period_unit | int |  | 加油周期单位 (AddCycleunit) |  | 0=小时; |