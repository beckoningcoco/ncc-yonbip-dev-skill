# |<<

**催款语气主表 (arap_notice / nc.vo.arap.reminder.ArapNoticeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/187.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice | 催款语气pk | pk_notice | varchar(20) | √ | 字符串 (String) |
| 2 | beizhu | 备注 | beizhu | varchar(100) |  | 字符串 (String) |
| 3 | code | 编码 | code | varchar(28) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 5 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 6 | pk_curr | 币种 | pk_curr | varchar(20) |  | 币种 (currtype) |
| 7 | pk_timecontrol | 控制时间 | pk_timecontrol | varchar(20) |  | 字符串 (String) |
| 8 | type | 类型 | type | int |  | 催款语气类型 (enum) |  | 1=账龄; |