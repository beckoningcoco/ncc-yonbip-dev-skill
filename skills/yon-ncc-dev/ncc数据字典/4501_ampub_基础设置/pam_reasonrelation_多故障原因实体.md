# |<<

**多故障原因实体 (pam_reasonrelation / nc.vo.am.failurereasonrelation.FailureReasonRelation)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reasonrelation | 多故障原因实体主键 | pk_reasonrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_failure_reason | 故障原因标示 | pk_failure_reason | varchar(50) |  | 字符串 (String) |
| 3 | pk_source | 来源主键 | pk_source | varchar(50) | √ | 字符串 (String) |