# |<<

**已评价单据评价明细 (sscsfm_evaluated_detail / nc.vo.sscsfm.sfmpub.EvaluatedDetailVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5623.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 唯一标识 | pk_detail | char(20) | √ | 主键 (UFID) |
| 2 | pk_evaluated | 评价结果主键 | pk_evaluated | char(20) |  | 字符串 (String) |
| 3 | pk_rule | 评价规则主键 | pk_rule | varchar(20) |  | 满意度管理评价规则 (sscsfm_evaluation_rule) |
| 4 | pk_dimension | 评价维度 | pk_dimension | varchar(20) |  | 评价维度 (sscsfm_evaluation_dimension) |
| 5 | pk_reason | 不满意原因 | pk_reason | varchar(20) |  | 不满意原因 (sscsfm_unsatisfied_reason) |
| 6 | result | 评价结果 | result | char(1) |  | 评价结果 (evaluation_result_enum) |  | 1=非常不满意; |