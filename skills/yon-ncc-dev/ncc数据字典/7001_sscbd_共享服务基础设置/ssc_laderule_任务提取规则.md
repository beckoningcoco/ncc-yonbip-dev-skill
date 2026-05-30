# |<<

**任务提取规则 (ssc_laderule / nc.vo.ssc.task.laderule.SSCLadeRuleVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5518.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_laderule | 主键 | pk_laderule | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_共享服务中心 (sscorg) |
| 4 | seqno | 序号 | seqno | int |  | 整数 (Integer) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 7 | remark | 备注 | remark | varchar(50) |  | 字符串 (String) |
| 8 | ladetype | 提取方式 | ladetype | varchar(50) |  | 提取方式 (SSCLadeTypeEnum) |  | 0=不限制提取; |