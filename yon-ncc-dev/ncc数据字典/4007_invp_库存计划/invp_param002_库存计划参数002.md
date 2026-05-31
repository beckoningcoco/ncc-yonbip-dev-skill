# |<<

**库存计划参数002 (invp_param002 / nc.vo.invp.pub.entity.Invp002VO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3141.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invp002 | 参数主键 | pk_invp002 | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | fcycle | 预测周期 | fcycle | int |  | 预测周期 (ForecastPriod) |  | 1=日; |