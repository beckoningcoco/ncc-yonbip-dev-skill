# |<<

**资产评估结果项目 (ipmbd__assertevalresult / nc.vo.ipmbd.assertevalresult.AssertEvalResultVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3220.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_assertevalresult | 资产评估结果项目主键 | pk_assertevalresult | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | pk_org_v | 财务组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 5 | code | 编码 | code | varchar(50) | √ | 字符串 (String) |
| 6 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 7 | collectitems | 汇总项 | collectitems | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | collectto | 汇总至 | collectto | varchar(20) |  | 资产评估结果项目 (AssertEvalResultVO) |
| 9 | collectionway | 汇总方式 | collectionway | varchar(50) |  | 资产评估结果项目-汇总方式 (CollectionWay) |  | 1=正数; |