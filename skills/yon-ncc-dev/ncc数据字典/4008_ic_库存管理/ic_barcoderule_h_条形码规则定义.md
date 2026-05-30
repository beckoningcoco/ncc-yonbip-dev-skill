# |<<

**条形码规则定义 (ic_barcoderule_h / nc.vo.ic.barcoderule.BarCodeRuleHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2886.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbarcoderulhid | 条形码规则定义主表主键 | cbarcoderulhid | char(20) | √ | 主键 (UFID) |
| 2 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 3 | vcode | 规则编码 | vcode | varchar(30) |  | 字符串 (String) |
| 4 | vname | 规则名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | ilength | 总长度 | ilength | int |  | 整数 (Integer) |
| 6 | ibarcodetype | 条形码类型 | ibarcodetype | varchar(50) | √ | 条形码类型 (BarCodeRuleTypeEnum) |  | 1=箱条码; |