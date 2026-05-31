# |<<

**抽样计划表 (qc_sampleplan / nc.vo.qc.sampleplan.entity.SamplePlanHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4866.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_sampleplan | 抽样计划表 | pk_sampleplan | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 质检中心 | pk_org | varchar(20) |  | 组织_业务单元_质检中心 (qccenter) |
| 4 | vplancode | 抽样计划表编码 | vplancode | varchar(50) |  | 字符串 (String) |
| 5 | vplanname | 抽样计划表名称 | vplanname | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | aql | AQL | aql | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | vchecklevel | 检验水平 | vchecklevel | varchar(50) |  | 字符串 (String) |
| 8 | vmemo | 备注 | vmemo | varchar(50) |  | 字符串 (String) |