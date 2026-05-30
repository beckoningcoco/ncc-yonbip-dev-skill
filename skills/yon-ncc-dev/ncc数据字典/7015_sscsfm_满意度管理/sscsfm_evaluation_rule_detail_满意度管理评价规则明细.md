# |<<

**满意度管理评价规则明细 (sscsfm_evaluation_rule_detail / nc.vo.sscsfm.sfmpub.EvaluationRuleDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5626.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule_detail | 唯一标识 | pk_rule_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_rule | 规则主键 | pk_rule | char(20) |  | 字符串 (String) |
| 3 | pk_value | 主键内容 | pk_value | varchar(20) |  | 字符串 (String) |
| 4 | type | 类型 | type | int |  | 整数 (Integer) |
| 5 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 6 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 7 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 8 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |