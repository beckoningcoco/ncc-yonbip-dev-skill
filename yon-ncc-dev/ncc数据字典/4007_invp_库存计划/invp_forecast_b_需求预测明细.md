# |<<

**需求预测明细 (invp_forecast_b / nc.vo.invp.forecast.entity.ForecastBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3136.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_forecast_b | 预测明细主键 | pk_forecast_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cmaterialoid | 物料OID | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 8 | vreqyear | 需求年 | vreqyear | varchar(10) |  | 字符串 (String) |
| 9 | dreqdate | 需求日期 | dreqdate | char(19) |  | 日期 (UFDate) |
| 10 | vreq | 需求周 | vreq | varchar(10) |  | 字符串 (String) |
| 11 | vreqmonth | 需求月 | vreqmonth | varchar(10) |  | 字符串 (String) |
| 12 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |