# |<<

**满意度管理评价规则 (sscsfm_evaluation_rule / nc.vo.sscsfm.sfmpub.EvaluationRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5625.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_rule | 唯一标识 | pk_rule | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心主键 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | memo | 备注 | memo | varchar(200) |  | 字符串 (String) |
| 6 | auto_evaluation_days | 自动评价天数 | auto_evaluation_days | int |  | 整数 (Integer) |
| 7 | auto_evaluation_result | 自动评价结果 | auto_evaluation_result | char(1) |  | 评价结果 (evaluation_result_enum) |  | 1=非常不满意; |