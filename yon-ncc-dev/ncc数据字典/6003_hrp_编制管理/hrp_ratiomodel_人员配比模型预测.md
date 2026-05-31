# |<<

**人员配比模型预测 (hrp_ratiomodel / nc.vo.hrp.forecast.RatioModelVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2745.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ratiomodel | 预测模型主键 | pk_ratiomodel | char(20) | √ | 主键 (UFID) |
| 2 | forecast_code | 预测编码 | forecast_code | varchar(28) | √ | 字符串 (String) |
| 3 | forecast_name | 预测名称 | forecast_name | varchar(200) | √ | 多语文本 (MultiLangText) |
| 4 | forecast_object | 预测对象 | forecast_object | varchar(20) | √ | 组织 (org) |
| 5 | verify_state | 审核状态 | verify_state | int | √ | 审核状态 (verifyState) |  | 0=未审核; |