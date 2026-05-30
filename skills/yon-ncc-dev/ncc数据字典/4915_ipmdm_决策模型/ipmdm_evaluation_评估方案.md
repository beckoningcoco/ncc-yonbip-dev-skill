# |<<

**评估方案 (ipmdm_evaluation / nc.vo.ipmdm.evaluation.EvaluationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3238.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_evaluation | 评估方案主键 | pk_evaluation | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | code | 编码 | code | varchar(50) |  | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | indicatorsystem | 指标体系 | indicatorsystem | varchar(20) |  | 指标体系 (IndexSysVO) |
| 8 | enablestate | 启用状态 | enablestate | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | scoreway | 评分方式 | scoreway | varchar(50) |  | 评分方式 (ScoreWay) |  | 1=满分制; |