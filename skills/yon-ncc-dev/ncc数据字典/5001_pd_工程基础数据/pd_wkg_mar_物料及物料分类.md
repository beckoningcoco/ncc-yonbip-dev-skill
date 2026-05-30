# |<<

**物料及物料分类 (pd_wkg_mar / nc.vo.pd.wk.wkg.entity.WkgItemMarVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4393.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wkg_mar | 物料及物料分类 | pk_wkg_mar | char(20) | √ | 主键 (UFID) |
| 2 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 3 | cmaterialvid | 物料 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | cmeasureid | 主单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 5 | castmeasureid | 生产单位 | castmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 6 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | vchangerate | 换算率 | vchangerate | varchar(50) |  | 字符串 (String) |
| 9 | cmaterialclassid | 物料分类 | cmaterialclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 10 | abilityoccupy | 工时 | abilityoccupy | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | timeunit | 时间单位 | timeunit | int |  | 时间单位 (TimeUnitEnum) |  | 1=小时; |