# |<<

**需求预测 (invp_forecast / nc.vo.invp.forecast.entity.ForecastHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3135.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_forecast | 预测主键 | pk_forecast | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | fcycle | 预测周期 | fcycle | int |  | 预测周期 (ForecastPriod) |  | 1=日; |