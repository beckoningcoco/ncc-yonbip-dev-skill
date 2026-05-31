# |<<

**润滑卡片子表 (elm_lubrcard_b / nc.vo.elm.lubrcard.LubrCardBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lubrcard_b | 润滑卡片子表主键 | pk_lubrcard_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 资产组织 | pk_org | varchar(20) |  | 组织_业务单元_资产组织 (assetorg) |
| 4 | pk_org_v | 资产组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资产组织版本信息 (assetorg_v) |
| 5 | lubr_location | 润滑部位 | lubr_location | varchar(50) |  | 字符串 (String) |
| 6 | lubr_count | 润滑点数 | lubr_count | int |  | 整数 (Integer) | 1 |
| 7 | lubr_method | 润滑方式 | lubr_method | varchar(20) |  | 润滑方式 (lubrmethod) |
| 8 | pk_stated_oil | 规定用油 | pk_stated_oil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 9 | pk_replace_oil | 替代用油 | pk_replace_oil | varchar(20) |  | 润滑油定义 (lubedefinition) |
| 10 | unit | 计量单位 | unit | varchar(20) |  | 计量单位 (measdoc) |
| 11 | addoil_period | 加油周期 | addoil_period | int |  | 整数 (Integer) |
| 12 | addoil_period_unit | 加油周期单位 | addoil_period_unit | int |  | 加油周期单位 (AddCycleunit) |  | 0=小时; |